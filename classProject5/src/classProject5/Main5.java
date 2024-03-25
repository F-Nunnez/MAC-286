
package classProject5;

import java.util.Arrays;

public class Main5 {
	
	 //3-Copy the contents of new array into the original array.
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
//        System.out.println("i: "+i);
//        System.out.println("j: "+j);
//        System.out.println("temp: "+temp);
        A[i] = A[j];
//        System.out.println("A[j]: "+A[j]);
//        System.out.println("j: "+j);
//        System.out.println("A[i]: "+A[i]);
        A[j] = temp;
//        System.out.println("A[j]: "+A[j]);
        if (i == A.length-1) {
            System.out.println("New [B] - > Original [A]: "+Arrays.toString(A));
        }

    }

    // Utility function to reverse elements of an array
    public static void reverse(int[] A) {

    // 1-Create a new array same type and size of the original array.
        int[] B = new int[A.length];

        // Add code here

        int len = B.length -1;
        int index = 0;
        for (int i = len; i >= 0; i--) {
            //2-Fill new array with elements from the original array (in reverse order)
            B[index++]=A[i];
        }

        System.out.println("New [B]: (rev) "+Arrays.toString(B));
//        System.out.println("B: "+B[0]);
//        System.out.println("B: "+B[1]);
//        System.out.println("B: "+B[2]);
//        System.out.println("B: "+B[3]);
//        System.out.println("B: "+B[4]);

        int j = B.length -1;
        int k = 0;
        for (int i = 0; i <= j; i++) {
            swap(B, i, k++);
        }
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5 };

        System.out.println("Original A: "+Arrays.toString(A));
        reverse(A);
    }

}
