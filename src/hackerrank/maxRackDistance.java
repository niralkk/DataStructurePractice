package hackerrank;

import java.util.Arrays;
//Finding the Minimum Window in S which Contains All Elements from T
//https://stackoverflow.com/questions/5447561/find-shortest-subarray-containing-all-elements/5447601#5447601
// https://books.google.com/books?id=y6FLBQAAQBAJ&pg=PA219&dq=smallest+subarray+sequentially+covering+all+values&hl=en&sa=X&ved=0ahUKEwjYit7Swe_YAhVG82MKHYvUDl4Q6AEIKDAA#v=onepage&q=smallest%20subarray%20sequentially%20covering%20all%20values&f=true
import java.util.HashMap;
import java.util.HashSet;

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