package hackerrank;

import java.util.Arrays;

public class minJumpToReachEnd {
	
	public static void main(String[] args) {
		int arr1[] = {2,3,1,1,2,4,2,0,1,1};
		int arr[] = {1,2};
		System.out.println("Min jump to reach end: "+minJumpDynamic(arr));
		System.out.println("Min jump to reach end: "+minJumpGreedy(arr));
	}

	private static int minJumpGreedy(int[] arr) {
		int currFarthest = 0;
		int currEnd = 0;
		int jumps = 0;
		
		for(int i = 0; i < arr.length -1 ; i++) {
			currFarthest = Math.max(currFarthest, i + arr[i]);
			if(i==currEnd) {
				jumps++;
				currEnd = currFarthest;
			}
		}
		return jumps;
	}

	private static int minJumpDynamic(int[] A) {
		int B[] = new int[A.length];
		int C[] = new int[A.length];
		
		for(int i=1; i < A.length ; i++){
			//System.out.println(B[i]);
            B[i] = Integer.MAX_VALUE-1;
        }
		
		for(int i=1; i<A.length; i++) {
			for(int j = 0; j<i; j++) {
				
				
				if(A[j] + j >=i) {
					
					if( B[i] > B[j]+1 ) {
						B[i] = B[j]+1;
						C[i] = j;
					}
				}
			}
		}
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.println(Arrays.toString(C));
		return B[A.length-1];
	}
}
