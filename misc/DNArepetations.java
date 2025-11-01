// Time limit: 1.00 s Memory limit: 512 MB
// You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.

// Input
// The only input line contains a string of 
// n
// n characters.

// Output
// Print one integer: the length of the longest repetition.

// Constraints
// 1
// ≤
// n
// ≤
// 1
// 0
// 6
// 1≤n≤10 
// 6
 
// Example
// Input:

// ATTCGGGA
// Output:

// 3
import java.util.*;
import java.util.Scanner;
public class DNArepetations {
    public static int longestRepetations(String s){
        int preMax[] = new int[s.length()];
        char pre = s.charAt(0);
        int count = 1;
        preMax[0] = 1;
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if( c == pre ){
                count++;
            }
            else{
                count = 1;
                pre = c;
            }
            preMax[i] = Math.max(preMax[i - 1], count);
        }
        return preMax[s.length()-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestRepetations(s));
    }
}