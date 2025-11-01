import java.util.Scanner;
import java.util.HashSet;
public class DistinctElement {
    public static int distinct(int[] arr, int n) {
        {
          HashSet<Integer> S = new HashSet<>(); 
          for (int i = 0; i < n; i++) {
            S.add(arr[i]); 
         
          }
          int ans = S.size(); 
          return ans;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int dis_elements = distinct(arr, n);
        System.out.print(dis_elements + "\n");
        sc.close();

    }
}
