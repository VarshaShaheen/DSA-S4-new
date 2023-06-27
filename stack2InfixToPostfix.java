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

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}

public class stack2InfixToPostfix {

    public static boolean isOperator(char s) {
        if (s == '+' || s == '-' || s == '*' || s == '/') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String infix, postfix;
        postfix = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression:");
        infix = sc.nextLine();
        Stack ob = new Stack(infix.length());
        char[] infixChars = infix.toCharArray();
        for (int i = 0; i < infixChars.length; i++) { 
            if (infixChars[i] == '(') {
                ob.push(infixChars[i]);
            } else if (isOperator(infixChars[i]) == true) {
                ob.push(infixChars[i]);
            } else if (infixChars[i] == ')') {
                do {
                    postfix = postfix + ob.pop();
                } while (ob.pop() == ')');
            } else {
                postfix = postfix + infixChars[i];
            }
        }
        System.out.println("The postfix string is: " + postfix);
    }
}
