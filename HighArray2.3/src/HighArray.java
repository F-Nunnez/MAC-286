
public class HighArray {
	private long[] a; // ref to array a
	private int nElems; // number of data items
	public HighArray(int max) { // constructor
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	public boolean find(long searchKey) {
		// find specified value
		int j;
		for (j = 0; j < nElems; j++) // for each element,
			if (a[j] == searchKey) // found item
				break; // exit loop before end
		if (j == nElems) // gone to end
			return false; // yes, can't find it
		else
			return true; // no, found it
	}// end find()
	public void insert(long value) { // put element into array
		a[nElems] = value; // insert it
		nElems++; // increment size
	}
	public boolean delete(long value) {
		int j;
		for (j = 0; j < nElems; j++) // look for it
			if(value == a[j])
				break;
		if (j == nElems) // can't find it
			return false;
		else { // found it
			for (int k = j; k < nElems; k++) // move higher ones down
				a[k] = a[k+1];
			nElems --; // decrement size
			return true;
		}
	}// end delete()
	public void removeMax() {
		long max = a[0];
		int i;
		for (i = 1; i < nElems; i++) {
			if (a[i] > max)
				max = a[i];
		}
		delete(max); // Called the delete method
	}
	public void display() { // display array contents
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
	public long getMax() { //get value
		long max = a[0];
		for (int i = 1; i < nElems; i++) {
			if (a[i] > max)
				max = a[i];
		}
		if (nElems == 0) { // no items yet ?
			return -1;
		} 
		return max;
	}
	public void reverse() { // display array contents in reverse
		for (int j = nElems-1; j >= 0; j--) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
	// Remove all all duplicates
	public void noDups() {
		int p; 
		for (int l = 0; l < nElems; l++) {
			for (p = 1; p < nElems; p++) {
				if (a[l] == a[p] && l != p) {
					a[l] = -1;
					delete(a[l]);
				}
			}
			System.out.print(a[l]+ " ");
		}
	}
} // end class HighArray
