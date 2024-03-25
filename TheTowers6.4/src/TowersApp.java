
public class TowersApp {
	
	static int nDisks = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doTowers(nDisks, 'A', 'B', 'C');
	}
	
	public static void doTowers(int topN, char from, char inter, char to) {
		
		if (topN == 1) {
			System.out.println("Disk 1 form "+ from + " to " + to);
		} else {
			doTowers(topN - 1, from, to, inter); // from --> inter
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to); // inter --> to
		}
	}

}
