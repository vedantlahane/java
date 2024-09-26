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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class LongestPanagramInText {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph: ");
        String paragraph = sc.nextLine();
        sc.close();
        String[] sentences = paragraph.split("[.!?]");
        List<String> longestPangrams = new ArrayList<>();
        int maxLength = 0;

        for (String sentence : sentences) {
            if (isPangram(sentence)) {
                int length = sentence.length();
                if (length > maxLength) {
                    longestPangrams.clear();
                    longestPangrams.add(sentence.trim());
                    maxLength = length;
                } else if (length == maxLength) {
                    longestPangrams.add(sentence.trim());
                }
            }
        }
        sc.close();

        System.out.println("Longest Pangram Sentences: " + longestPangrams);
    }

    private static boolean isPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }
        return alphabetSet.size() == 26;
    }
}