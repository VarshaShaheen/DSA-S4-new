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

public class stack5PrefixToPostfix{

    public static boolean isOperator(char s) {
        if (s == '+' || s == '-' || s == '*' || s == '/') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]){
        String prefix, postfix;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prefix expression:");
        prefix = sc.nextLine();
        Stack sob = new Stack(prefix.length());
        char[] temp = prefix.toCharArray();
        for(int i = prefix.length()-1;i>=0;i--){
            if(isOperator(temp[i]) == true){
                String temp1 = sob.pop();
                String temp2 = sob.pop();
                String temp3 = temp1 + temp2 + temp[i];
                sob.push(temp3);
            }
            else{
                sob.push("" + temp[i]);
            }
        }
        System.out.println("The postfix expression:" + sob.pop());
    }
}