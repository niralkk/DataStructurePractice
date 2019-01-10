//Deelet node greate r than x


public class lotus {

    public static void main(String args[]) {
        System.out.println(decode("7927"));
    }
    public static String decode(String encoded) {
        int len = encoded.length();
        int size = 2;
        String decoded = new String("");
        String asciiValue = new String("");
        for(int i = len-1; i >= 0;) {
            asciiValue="";

            if(encoded.charAt(i) == '1') {
                //parse 3 Digits
                size = 2;
                asciiValue += "1";
            }
            for(int j = 0 ; j < size; j++) {
                asciiValue+=encoded.charAt(i);
                i--;
            }
            System.out.println(asciiValue);
            System.out.println("i:" +i);
            decoded += convertAsciiValue(asciiValue);
        }
//            else {
//                //parse 2 Digits
//                size = 1;
//                asciiValue+=encoded.charAt(i);
//                for(int j = 0 ; j < size; j++) {
//                    i--;
//                    asciiValue+=encoded.charAt(i);
//                }
//                System.out.println(asciiValue);
//                decoded += convertAsciiValue(asciiValue);
//            }
//        }
        return decoded;
    }

    public static Character convertAsciiValue(String asciiValue) {
        int ascii = Integer.parseInt(asciiValue);
        return (char)ascii;
    }
}
