import java.util.Stack;
public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "9-5+3*4/6";
        System.out.println("Postfix: " + infixToPostfix(infix));
    }
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if (Character.isDigit(c)) postfix.append(c);
            else if (c == '(') stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postfix.append(stack.pop());
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
                    postfix.append(stack.pop());
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) postfix.append(stack.pop());
        return postfix.toString();
    }
    private static int precedence(char op) {
        switch (op) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            default: return -1;
        }
    }
}