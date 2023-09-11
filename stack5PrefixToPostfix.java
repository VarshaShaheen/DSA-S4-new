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
        Scanner sc = new Scanner(System.in);
        String prefix,temp1,temp2,temp;
        String rev = "";
        char current;
        System.out.println("Enter the string:");
        prefix = sc.nextLine();
        Stack s = new Stack(prefix.length());
        for (int i = prefix.length() - 1; i >= 0; i--) {
            rev = rev + (prefix.charAt(i));
        }
        for(int i = 0;i< rev.length();i++){
            current = rev.charAt(i);
            if(Character.isLetterOrDigit(current) == true){
                s.push("" + current);
            }
            else{
                temp1 = s.pop();
                temp2 = s.pop();
                temp = temp1 + temp2 + current;
                s.push(temp);
            }
        }
        System.out.println(s.pop());
    }
}