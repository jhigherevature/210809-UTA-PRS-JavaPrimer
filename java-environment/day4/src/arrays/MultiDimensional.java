package arrays;

public class MultiDimensional {
	/*
	 * Arrays are collections of information. We can
	 * hold onto collections of primitives OR objects.
	 * Since Arrays are objects, we can also hold
	 * a collection of Arrays!
	 */
	public static void main(String[] args) {
		int[] one = {1,2,3};
		int[] two = {4,5,6};
		int[] three = {7,8,9};
		// 								   0			   1		  2
		// 							   0 1 2 3 4    0  1  2  3 4 5   0 1
		int[][] twoDee = new int[][] {{1,2,3,5,6},{88,71,554,4,5,6},{7,8}};
		
		int[][][] threeDee = new int[][][] { {{1,2,3,5,6},{88,71,554,4,5,6},{7,8}}, {{1,2,3,5,6},{88,71,554,4,5,6},{7,8}} };
		
		System.out.println(one[2]);
		System.out.println(twoDee[0][1]); // 2
	}
}
