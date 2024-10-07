import java.util.Scanner;
public class FirstNpSmoothNum {
    public static boolean isPsmooth(int i, int p){
        int count = 0;
        for(int j = 2; j <= i; j++){
            if(i % j == 0){
                int c = 0;
                while(i % j == 0){
                    i = i / j;
                    c++;
                }
                if (j > p) {
                    return false;
                }
            }
        }
        if(count == p){
            return true;
        }
        return true;
    }

    public static int[] Psmooth(int p, int n) {
        int[] arr = new int[n];
        int count = 0;
        int i = 2;
        while(count < n){
            if(isPsmooth(i, p)){
                arr[count] = i;
                count++;
            }
            i++;
        }
        // for(int j = 0; j < n; j++){
        //     System.out.print(arr[j] + " ");
        // }
        return arr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p and n");
        int p = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = Psmooth(p, n);
        System.out.println("Psmooth numbers are: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");

        }
        sc.close();
    }
}
