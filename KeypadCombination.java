import java.util.*;
public class KeypadCombination {

    public static void combinations1(int firstDigit, int secondDigit, String[] keypad) {
        String firstChars = keypad[firstDigit];
        String secondChars = keypad[secondDigit];
        List<String> combinations = new ArrayList<>();
        for (char c1 : firstChars.toCharArray()) {
            for (char c2 : secondChars.toCharArray()) {
                combinations.add("" + c1 + c2);
            }
        }
        if (combinations.isEmpty()) {
            System.out.println("No combinations found for the given digits.");
        } else {
            System.out.println("Combinations: " + combinations);
        }
    }

    public static void combinationsOptimized() {
        

    }
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two digit number: ");
        int n = sc.nextInt();
        if(n < 10 || n > 99) {
            System.out.println("Please enter a valid two-digit number.");
            return;
        }
        int firstDigit = n / 10;
        int secondDigit = n % 10;
        String[] keypad = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        combinations1(firstDigit, secondDigit, keypad);
        combinationsOptimized();
        
        sc.close();

    }
}
