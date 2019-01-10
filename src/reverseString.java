//344. Reverse String
//
//Write a function that takes a string as input and returns the string reversed.
//
//        Example 1:
//
//        Input: "hello"
//        Output: "olleh"


public class reverseString {

    public static void main(String args[]) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String s) {
        int len = s.length();
        char strArray[] = new char[len];
        int i = 0;
            /* 6
            0 1 2 3 4 5
            */
            /* 5
            0 1 2 3 4
            */
        for(i = 0; i<len/2; i++) {
            strArray[i] = s.charAt(len-i-1);
            strArray[len-i-1] = s.charAt(i);
        }
        if(len%2!=0)
            strArray[i] = s.charAt(len-i-1);

        return String.valueOf(strArray);
    }
}
