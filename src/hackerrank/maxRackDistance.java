package hackerrank;

import java.util.Arrays;

public class maxRackDistance {
	
	public static void main(String[] args) {
		int arr[] = {10, 0, 8, 2, -1, 12, 11, 3};
		System.out.println("Largest possible Distance: "+largestRackDistance(arr));
	}

	private static int largestRackDistance(int[] A) {
		Arrays.sort(A);
		int maxDiff=0;
		int currDiff=0;
		for (int i = 1; i < A.length; i++) {
			currDiff = A[i] - A[i-1];
			if(maxDiff<currDiff) {
				maxDiff=currDiff;
			}
		}
		return maxDiff/2;
	}
}