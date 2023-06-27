import java.util.*;

class Stack {
    private int size;
    private int[] arr;
    private int top;

    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    public void push(int s) {
        arr[++top] = s;
    }

    public int pop() {
        return arr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}

public class stack3PostfixEval{
    
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
        int result;
        System.out.println("Enter the postfix expression:");
        postfix = sc.nextLine();
        Stack ob = new Stack(postfix.length());
        char[] post  = postfix.toCharArray();
        for(int i=0;i<postfix.length();i++){

            if(isOperator(post[i])==true){
                int temp1 = ob.pop();
                int temp2 = ob.pop();
                if(post[i]=='+'){
                    result = temp1 + temp2;
                }
                else if(post[i]=='-'){
                    result = temp2 - temp1;
                }
                else if(post[i]=='*'){
                    result = temp1 * temp2;
                }
                else{
                    result = temp2 / temp1;
                }
                ob.push(result);
            }

            else{
                int temp = post[i] - '0';
                ob.push(temp);
            }
        }
        System.out.println(ob.pop());
    }
}