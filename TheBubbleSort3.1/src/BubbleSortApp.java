
public class BubbleSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxSize = 100; // array size
		ArrayBub arr; // reference to array
		
		arr = new ArrayBub(maxSize);
		
		arr.insert(77);               // insert 10 items
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.insert(101);
		arr.insert(100);
		arr.insert(110);
		arr.insert(109);
		arr.insert(105);
		arr.insert(107);
		arr.insert(102);
		arr.insert(104);
		arr.insert(103);
		arr.insert(106);
		arr.display();
		
		//arr.bubbleSort(); // bubble sort them
        arr.oddEvenSort();
        arr.display();
		
	}// end main

} // end class BubbleSortApp
