
public class PartitionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxSize = 16; // array size
//		int maxSize = 3; // array size
		ArrayPar arr; // reference to array
		arr = new ArrayPar(maxSize); // create the array
		for(int j=0; j<maxSize; j++) { // fill array with
		// random numbers					
			long n = (int)(Math.random()*199); // 
			arr.insert(n);
		}
		arr.display(); // display unsorted array
		
		int size = arr.size();
		
//		long pivot = 99; // pivot value
		long pivot = arr.getTheArray()[size-1]; // highest-index element as the pivot
		System.out.print("Pivot is " + pivot);
//	
		//partition array
		int partDex = arr.partitionIt(0, size-1, pivot);
		System.out.println(", Partition is at index " + partDex);
		arr.display(); // display partitioned array
	}
}
