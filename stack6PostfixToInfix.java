import java.util.*;

class Stack {
    private int size;
    private String[] arr;
    private int top;

    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = new String[size];
    }

    public void push(String s) {
        arr[++top] = s;
    }

    public String pop() {
        return arr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}

public class stack6PostfixToInfix{

    public static boolean isOperator(char s) {
        if (s == '+' || s == '-' || s == '*' || s == '/') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]){
        String postfix;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postfix expression:");
        postfix = sc.nextLine();
        Stack sob = new Stack(postfix.length());
        for(int i=0;i<postfix.length();i++){
            if(isOperator(postfix.charAt(i))==true){
                String temp1 = sob.pop();
                String temp2 = sob.pop();
                sob.push("(" + temp2 + postfix.charAt(i) + temp1 + ")");
            }
            else{
                sob.push(""+ postfix.charAt(i));
            }
        }
        System.out.println("Infix Expression : " + sob.pop());
    }
}