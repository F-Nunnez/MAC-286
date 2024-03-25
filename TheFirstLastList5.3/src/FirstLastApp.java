
public class FirstLastApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// make a new list
		
		FirstLastList theList = new FirstLastList();
		
		theList.insertFirst(22); // insert at front
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		
		theList.displayList();
		theList.deleteFirst();
		theList.deleteFirst();
		theList.displayList(); // display again
	}
}
