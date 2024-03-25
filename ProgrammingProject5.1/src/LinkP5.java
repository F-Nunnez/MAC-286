
public class LinkP5 {
	
	public long dData; // data item
	public LinkP5 next; // next link in list
	
	public LinkP5(long dd) { // constructor
		dData = dd;
	}
	
	public void displayLink() { // display this link
		
		System.out.print(dData + " ");
	} // end class LinkP5
}
