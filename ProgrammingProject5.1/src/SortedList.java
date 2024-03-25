
public class SortedList {
	
	private LinkP5 first;  // ref to first item
	
	public SortedList() {  // constructor
		
     first = null;
    }
	
	public boolean isEmpty() {  // true if no links
		
		
		return (first == null);
    }
	
	public void insert(long key) {   // insert, in order
		
		LinkP5 newLink = new LinkP5(key);    // make new link
	    LinkP5 previous = null;            // start at first
	    LinkP5 current = first;
	                                       // until end of list,        
	    while(current != null && key > current.dData) {
	                                    // or key > current,
	    	previous = current;
		    current = current.next;   // go to next item
	    }
	    if(previous == null) {    // at beginning of list
	    	first = newLink;     // first --> newLink
	    }else {                  // not at beginning
	    	previous.next = newLink;  // old prev --> newLink
	    }
	    newLink.next = current;  // newLink --> old current
	    
	} // end insert()
	
	public LinkP5 remove() { // return and delete first link
		
		LinkP5 temp = first; // save first
		first = first.next; // delete first
		
		return temp;
	}
	
	public void displayList() {
    
	    LinkP5 current = first; // start at beginning of list
	    while(current != null) {  // until end of list,
	    	
	    	current.displayLink();   // print data
	        current = current.next;  // move to next link
	    }
    } // end class SortedList
}
