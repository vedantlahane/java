import java.util.Scanner;
public class SameEleInRows {
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i = 0 ; i < m ; i++ ){
            for( int j = 0 ; j < n ; j++ ){
                System.out.println("Enter the element at position (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }
        int col = 0;
        while(col < n){
            for(int i = 1 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++ ){
                    if(arr[0][col] == arr[i][j]){
                        
                    }
            
                }
            }
        }

    }
}
