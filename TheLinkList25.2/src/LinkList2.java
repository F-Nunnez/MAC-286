
public class LinkList2 {
	
	private Link2 first; // ref to first link on list
	
	public LinkList2() { // constructor
		first = null; // no links on list yet
	}
	
	public void insertFirst(int id, double dd) {
		// make a new link
		Link2 newLink = new Link2(id, dd);
		newLink.next = first; // it points to old first link
		first = newLink; // now first points to this
	}
	
	public Link2 find(int key) {
		// assumes non-empty list
		Link2 current = first; // start at first
		
		while (current.iData != key) {
			if (current.next == null) {
				return null; // if end of list,
			}else { // not end of list,
				current = current.next; // go to next link
			}
		}
		return current; // found it
	}
	
	public Link2 delete(int key) {
		// assume non-empty list
		Link2 current = first; // search for link
		Link2 previous = first;
		
		while (current.iData != key) {
			
			if(current.next == null) {
				return null; // didn't find it
			} else {
				previous = current; // go to next link
				current = current.next;
			}
		} // found it
		if (current == first) { // if first link,
			first = first.next; // change first
		} else { // otherwise,
			previous.next = current.next; // bypass it
		}
		return current;
	}
	
	public void displayList() { // display the list
		System.out.print("List (first-->last): ");
		Link2 current = first; // start at the beginning of list
		
		while (current != null) { // until end of list,
			
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
}
