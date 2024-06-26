
public class HighArrayApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 100; // array size
		HighArray arr; // reference to array
		arr = new HighArray(maxSize); // create the array
		arr.insert(77); // insert 10 items
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(44);
		arr.display(); // display items
		int searchKey = 35; // search for item
		if (arr.find(searchKey))
			System.out.println("Found "+ searchKey);
		else
			System.out.println("Can't find "+ searchKey);
		arr.delete(00);
		arr.delete(55);
		arr.delete(99);
		arr.display(); // display items again
		System.out.println(arr.getMax());
		arr.display(); // display items again
		//arr.delete(arr.getMax()); This is another way of deleting the highest key
		arr.removeMax();
		arr.display();
		System.out.println(arr.getMax());
		//arr.reverse();
		arr.noDups();
	} // end main()
} // end HighArrayApp
