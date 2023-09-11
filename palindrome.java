import java.util.*;
class stack{
    char arr[];
    int top;
    public stack(int n){
        arr = new char[n];
        top = -1;
    }
    public void push(char a){
        arr[++top] = a;
    }
    public char pop(){
        return(arr[top--]); 
    }
    public char peek(){
        return(arr[top]);
    }
}

public class palindrome{
    public static void main(String args[]){
        String word;
        String temp = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        word = sc.nextLine();
        stack s = new stack(word.length());
        for(int i=0;i<word.length();i++){
            s.push(word.charAt(i));
        }
        for(int i=0;i<word.length();i++){
            temp = temp + s.pop();
        }
        if(word.compareTo(temp) == 0){
            System.out.println("the string is a palindrome");
        }
        else{
            System.out.println("the string is not a palindrome");
        }
    }
}
