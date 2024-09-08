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
