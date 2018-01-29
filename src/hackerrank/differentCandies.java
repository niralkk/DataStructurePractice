package hackerrank;

import java.util.HashSet;

public class differentCandies {

	public static void main(String[] args) {
		int candies[] = {1,2,3,4,5,6};
		int candies2[] = {1,1};
		int candies3[] = {1,1,2,2,5,6};
		int candies4[] = {5,2,1,4,5,6};
		int candies5[] = {1,2,1,2,1,1};
		System.out.println(nDiffCandies(candies5));
	}


	public static int nDiffCandies(int A[]) {
		int maxDiffCandies = A.length/2;
		int currDiffCount = 0;
		HashSet<Integer> uniqueCandies = new HashSet<>();
		
		int i=0;
		while(i<A.length && currDiffCount!=maxDiffCandies)
		{
			if(!uniqueCandies.contains(A[i])) {
				uniqueCandies.add(A[i]);
				currDiffCount++;
			}
			i++;
		}
		return currDiffCount;
	}
}
