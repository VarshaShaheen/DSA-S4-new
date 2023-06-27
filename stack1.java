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
public class stack1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String temp = sc.nextLine();
        Stack sob = new Stack(temp.length());
        char[] word = temp.toCharArray();
        char[] reverse = new char[temp.length()];
        for(int i=0;i<temp.length();i++){
            sob.push(word[i]);
        }
        for(int i=0;i<temp.length();i++){
           reverse[i] = sob.pop();
        }
        String reversed_string = new String(reverse);
        System.out.println("Reversed String : " + reversed_string);
        if(temp.compareTo(reversed_string)==0){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }
    }
}