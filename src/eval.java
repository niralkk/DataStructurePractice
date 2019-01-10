import java.util.Stack;

public class eval
{
    public static int evaluate(String expression)
    {
        char[] tokens = expression.toCharArray();

        Stack<Integer> values = new Stack<Integer>();
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i] == ' ')
                continue;

            if (tokens[i] >= '0' && tokens[i] <= '9')
            {
                StringBuffer sbuf = new StringBuffer();
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Integer.parseInt(sbuf.toString()));
            }

            else if (tokens[i] == '(')
                ops.push(tokens[i]);

            else if (tokens[i] == ')')
            {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            }

            else if (tokens[i] == '+' || tokens[i] == '-' ||
                    tokens[i] == '*' || tokens[i] == '/')
            {

                if(tokens[i+1]!= ' ') {
                    if(tokens[i] == '-') {
                        ops.push('*');
                        values.push(-1);
                    }
                    continue;
                }


                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }

                ops.push(tokens[i]);
            }
        }
//        System.out.println(ops.size());
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));

        return values.pop();
    }

    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }


    public static int applyOp(char op, int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args)
    {
//        System.out.println(eval.evaluate("10 + 2 * 6"));
//        System.out.println(eval.evaluate("100 * 2 + 12"));
//        System.out.println(eval.evaluate("100 * ( 2 + 12 )"));
        System.out.println(eval.evaluate("1 * -2 + -3 * 4"));
        System.out.println(eval.evaluate("1 + 135 / 134"));
        System.out.println(eval.evaluate("-234"));
        System.out.println(eval.evaluate("100 * ( 2 + 12 ) / 14"));

    }
}