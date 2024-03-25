
public class Link2 {
	public int iData; // data item (key)
	public double dData; // data item
	public Link2 next; // next link in list
	
	public Link2(int id, double dd) { // constructor
		iData = id;
		dData = dd;
	}
	
	public void displayLink() { // display ourself
		System.out.print("{" + iData + ", " + dData + "} ");
	}
}
