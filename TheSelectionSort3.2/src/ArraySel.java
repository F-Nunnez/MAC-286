
public class ArraySel {
	
	private long[] a; // reff to array
	private int nElems; // number of data items
	
	public ArraySel(int max) { // constructor
		
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	
	public void insert(long value) { // put element into array
		a[nElems] = value; // insert it
		nElems ++; // increment size
	}
	
	public void display() { // display array contents
		for (int j = 0; j < nElems; j++) { // for each element,
			System.out.print(a[j] + " "); // display it
		}
		System.out.println("");
	}
	
	public void selectionSort() {
		int out, in, min;
		
		for (out = 0; out < nElems -1; out++) { // outer loop
			min = out; // minimum
			for (in = out+1; in < nElems; in++) { // inner loop
				if (a[in] < a[min]) { // if min greater,
					min = in; // we have a new min
				}
			}
			swap(out, min);
		} // end for out
	} // end SelectionSort
	
	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

}// end class ArraySel
