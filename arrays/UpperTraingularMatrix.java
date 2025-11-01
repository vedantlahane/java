import java.util.Scanner;
public class UpperTraingularMatrix {
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++ ){
            for( int j = 0 ; j < n ; j++ ){
                if( i <= j ){
                    System.out.println("Enter the element at position (" + i + "," + j + "): ");
                    arr[i][j] = sc.nextInt();
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
        for(int i = 0 ; i < n ; i++ ){
            for( int j = 0 ; j < n ; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
