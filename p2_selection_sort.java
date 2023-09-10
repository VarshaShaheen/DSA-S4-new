import java.util.*;

class p2_selection_sort{
    public static void main(String args[]){
        int arr[] = new int[30];
        int n,small,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            small = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[small]){
                    small = j;
                }
            }
            temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}