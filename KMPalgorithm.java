import java.util.Scanner;
public class KMPalgorithm {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        System.out.println("Enter the pattern: ");
        String pattern = sc.nextLine();
        int n = text.length();
        int m = pattern.length();
        int lps[] = new int[m];//Longest proper prefix which is also a suffix
        int j = 0;
        for( int  i = 1 ; i < m ; i++ ){//Building the lps array
            if( pattern.charAt(i) == pattern.charAt(j) ){
                lps[i] = j+1;
                j++;
            }
            else{
                if( j != 0 ){
                    j = lps[j-1];
                    i--;
                }
                else{
                    lps[i] = 0;
                }
            }

        }
        int i = 0;
        j = 0;
        while( i < n ){
            if( text.charAt(i) == pattern.charAt(j) ){
                i++;
                j++;
            }
            if( j == m ){
                System.out.println("Pattern found at index: "+(i-j));
                j = lps[j-1];
            }
            else if( i < n && text.charAt(i) != pattern.charAt(j) ){
                if( j != 0 ){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        sc.close();

    }
}
