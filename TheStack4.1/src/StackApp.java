
public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackX theStack = new StackX(10);  // make new stack
        theStack.push(20);               // push items onto stack
	    theStack.push(40);
	    theStack.push(60);
	    theStack.push(80);
	    
	    while( !theStack.isEmpty() ) {     // until it's empty,
                                     
	    	long value = theStack.pop(); // delete item from stack
	    	System.out.print(value);      // display it
	        System.out.print(" ");
        
        }  // end while
	    System.out.println("");

	}// end class StackApp

}
