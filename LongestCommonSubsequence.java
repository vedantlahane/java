import java.util.Scanner;
public class LongestCommonSubsequence {
    public static int lcs( String s1, String s2 ){
        int m = s1.length();
        int n = s2.length();
        if ( m == 0 || n == 0 ){
            return 0;
        }
        if ( s1.charAt( m - 1 ) == s2.charAt( n - 1 ) ){
            return 1 + lcs( s1.substring( 0, m - 1 ), s2.substring( 0, n - 1 ) );
        }
        else{
            return Math.max( lcs( s1.substring( 0, m - 1 ), s2 ), lcs( s1, s2.substring( 0, n - 1 ) ) );
        }

    }
    public static int lcs( String s1, String s2, int dp[][] ){
        int m = s1.length();
        int n = s2.length();
        if ( m == 0 || n == 0 ){
            return 0;
        }
        if ( dp[ m ][ n ] != -1 ){
            return dp[ m ][ n ];
        }
        if ( s1.charAt( m - 1 ) == s2.charAt( n - 1 ) ){
            return dp[ m ][ n ] = 1 + lcs( s1.substring( 0, m - 1 ), s2.substring( 0, n - 1 ), dp );
        }
        else{
            return dp[ m ][ n ] = Math.max( lcs( s1.substring( 0, m - 1 ), s2, dp ), lcs( s1, s2.substring( 0, n - 1 ), dp ) );
        }
    }
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the first string: ");
        String s1 = sc.next();
        System.out.println("Enter the second string: ");
        String s2 = sc.next();
        System.out.println("The length of the longest common subsequence is: " + lcs( s1, s2 ) );
        int dp[][] = new int[ s1.length() + 1 ][ s2.length() + 1 ];
        for( int i = 0 ; i < s1.length() ; i++ ){
            for( int j = 0 ; j < s2.length() ; j++){
                dp[ i ][ j ] = -1;
            }
        }
        System.out.println("The length of the longest common subsequence by memoization is: " + lcs( s1, s2, dp ) );
        
        sc.close();
    }
}
