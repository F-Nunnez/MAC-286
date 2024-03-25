
public class LinkListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkList2 theList = new LinkList2(); // make list
		
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
		theList.displayList(); // display
		
		Link2 f = theList.find(44); // find item
		if (f != null) { 
			System.out.println("Found link with key " + f.iData);
		} else {
			System.out.println("Can't find link");
		}
		
		//Link2 f2 = theList.find(45); // find item
		//if( f2 != null)
		//System.out.println("Found link with key " + f.iData);
		//else
//			System.out.println("Can’t find link");
		//
		Link2 d = theList.delete(66); // delete item
		if ( d != null) {
			System.out.println("Delete link with key " + d.iData);
		} else {
			System.out.println("Can't delete link");
		}
		theList.displayList(); // display list
	}
}
