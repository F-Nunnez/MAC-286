
public class LinkListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkList theList = new LinkList(); // make a new list
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		theList.displayList(); // display list
		
		while ( !theList.isEmpty() ) { // until it's empty,
			Link aLink = theList.deleteFirst(); // delete link
			System.out.print("Delete "); // display it
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayList(); // display list
	}
}
