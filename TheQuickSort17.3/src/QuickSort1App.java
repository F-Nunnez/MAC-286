
public class QuickSort1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 16; // array size
		ArrayIns1 arr;
		arr = new ArrayIns1(maxSize); // create array
		for(int j=0; j<maxSize; j++) { // fill array with
			// random numbers
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		
		arr.display(); // display items
		arr.quickSort(); // quicksort them
		arr.display(); // display them again
	}

}
