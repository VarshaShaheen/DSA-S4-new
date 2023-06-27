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

public class stack4DelimiterCheck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.println("Enter the expression:");
        String exp = sc.nextLine();
        Stack sob = new Stack(exp.length());
        char[] expc = exp.toCharArray();
        for(int i =0;i<exp.length();i++){
            if(expc[i]=='{' || expc[i]=='[' || expc[i]=='('){
                sob.push(expc[i]);
            }
            else if(expc[i]=='}' || expc[i]==']' || expc[i]==')'){
                char temp = sob.pop();
                if((expc[i] == '}' && temp != '{') || (expc[i] == ']' && temp != '[') || (expc[i] == ')' && temp != '(' ) ){
                    flag = -1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("The delimiter matched");
        }
        else{
            System.out.println("Delimiter is not matched");
        } 
    }
}