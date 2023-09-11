import java.util.*;
class string_sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        String a[] = new String[30];
        System.out.println("Enter the number of strings:");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the strings:");
        for(i=0;i<n;i++){
            a[i] = sc.nextLine();
        }
        String temp;
        for(i = 0;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if(a[j].compareTo(a[j+1])>0){
                    temp =  a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array:");
        for(i = 0;i<n;i++){
           System.out.println(a[i]);
        } 
    }
}