import java.util.*;

class p1_matrix_multiplication{
    public static void main(String args[]){
        int arr1[][] = new int[30][30];
        int arr2[][] = new int[30][30];
        int mul[][] = new int[30][30];
        int m1,n1,m2,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix:");
        m1 = sc.nextInt();
        n1 = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of second matrix:");
        m2 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        if(n1 == m2){
            for(int i=0;i<m1;i++){
                for(int j=0;j<n2;j++){
                    mul[i][j] =0;
                    for(int k = 0;k<n2;k++){
                        mul[i][j] = mul[i][j] + arr1[i][k] * arr2[k][j];
                    }
                }
            }
            for(int i=0;i<m1;i++){
                for(int j=0;j<n2;j++){
                    System.out.print(mul[i][j] + "  ");
                }
                System.out.println(" ");
            }  
        }
        else{
            System.out.println("Multiplication not possible!");
        }
    }
}