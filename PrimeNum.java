import java.util.Arrays;
import java.util.Scanner;
public class PrimeNum {
    public static void sieveOfEratosthenes(int n) {
        boolean[] arr=new boolean[n + 1];
        Arrays.fill(arr, true);
        arr[0]=arr[1]=false;

        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j =i* i;j<=n;j+= i){
                    arr[j] = false;
                }
            }
        }
        for(int i=2;i<=n;i++) {
            if(arr[i]){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void segmentedSieve(int l,int r) {
        int limit = (int)Math.sqrt(r)+1;
        boolean[] arr = new boolean[limit+1];
        Arrays.fill(arr, true);
        arr[0]=arr[1]=false;
        for (int i= 2;i*i<=limit;i++){
            if(arr[i]){
                for(int j=i*i;j<=limit;j+=i){
                    arr[j]=false;
                }
            }
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        sieveOfEratosthenes(n);

        segmentedSieve(n, n);

        sc.close();
    }
}
