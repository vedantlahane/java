// Longest Pangram in Text
// Problem Statement: Given a paragraph of text, identify the longest pangram sentence in the text. If multiple sentences are of the same length, return all of them.

// Input:

// A string representing a paragraph.
// Output:

// A list of the longest pangram sentences.
// Example:

// Input: "The quick brown fox jumps over the lazy dog. A fast dog jumps. Hello world."
// Output: ["The quick brown fox jumps over the lazy dog."]
// These problems can help deepen your understanding of string manipulation, algorithm design, and basic data structures while still focusing on the pangram concept. Let me know if you need help with coding any specific problem!


import java.util.Scanner;
public class LongestPanagramInText {
    public static void main( String args[]){
        scanner sc = new Scanner( System.in);
        System.out.println("Enter a paragraph: ");
        String paragraph = sc.nextLine();
        sc.close();
        String[] sentences = paragraph.split("[.!?]");
        String longestPangram = "";
        
    }
}
