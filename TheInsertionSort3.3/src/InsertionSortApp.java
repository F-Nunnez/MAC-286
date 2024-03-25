
public class InsertionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxSize = 100; // array size
		ArrayIns arr; // ref to array
		arr = new ArrayIns(maxSize); // create the array
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.display(); // display items
		
		arr.insertionSort(); // insert-sort item
		
		arr.display(); // display item again
	}// end main()
} // end class InsertSortApp
