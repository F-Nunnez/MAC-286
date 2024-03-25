
public class PriorityQAppP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQP5 thePQ = new PriorityQP5();

	      thePQ.insert(30);
	      thePQ.insert(50);
	      thePQ.insert(10);
	      thePQ.insert(40);
	      thePQ.insert(20);
	      
	      thePQ.remove();
	      thePQ.remove();
	      thePQ.remove();
	      thePQ.remove();
	      thePQ.remove();
	      
	      while( !thePQ.isEmpty() ) {
	    	  
	    	  long item = thePQ.remove();
		      System.out.print(item + " ");  // 10, 20, 30, 40, 50
	         
	      }  // end while
	      System.out.println("");

	}

}
