package hackerrank;

import java.util.Random;

public class largestHundred2 {

	public static int[] findLargestNumberWindow(int current, int result[]) {
		if(current<result[0]) {
			//discard current and return result
			return result;
		}
		else {
			//Insert currentNum in the array in such a way ...result shud remain sorted
			
			int j=0;
			while(current>result[j] && j<result.length-1)
			{
				result[j]=result[j+1];
				j++;
			}
			result[j-1]=current;

			return result;
		}
	}

	public static int getNext(){
		Random rand = new Random();
		int r = rand.nextInt(1000);
		System.out.println("Randon"+r);
		return r;
	}


	public static void main(String args[]){
		int[] re = new int[7];
		for (int i = 0; i < 100; i++) {
			re = findLargestNumberWindow(getNext(), re);
			for (int j = 0; j < re.length; j++) {
				System.out.print(re[j]+":"+" ");
			}
			System.out.println();
		}
	}
}