package hackerrank;

public class rme {
	/**
	 * Write a function that acts like "indexOf", in that it
	 * returns the position of a given string within a
	 * larger string, and returns -1 if the given string
	 * is not found.
	 *
	 * Two strings are given as arguments. The first
	 * argument is the smaller string, and the second argument
	 * is the larger string.
	 *
	 * Do not use any stdlib string search functions like indexOf, search, index,
	 * find, etc.
	 *
	 * Examples:
	 *
	 *   substrIndex("Francisco", "San Francisco");
	 *   => 4
	 *   substrIndex("abba", "bbbabbaaa")
	 *   => 3
	 *   substrIndex("Jose", "San Francisco");
	 *   => -1
	 *
	 * @param {String} needle
	 * @param {String} haystack
	 * @return integer
	 */
	public static int substrIndex (String needle, String haystack) {
		int needleLength = needle.length();
		int haystackLength = haystack.length();
		int i=0;
		int j=0;
		int index=-1;
		while(i!=haystackLength && j!= needleLength) {
			if(haystack.charAt(i)==needle.charAt(j)) {
				if(j==0) {
					index=i;
				}
				j++;
			}
			else
			{
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


	/**
	 * Write a function that capitalizes all of the words in
	 * a sentence.
	 *
	 * Examples:
	 *
	 *   capitalize("Hello world");
	 *   => "Hello World"
	 *
	 *   capitalize("1st thing");
	 *   => "1st Thing"
	 *
	 *   capitalize("javaScript language");
	 *   => "JavaScript Language"
	 *
	 * @param  {String} sentence
	 * @return {String}
	 */
	public static String capitalize(String sentence) {
		StringBuilder res = new StringBuilder();
		String strArray[] = sentence.split(" ");
		for(int i=0; i< strArray.length; i++) {
			char ch[] = strArray[i].toCharArray();

			if(Character.isLetter(ch[0]) && !Character.isUpperCase(ch[0])) {
				ch[0] = (char)(ch[0]- 32);
			}

			strArray[i] = String.valueOf(ch);
			res.append(strArray[i]);
			if(i<strArray.length-1) {
				res.append(" ");
			}
		}

		return res.toString();
	}

	/**
	 * Write a function that takes in a sentence as an argument.
	 * The sentence always contains one comma, which divides
	 * the sentence into two strings.
	 *
	 * Do not use a the built-in String.endsWith method.
	 *
	 * The function should return true if the first part of the string
	 * (the part before the comma) ends with second part of
	 * the string (the part after the comma).
	 *
	 * Examples:
	 *
	 *   endsWith("San Francisco,Francisco");
	 *   => true
	 *   endsWith("racecar,race");
	 *   => false
	 *   endsWith("honey,money");
	 *   => false
	 *   endsWith("escargo,go");
	 *   => true
	 *   endsWith("Palo Alto,Palo");
	 *   => false
	 *   endsWith("Raise.me,me");
	 *   => true
	 *
	 * @param  {String} sentence
	 * @return {Bool} true or false
	 */
	public static boolean endsWith(String sentence) {

		String strArray[] = sentence.split(",");
		String part1= strArray[0];
		String part2= strArray[1];

		int part1Length = part1.length();
		int part2Length = part2.length();

		if(part2Length>part1Length) {
			return false;
		}
		int i = part1Length-1;
		int j = part2Length-1;

		while(j>=0) {
			if(part1.charAt(i)==part2.charAt(j)) {
				i--;
				j--;
			}
			else {
				return false;
			}

			if(j==-1) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// Optional tests.
		System.out.println(endsWith("Palo Alto,Palo"));
		System.out.println(endsWith("Palo Alto,Alto"));
		System.out.println(substrIndex("abba", "bbbabbaaa"));
		System.out.println(substrIndex("aba", "bbbabbaaba"));
		System.out.println(capitalize("@avaScript language"));
	}
}
