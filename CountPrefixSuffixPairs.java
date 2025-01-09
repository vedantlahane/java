import java.util.Scanner;
public class CountPrefixSuffixPairs {
    public static boolean isPrefixSuffixPair(String s1, String s2){
        int n1 = s1.length(), n2 = s2.length();
        if( n1 > n2) return false;
        return s2.substring(0, n1).equals(s1) && s2.substring(n2 - n1).equals(s1);
    }

    public static int countPrefixSuffixPairs(String[] words){
        int n = words.length;
        int count = 0;
        for( int i = 0 ; i < n  ; i++ ){
            for( int j = i + 1 ; j < n ; j++ ){
                if(isPrefixSuffixPair(words[i], words[j]) ){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words");
        int n = sc.nextInt();
        String[] words = new String[n];
        System.out.println("Enter the words");
        for( int i = 0 ; i < n ; i++ ){
            words[i] = sc.next();
        }
        int count = countPrefixSuffixPairs(words);
        System.out.println("The number of prefix suffix pairs are: " + count);
        sc.close();
    }
}
