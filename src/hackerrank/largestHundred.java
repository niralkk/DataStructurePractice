package hackerrank;

import java.util.Random;

public class largestHundred {

	public static int[] findLargestNumberWindow(int current, int result[]) {

		if(current<result[0]) {
			//discard current and return result
			return result;
		}
		else {
			//Insert currentNum in the arrayin such a way ...result shud remain sorted
			
			
			for(int i=0; i<result.length;i++) {
				
				if(current> result[i]) {

					if(i<result.length-1) {
						result[i] = result[i+1];
					}
					else {
						result[i]=current;
						
					}
				}
				else {
					if(i!=0) {
						result[i-1]=current;
					}
					else {
						result[0]=current;
					}
					break;
				}

			}

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