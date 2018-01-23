package hackerrank;
import java.util.Stack;

public class matchingPair {

	public static void main(String[] args) {
		String str = "ABba";
		String str1 = "ABbCca";
		String str2 = "ABab";
		String str3= "FXPpxff";
		//String str3 = "ABba";
		System.out.println("Matching Pair"+matchingpairs(str3.toCharArray()));

	}

	public static int matchingpairs(char str[]) {

		if (!Character.isUpperCase(str[0]) || str.length == 0)
			return -1;
		Stack<Character> stack = new Stack<>();
		stack.push(str[0]);
		int res = -1;
		for (int i = 1; i < str.length; i++) {
			if (!Character.isUpperCase(str[i]) && !stack.empty()) {
				char c = stack.peek();
				if (c + 32 == str[i]) 
				{
					stack.pop();
					res = i;
				} else
					return res;
			}
			
			
			else {
				stack.push(str[i]);
			}
		}
		if (stack.empty())
			return str.length - 1;
		else
			return res;
	}
}
