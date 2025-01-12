// A parentheses string is a non-empty string consisting only of '(' and ')'. It is valid if any of the following conditions is true:

// It is ().
// It can be written as AB (A concatenated with B), where A and B are valid parentheses strings.
// It can be written as (A), where A is a valid parentheses string.
// You are given a parentheses string s and a string locked, both of length n. locked is a binary string consisting only of '0's and '1's. For each index i of locked,

// If locked[i] is '1', you cannot change s[i].
// But if locked[i] is '0', you can change s[i] to either '(' or ')'.
// Return true if you can make s a valid parentheses string. Otherwise, return false.

 

// Example 1:


// Input: s = "))()))", locked = "010100"
// Output: true
// Explanation: locked[1] == '1' and locked[3] == '1', so we cannot change s[1] or s[3].
// We change s[0] and s[4] to '(' while leaving s[2] and s[5] unchanged to make s valid.
// Example 2:

// Input: s = "()()", locked = "0000"
// Output: true
// Explanation: We do not need to make any changes because s is already valid.
// Example 3:

// Input: s = ")", locked = "0"
// Output: false
// Explanation: locked permits us to change s[0]. 
// Changing s[0] to either '(' or ')' will not make s valid.
 

// Constraints:

// n == s.length == locked.length
// 1 <= n <= 105
// s[i] is either '(' or ')'.
// locked[i] is either '0' or '1'.

import java.util.Stack;
import java.util.Scanner;

public class ParenthesisStringCheck {
    public boolean canBeValid(String s, String locked) {
        int stringLength = s.length();
        if (stringLength % 2 == 1) {
            return false;
        }

        Stack<Integer> openIndices = new Stack<>();
        Stack<Integer> unlockedIndices = new Stack<>();
        for (int i = 0; i < stringLength; i++) {             
            if (locked.charAt(i) == '0') {
                unlockedIndices.push(i);
            } else if (s.charAt(i) == '(') {
                openIndices.push(i);
            }else if (s.charAt(i) == ')') {
                if (!openIndices.isEmpty()) {
                    openIndices.pop();
                } else if (!unlockedIndices.isEmpty()) {
                    unlockedIndices.pop();
                } else {
                    return false;
                }
            }
        }
        while (!openIndices.isEmpty() && !unlockedIndices.isEmpty() && openIndices.peek() < unlockedIndices.peek()) {
            openIndices.pop();
            unlockedIndices.pop();
        }
        if (openIndices.isEmpty() && !unlockedIndices.isEmpty()) {
            return unlockedIndices.size() % 2 == 0;
        }
        return openIndices.isEmpty();
    } 

    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println("Enter the locked string");
        String locked = sc.next();
        ParenthesisStringCheck obj = new ParenthesisStringCheck();
        System.out.println(obj.canBeValid(s, locked));
        sc.close();
    }
}
