import java.util.Stack;
public class infixToPrefix {
    public static void main(String[] args) {
        String infix = "9-5+3*4/6";
        System.out.println("Infix: " + infix);
        System.out.println("Prefix: " + InfixToPrefix(infix));
    }
    public static String InfixToPrefix(String infix) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = infix.length() - 1; i >= 0; i--) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(String.valueOf(ch));
            }
            else if (ch == ')') {
                op.push(ch);
            }
            else if (ch == '(') {
                while (!op.isEmpty() && op.peek() != ')') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = op.pop();
                    val.push(o + v1 + v2);
                }
                op.pop();
            }
            else if (isOperator(ch)) {
                while (!op.isEmpty() && precedence(op.peek()) > precedence(ch)) {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = op.pop();
                    val.push(o + v1 + v2);
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()) {
            String v1 = val.pop();
            String v2 = val.pop();
            char o = op.pop();
            val.push(o + v1 + v2);
        }
        return val.pop();
    }
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
}