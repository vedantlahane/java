import java.util.Scanner;
public class MinProductInAnArray {
    public static  void main( String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for( int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        int negNumbers = 0;
        int zeroNumbers = 0;
        int product = 1;
        int minPositive = Integer.MAX_VALUE;
        int maxNegative = Integer.MIN_VALUE;
        for( int i = 0 ; i < n ; i++ ){
            if( arr[i] < 0 ){
                negNumbers++;
                maxNegative = Math.max(maxNegative, arr[i]);
            }
            else if( arr[i] == 0 ){
                zeroNumbers++;
            }
            else{
                minPositive = Math.min(minPositive, arr[i]);
            }
            product *= arr[i];
        }
        if( negNumbers == 0 && zeroNumbers > 0 ){
            System.out.println("Product is: 0");
        }
        else if( negNumbers == 0 ){
            System.out.println("Product is: "+product);
        }
        else if( negNumbers % 2 == 0 && negNumbers != 0 ){
            product = product / maxNegative;
            System.out.println("Product is: "+product);
        }
        else if( negNumbers % 2 != 0 && negNumbers != 0 ){
            product = product / maxNegative;
            System.out.println("Product is: "+product);
        }
        sc.close();

    }
}
