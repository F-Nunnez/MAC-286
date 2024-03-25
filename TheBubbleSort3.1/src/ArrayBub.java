
public class ArrayBub {
	
	private long[] a; // ref to array
	private int nElems; // number of data items
	
	public ArrayBub(int max) { // constructor
		
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	
	public void insert(long value) { // put element into array
		a[nElems] = value; // insert it
		nElems++; // increment size
	}
	
	public void display() { // display array contents
		for (int j = 0; j < nElems; j++) { // for each element,
			System.out.print(a[j] + " "); // display it
		}
		System.out.println(" ");
	}
	
	public void bubbleSort() {
		int out, in;
		
		for (out = nElems -1; out > 1; out--) { // outer loop backward
			for (in = 0; in < out; in++) { //inner loop forward
				if (a[in] > a[in+1]) { // out of order
					swap(in, in+1); // swap them
				} 
			}
		} // end bubbleSort()
	}
	// Assignment for Chap 3 (Programming project 3.4)
	public void oddEvenSort() {
		// Decided to use the steps formula s = log sub 2(nElems)
		// my prior constraints were over looping while(j != nElems).   
		double steps = Math.ceil(Math.log(nElems) / Math.log(2));
		System.out.println("Steps: "+steps);
		int j = 0;
		while (j != steps) {
			// First pass
			for (int i = 1; i < nElems -1; i+=2) {
//				System.out.println("Odd: "+i+" " );
				if (a[i] > a[i+1]) {
					swap(i, i+1);
				}
			}
			
			// Second pass
			for (int i = 0; i < nElems -1; i+=2) {
//				System.out.print("Even: "+i +" " );
				if (a[i] > a[i+1]) {
					swap(i, i+1);
				}
			}
			j++;
		}
		System.out.println("Counter j: "+j+", nElems: "+nElems);
	}
	
	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
} // end class ArrayBub
