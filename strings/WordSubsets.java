import java.util.Scanner;
import java.util.*;

public class WordSubsets {
    public static List<String> wordSubsets(String[] A, String[] B) {
        int[] maxFreq = new int[26];
        for( String b : B ){
            int[] freq = new int[26];
            for( char c : b.toCharArray() ){
                freq[c - 'a']++;
            }
            for( int i = 0 ; i < 26 ; i++ ){
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for( String a : A ){
            int[] freq = new int[26];
            for( char c : a.toCharArray() ){
                freq[c - 'a']++;
            }
            boolean isUniversal = true;
            for( int i = 0 ; i < 26 ; i++ ){
                if( freq[i] < maxFreq[i] ){
                    isUniversal = false;
                    break;
                }
            }
            if( isUniversal ){
                res.add(a);
            }
        }
        return res;
    }
    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of words in A");
        int n = sc.nextInt();
        String[] A = new String[n];
        System.out.println("Enter the words in A");
        for( int i = 0 ; i < n ; i++ ){
            A[i] = sc.next();
        }
        System.out.println("Enter the number of words in B");
        int m = sc.nextInt();
        String[] B = new String[m];
        System.out.println("Enter the words in B");
        for( int i = 0 ; i < m ; i++ ){
            B[i] = sc.next();
        }
        List<String> res = wordSubsets(A, B);
        System.out.println("The universal words are: ");
        for( String s : res ){
            System.out.println(s);
        }
        sc.close();

    }
}
