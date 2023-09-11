import java.util.Scanner;

public class sum{
    public static void main(String args[]){
        int arr[] = new int[30];
        int n, temp,sum;
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum: ");
        sum = sc.nextInt();
        for(int i = 0;i<n;i++){
           temp = sum - arr[i];
           for(int j=i+1;j<n;j++){
            if(arr[j] == temp){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
           }
        }
    }
}