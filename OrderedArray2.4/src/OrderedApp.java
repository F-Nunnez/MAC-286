
public class OrderedApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxSize = 100; // array size
		OrdArray arr; // reference to array
		
		arr = new OrdArray(maxSize); // create the array
		
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
		
		int searchKey = 55; // seach for item
		if(arr.find(searchKey) != arr.size()) {
			System.out.println("Found "+searchKey);		
		} else {
			System.out.println("Can't find "+searchKey);
		}
		arr.display(); // display items
		
		arr.delete(00);
		arr.delete(55);
		arr.delete(99);
		
		arr.display();
		
	} //end main()
}//end class OrdArray
