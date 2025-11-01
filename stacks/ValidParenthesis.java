//brute force approach 
// here we are using the replace method to remove the valid parenthesis from the string
// if the string is empty then return true else return false
// import java.util.Scanner;
// public class ValidParenthesis {
//     public static boolean isValid(String s) {
//         while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
//             s = s.replace("()", "").replace("[]", "").replace("{}", "");
//         }
//         return s.isEmpty();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(isValid(s));
//         sc.close();
//     }
// }

// Time Complexity: O(n)
// Space Complexity: O(n)
// Input: s = "()[]{}"
// Output: true
// Input: s = "([)]"
// Output: false
// Input: s = "{[]}"
// Output: true
// Input: s = "([)]"
// Output: false
// Input: s = "{[]}"
// Output: true
// Input: s = "([)]"
// Output: false
// Input: s = "{[]}"
// Output: true
// Input: s = "([)]"
// Output: false

// Optimized approach
// here we are using the stack to solve the problem
// if the character is opening bracket then push it into the stack
// if the character is closing bracket then check if the stack is empty or the top of the stack is not equal to the opening bracket of the closing bracket then return false
// else pop the element from the stack
// if the stack is empty then return true else return false
// Time Complexity: O(n)
// Space Complexity: O(n)
// Input: s = "()[]{}"
// Output: true
// Input: s = "([)]"
// Output: false

import java.util.Stack;
import java.util.Scanner;
public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> ch = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                ch.push(c);
            else {
                if (ch.isEmpty() || (c == ')' && ch.pop() != '(') || (c == '}' && ch.pop() != '{')
                        || (c == ']' && ch.pop() != '['))
                    return false;
            }
            // c.push(ch);
        }
        return ch.isEmpty();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s));
        sc.close();

    }
}

