import java.util.*;

class Stack {
    private int size;
    private char[] arr;
    private int top;

    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = new char[size];
    }

    public void push(char s) {
        arr[++top] = s;
    }

    public char pop() {
        return arr[top--];
    }

    public char peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}

class stack2InfixToPostfix {
    public static boolean isOperator(char s) {
        return (s == '+' || s == '-' || s == '*' || s == '/');
    }

    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    public static String infixToPostfix(String infix) {
        String postfix = "";
        Stack stack = new Stack(infix.length());

        for (int i = 0; i < infix.length(); i++) {
            char current = infix.charAt(i);

            if (Character.isLetterOrDigit(current)) {
                postfix += current;
            } else if (current == '(') {
                stack.push(current);
            } else if (current == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() != '(') {
                    // Mismatched parentheses
                    return "Invalid infix expression!";
                }

                stack.pop(); // Discard the opening parenthesis
            } else { // Current character is an operator
                while (!stack.isEmpty() && precedence(current) <= precedence(stack.peek())) {
                    postfix += stack.pop();
                }
                stack.push(current);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                // Mismatched parentheses
                return "Invalid infix expression!";
            }
            postfix += stack.pop();
        }

        return postfix;
    }

    public static void main(String args[]) {
        String infix, postfix;
        postfix = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression:");
        infix = sc.nextLine();

        postfix = infixToPostfix(infix);
        System.out.println("The postfix string is: " + postfix);
    }
}
