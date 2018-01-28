package hackerrank;

public class endingLast {

	public static void main(String[] args) {
		String str1 = "san franscisco";
		String str2 = "fradscisco";
		System.out.println(isEnding(str1, str2));
	}


	public static boolean isEnding(String s1, String s2) {
		int str1Length = s1.length();
		int str2Length = s2.length();

		if(str2Length>str1Length) {
			return false;
		}


		int i = str1Length-1;
		int j = str2Length-1;

		while(j>=0) {

			if(s1.charAt(i)==s2.charAt(j)) {
				i--;
				j--;
			}
			else {
				return false;
			}

			if(j==-1) 
				return true;

		}

		return false;
	}

}
