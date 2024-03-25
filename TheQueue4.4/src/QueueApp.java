
public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// changed queue size to test sequence
		Queue theQueue = new Queue(10);  // queue holds 5 items
        
//	    theQueue.insert(10);            // insert 4 items
//	    theQueue.insert(20);
//	    theQueue.insert(30);
//	    theQueue.insert(40);
//
//	    theQueue.remove();              // remove 3 items
//	    theQueue.remove();              //    (10, 20, 30)
//	    theQueue.remove();
//
//	    theQueue.insert(50);            // insert 4 more items
//	    theQueue.insert(60);            //    (wraps around)
//	    theQueue.insert(70);
//	    theQueue.insert(80);
//	    theQueue.insert(90);
//	    theQueue.insert(100);
//	    
//	    theQueue.remove();              // remove 3 items
//	    theQueue.remove();              //    (10, 20, 30)
//	    theQueue.remove();
	    
//	    theQueue.insert(110);
//	    theQueue.insert(120);
//	    theQueue.insert(130);
	    
	    theQueue.display();
	    
	    if (!theQueue.isEmpty()) {
	    	
	    	System.out.print("Remove and display: ");
	    }
	    while( !theQueue.isEmpty() ) {    // remove and display
	                                     //    all items
	    	long n = theQueue.remove();  // (40, 50, 60, 70, 80)
	         System.out.print(n);
	         System.out.print(" ");
	         
	    }
	    System.out.println("");
	    
	    
	}  // end main()
} // end class QueueApp

