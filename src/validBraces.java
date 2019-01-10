import java.util.Stack;

public class validBraces {


    public static void main(String args[]) {
        String input[] = new String[5];
        input[0] = "[{()[]}]";
        input[1] = "[{()[]}]";
        input[2] = "[{()[]}]";
        input[3] = "[{()[]}]";
        input[4] = "[{()[]}]";
        System.out.println(braces(input)[0]);
    }



    // Complete the braces function below.
    public static String[] braces(String[] values) {

        String result[] = new String[values.length];
        for(int i = 0; i < values.length; i++) {
            result[i] = isValidBraceString(values[i]);
        }
        return result;
    }

    public static String isValidBraceString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i<s.length(); i++) {
            switch(s.charAt(i)) {
                case '{' :
                    stack.push('}');
                    break;
                case '[' :
                    stack.push(']');
                    break;
                case '(' :
                    stack.push(')');
                    break;
                case '}' :
                    if(!stack.isEmpty() && stack.peek() == '}')
                    {
                        stack.pop();
                        break;
                    }
                    else {
                        return "NO";
                    }
                case ']' :
                    if(!stack.isEmpty() && stack.peek() == ']')
                    {
                        stack.pop();
                        break;
                    }
                    else {
                        return "NO";
                    }
                case ')' :
                    if(!stack.isEmpty() && stack.peek() == ')')
                    {
                        stack.pop();
                        break;
                    }
                    else {
                        return "NO";
                    }
                default:
                    break;
            }

        }
        return stack.isEmpty() ? "YES" : "NO";
    }

}

