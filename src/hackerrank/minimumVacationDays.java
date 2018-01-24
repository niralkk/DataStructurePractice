package hackerrank;

//Finding the Minimum Window in S which Contains All Elements from T
//https://stackoverflow.com/questions/5447561/find-shortest-subarray-containing-all-elements/5447601#5447601
// https://books.google.com/books?id=y6FLBQAAQBAJ&pg=PA219&dq=smallest+subarray+sequentially+covering+all+values&hl=en&sa=X&ved=0ahUKEwjYit7Swe_YAhVG82MKHYvUDl4Q6AEIKDAA#v=onepage&q=smallest%20subarray%20sequentially%20covering%20all%20values&f=true
import java.util.HashMap;
import java.util.HashSet;

public class minimumVacationDays {
	
	public static void main(String[] args) {
		int arr[] = {7,3,7,3,1,3,4,1};
		int arr1[] = {7,3,4,1,7,3,3,4,4,1,1};
		int arr2[] = {1,1};
		int arr3[] = {1,2,3,4,5};
		System.out.println("Num of minimum consecutive days required to cover all unique location : "
							+minVacationDays(arr1));
	}

	private static int minVacationDays(int[] A) {
		
		int start =-1;
		int end = -1;
		
		HashSet<Integer> uniqueLocations = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			uniqueLocations.add(A[i]);
		}
		
		HashMap<Integer, Integer> locationToCover = new HashMap<>();
		
		for (Integer location : uniqueLocations) {
			if(!locationToCover.containsKey(location)) {
				locationToCover.put(location, 1);
			}
		}
		
		int remainingToCover = uniqueLocations.size();
		
		for(int left=0, right=0; right < A.length; ++right) {
			
			if(uniqueLocations.contains(A[right])) {
				locationToCover.put(A[right], locationToCover.get(A[right])-1);
				
				if(locationToCover.get(A[right]) == 0) {
					remainingToCover--;
				}
			}
			
			//Keeps Advancing left until locationToCover does not contain all location
			System.out.println("Iteration: "+right+":"+remainingToCover+":"+left);
			while(remainingToCover == 0) {
				System.out.println("While Iteration: "+right+":"+remainingToCover+":"+left);
				if( (start == -1 && end == -1) || right - left < end - start ) {
					start = left;
					end = right;
				}
				
				if(uniqueLocations.contains(A[left])) {
					
					locationToCover.put(A[left], locationToCover.get(A[left]) + 1);
					
					if(locationToCover.get(A[left]) > 0) {
						remainingToCover++;
					}
				}
				++left;
			}
		}
		return end-start+1;
	}
}