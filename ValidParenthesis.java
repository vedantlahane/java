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
