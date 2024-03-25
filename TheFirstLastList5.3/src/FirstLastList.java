
public class FirstLastList {
	
	private Link3 first; // ref to first link
	private Link3 last; // ref to last link
	
	public FirstLastList() { // constructor
		first = null; // no links on list yet
		last = null;
	}
	
	public boolean isEmpty() { // true if no link
		return first == null;
	}
	
	public void insertFirst(long dd) { // insert at front of list
		
		Link3 newLink = new Link3(dd); // make a new link
		if (isEmpty()) { // if empty list,
			last = newLink; // newLink <-- last
		}
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}
	
	public void insertLast(long dd) {
		
		Link3 newLink = new Link3(dd); // make new list
		if ( isEmpty() ) { // if empty list
			first = newLink; // first --> newLink
		} else {
			last.next = newLink; // old last --> newLink
		}
		last = newLink; // newLink <-- last
	}
	
	public long deleteFirst() { // delete first link

		// assumes non-empty list
		long temp = first.dData;
		if (first.next == null) { // if only item
			last = null; // null <-- last
		}

		first = first.next; // if only one item
		return temp;
	}
	public void displayList() {
		
		System.out.print("List (first-->last): ");
		Link3 current = first; // start at beginning
		
		while (current != null) { // until end of list,
			
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
}
