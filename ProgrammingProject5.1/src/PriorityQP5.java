
public class PriorityQP5 {
	
	private SortedList theList;
	
	public PriorityQP5() { // constructor
		
		theList = new SortedList();
	}
	
	public void insert(long item) {
		// TBD - NEED TO DO INSERT HERE
		
		// Called the insert method from the SortedList class.
		theList.insert(item);
	}
	
	public long remove() {  // remove minimum item
    
        // TBD - THIS SHOULD REMOVE THE FIRST ITEM FROM AND LIST
		// AND RETURN THE DATA VALUE OF THE LINK REMOVED
		
		// remove first item (link)
		LinkP5 item = theList.remove();
		
		if (!isEmpty()) {
			return item.dData; 	
		}else {
			System.out.print(theList.isEmpty());
			return -1;
		}
		
		// return data value of link removed
	    //System.out.print("item: "+item.dData); 
		// This was the hardest part.
    }
	
	public boolean isEmpty() { // true if queue is empty
    
        // TBD - THIS SHOULD RETURN WHETHER THE QUEUE IS EMPTY OR NOT
		// Called the isEmpty method from the SortedList class
		return theList.isEmpty();	
    }
}
 