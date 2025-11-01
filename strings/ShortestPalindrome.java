import java.util.Scanner;

public class ShortestPalindrome {
    public static String shortestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) {
            return s; // Single character or empty string is already a palindrome
        }

        // Find the longest palindromic prefix
        int longestPalindromicPrefixLength = findLongestPalindromicPrefix(s);

        // The remaining suffix that needs to be reversed and added at the front
        String suffix = s.substring(longestPalindromicPrefixLength);
        String reversedSuffix = new StringBuilder(suffix).reverse().toString();

        // Form the shortest palindrome
        return reversedSuffix + s;
    }

    // Helper function to find the length of the longest palindromic prefix
    private static int findLongestPalindromicPrefix(String s) {
        int end = s.length() - 1;

        // Two-pointer technique to find the longest palindromic prefix
        while (end >= 0) {
            if (isPalindrome(s, 0, end)) {
                return end + 1;
            }
            end--;
        }
        return 0; // If no palindrome prefix is found, return 0
    }

    // Helper function to check if a substring is a palindrome
    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.println("Shortest Palindrome is: " + shortestPalindrome(sc.nextLine()));
        sc.close();
    }
}
