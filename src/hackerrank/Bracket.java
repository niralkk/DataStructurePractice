package hackerrank;
import java.util.Scanner;
import java.util.Stack;

public class Bracket {

    static String isBalanced(String s) {
        // Complete this function
        char brackets[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        
        for(char bracket : brackets) {
            switch(bracket) {
                case '{' :
                    stack.push('}');
                    break;
                case '(' :
                    stack.push(')');
                    break;
                case '[' :
                    stack.push(']');
                    break;
                default :
                    if(stack.empty() || bracket != stack.peek()) {
                        return "NO";
                    }
                    stack.pop();
            }
        }
        
        return stack.isEmpty() ? "YES" : "NO";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
