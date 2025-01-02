// You are given a 0-indexed array of strings words and a 2D array of integers queries.

// Each query queries[i] = [li, ri] asks us to find the number of strings present in the range li to ri (both inclusive) of words that start and end with a vowel.

// Return an array ans of size queries.length, where ans[i] is the answer to the ith query.

// Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.

 

// Example 1:

// Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
// Output: [2,3,0]
// Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
// The answer to the query [0,2] is 2 (strings "aba" and "ece").
// to query [1,4] is 3 (strings "ece", "aa", "e").
// to query [1,1] is 0.
// We return [2,3,0].
// Example 2:

// Input: words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
// Output: [3,2,1]
// Explanation: Every string satisfies the conditions, so we return [3,2,1].
 

// Constraints:

// 1 <= words.length <= 105
// 1 <= words[i].length <= 40
// words[i] consists only of lowercase English letters.
// sum(words[i].length) <= 3 * 105
// 1 <= queries.length <= 105
// 0 <= li <= ri < words.length

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class CountVowelStringInARange {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        int n = sc.nextInt();
        String words[] = new String[n];
        System.out.println("Enter the words: ");
        for( int i = 0; i < n; i++){
            words[i] = sc.next();
        }
        System.out.println("Enter the number of queries: ");
        int m = sc.nextInt();
        int queries[][] = new int[m][2];
        System.out.println("Enter the queries: ");
        for( int i = 0; i < m; i++){
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        CountVowelStringInARange obj = new CountVowelStringInARange();
        int ans[] = obj.vowelStrings(words, queries);
        System.out.println("The answer to the queries is: ");
        for( int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }

    public int[] vowelStrings(String[] words, int[][] queries) {

        int n = words.length;
        int[] Prefix = new int[ n + 1];

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','i','o','u','e'));

        for (int i = 0; i < n; i++) {
            Prefix[i + 1] = Prefix[i];
            if (vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                Prefix[i + 1]++;
            }
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            ans[i] = Prefix[r + 1] - Prefix[l];
        }

        return ans;
    }
    
}
