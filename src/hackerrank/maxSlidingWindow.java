package hackerrank;
import java.util.LinkedList;

class Solution {

	public int[] maxSlidingWindow(int[] nums, int k) {
		if(nums==null||nums.length==0)
			return new int[0];

		int[] result = new int[nums.length-k+1];

		LinkedList<Integer> deque = new LinkedList<Integer>();
		for(int i=0; i<nums.length; i++){
			if(!deque.isEmpty()&&deque.peekFirst()==i-k) 
				deque.poll();

			while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
				deque.removeLast();
			}    

			deque.offer(i);

			if(i+1>=k)
				result[i+1-k]=nums[deque.peek()];
		}

		return result;

	}
}

/*
 * 
 * 
 * 
 * Find Max from Array
int max=result[0];

for(int i =0; i<result.length;i++ ) {
	if(result[i]>max) {
		max=result[i];
	}
}

 * 
 */


//
//static void printMax(int arr[],int n, int k)
//{
//	// Create a Double Ended Queue, Qi that will store indexes of array elements
//	// The queue will store indexes of useful elements in every window and it will
//	// maintain decreasing order of values from front to rear in Qi, i.e., 
//	// arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
//	Deque<Integer> Qi = new LinkedList<Integer>();
//
//	/* Process first k (or first window) elements of array */
//int i;
//for(i = 0; i < k; ++i)
//{
//	// For very element, the previous smaller elements are useless so
//	// remove them from Qi
//	while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
//		Qi.removeLast();   // Remove from rear
//
//	// Add new element at rear of queue
//	Qi.addLast(i);
//}
//
//// Process rest of the elements, i.e., from arr[k] to arr[n-1]
//for( ;i < n; ++i)
//{
//	// The element at the front of the queue is the largest element of
//	// previous window, so print it
//	System.out.print(arr[Qi.peek()] + " ");
//
//	// Remove the elements which are out of this window
//	while((!Qi.isEmpty()) && Qi.peek() <= i-k)
//		Qi.removeFirst();
//
//	// Remove all elements smaller than the currently
//	// being added element (remove useless elements)
//	while((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
//		Qi.removeLast();
//
//
//	// Add current element at the rear of Qi
//	Qi.addLast(i);
//
//}
//
//// Print the maximum element of last window
//System.out.print(arr[Qi.peek()]);
//}
