import java.util.*;
public class MajorityElement {
    public static void Solution(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int num : arr){
            map.put( num , map.getOrDefault( num, 0 ) + 1 );
            if( map.get( num ) > n / 2 ){
                System.out.println("Majority Element is: "+num);
                return;
            }
        }
        System.out.println("No Majority Element");
        return;
        
    }
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[ n ];
        System.out.println("Enter the elements: ");
        for( int i = 0 ; i < n ; i++ ){
            arr[ i ] = sc.nextInt();
        }
        Solution( arr, n ); 
    }
    

}
