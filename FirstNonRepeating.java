import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeating {
    public static void main( String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[n];
        for( int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int num : arr){
            map.put( num , map.getOrDefault( num, 0 ) + 1 );
        }
        for(int num : arr){
            if( map.get( num ) == 1 ){
                System.out.println("First non-repeating element is: "+num);
                break;
            }

        }
        sc.close();

    }    
}
