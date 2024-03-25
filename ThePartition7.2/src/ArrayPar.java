
public class ArrayPar {
	
	private long[] theArray; // ref to array theArray
	private int nElems; // number of data items
	
	public ArrayPar(int max) {// constructor
		setTheArray(new long[max]); // create the array
		nElems = 0; // no items yet
	}
	
	public void insert(long value){ // put element into array
		getTheArray()[nElems] = value; // insert it
		nElems++; // increment size
	}
	
	public int size() { // return number of items
		return nElems;
	}
	
	public void display() {// displays array contents
		System.out.print("A=");
		for(int j=0; j<nElems; j++) // for each element,
		System.out.print(getTheArray()[j] + " "); // display it
		System.out.println("");
	}
	
	public int partitionIt(int left, int right, long pivot) {
		// Similar to quickSort1 in Listing 7.3
//		int leftPtr = left; 
		int leftPtr = left - 1; // right of first elem
		int rightPtr = right;
//		int rightPtr = right + 1; // left of pivot
		
		
		System.out.println("");
		System.out.println("leftPtr: "+leftPtr);
//		System.out.println("");
		System.out.println("rightPtr: "+rightPtr);
		
		while(true) {
		
			while(leftPtr < right && getTheArray()[++leftPtr] < pivot); // find bigger item // (nop)
			
			while(rightPtr > left && getTheArray()[--rightPtr] > pivot); // find smaller item // (nop)
			
			if(leftPtr >= rightPtr) {// if pointers cross,
				break; // partition done
			}else { // not crossed, so		
				swap(leftPtr, rightPtr); // swap elements
			}
		} // end while(true)
		swap(leftPtr, right); // restore pivot
		return leftPtr; // return partition
			
	} // end partitionIt()
	
	public void swap(int dex1, int dex2) {// swap two elements
		
		long temp;
		temp = getTheArray()[dex1]; // A into temp
		getTheArray()[dex1] = getTheArray()[dex2]; // B into A
		getTheArray()[dex2] = temp; // temp into B
	} // end swap()

	public long[] getTheArray() {
		return theArray;
	}

	public void setTheArray(long[] theArray) {
		this.theArray = theArray;
	}
}// end class ArrayPar
