public class SumOfDigits {
	
	public static int sumOfDigits(int x) {
		
        // Base case
		if (x == 0) {
			return 0;
		}
		
		if (x < 0) {
			return -(x%10) + sumOfDigits(x /= 10);
		}else {			
			return (x%10) + sumOfDigits(x/=10);
		}
	}
	
	public static void main(String[] args) {
	// Assignment Ch6
		
    // Write a method using the prototype below,
	// that returns the sum of the digits of the
	//integer specified as an argument. Obviously,
	//this method should use recursion.
				
		System.out.println(sumOfDigits(234));
		System.out.println(sumOfDigits(12));
		System.out.println(sumOfDigits(39));
		System.out.println(sumOfDigits(-12));
		System.out.println(sumOfDigits(12));
	}

}
