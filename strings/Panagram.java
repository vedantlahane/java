// Problem Statement: Missing Characters to Make a String Pangram
// A pangram is a sentence that contains every letter of the alphabet at least once. In this problem, you are given a string and need to determine which letters are missing to make it a pangram. Your task is to write a method that returns a list of missing characters.

// Input
// A single string input (1 ≤ length of input ≤ 1000) that may contain uppercase and lowercase letters, digits, spaces, and punctuation marks. The string may contain duplicates and can be in any case.
// Output
// A list of characters (in lowercase) that are missing from the input string to make it a pangram. The output should be sorted in alphabetical order.
// Example
// Input: "The quick brown fox jumps over the lazy dog"

// Output: [] (since it is already a pangram)
// Input: "Hello World"

// Output: ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
// Input: "Pack my box with five dozen liquor jugs"

// Output: [] (since it is already a pangram)
// Constraints
// The input string may include any printable ASCII characters.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        try{
            System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        List<Character> missingChars = getMissingCharacters(sentence);
        System.out.println("Missing characters: " + missingChars);
    }

    public static List<Character> getMissingCharacters(String sentence) {
        sentence = sentence.replaceAll(" ", "").toLowerCase();

        boolean[] letters = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                letters[index] = true;
            }
        }

        List<Character> missingChars = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            if (!letters[i]) {
                char missingChar = (char) ('a' + i);
                missingChars.add(missingChar);
            }
        }

        return missingChars;
    }
}
