package hackerrank;

public class subStringIndex {

	public static void main(String[] args) {
		String str2 = "bbbabbaaba";
		String str1 = "aba";
		System.out.println(subIndex(str1, str2));
	}


	public static int subIndex(String needle, String haystack) {
		int needleLength = needle.length();
		int haystackLength = haystack.length();
		int i=0;
		int j=0;
		int index=-1;
		while(i<haystackLength && j<needleLength) {
			if(haystack.charAt(i)==needle.charAt(j)) {
				if(j==0) {
					index=i;
				}
				j++;
			}
			else {
				if(index!=-1) {
					i=index;
					index=-1;
					j=0;
				}
			}
			i++;
		}

		if(j==needleLength) {
			return index;
		}

		return -1;
	}
}
