import java.util.Scanner;
import java.util.HashMap;
public class SameEleInRowsHash {
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Enter the element at position (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[0][i], 1);
        }
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                if(map.containsKey(arr[i][j])){
                    map.put(arr[i][j], map.get(arr[i][j]) + 1);
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(map.get(arr[0][i]) == m){
                System.out.println(arr[0][i] + " is present in all rows.");
            }
        }
        sc.close();
    }
}
