/**
 * Problem Statement:
 * Given a text and a pattern, we have to find all the occurrences of the pattern in the text using the KMP algorithm.
 * 
 * The KMP (Knuth-Morris-Pratt) algorithm is a string searching algorithm that searches for occurrences of a "pattern" within a main "text" string.
 * It achieves this by preprocessing the pattern to determine the longest prefix which is also a suffix (LPS array), 
 * and then uses this information to avoid unnecessary comparisons in the main text.
 * 
 * The algorithm works in two main phases:
 * 1. Preprocessing Phase: Construct the LPS array for the pattern.
 * 2. Searching Phase: Use the LPS array to search for the pattern in the text efficiently.
 * 
 * The time complexity of the KMP algorithm is O(n + m), where n is the length of the text and m is the length of the pattern.
 * This makes it more efficient than the naive string matching algorithm, especially for larger texts and patterns.
 * 
 * Example:
 * Text: "ABABDABACDABABCABAB"
 * Pattern: "ABABCABAB"
 * Output: Pattern found at index: 10
 */

//whats suffix and prefix?
//Suffix: A suffix of a string is a substring that occurs at the end of the string.
//Prefix: A prefix of a string is a substring that occurs at the beginning of the string.

//what is LPS array?
//LPS array is the longest proper prefix which is also a suffix
//For example:
//Pattern: "ABABCABAB"  LPS array: [0,0,1,2,0,1,2,3,4]  Longest proper prefix which is also a suffix
//Pattern: "AAAA"  LPS array: [0,1,2,3]
//Pattern: "ABCDE"  LPS array: [0,0,0,0,0]  No proper prefix which is also a suffix



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
