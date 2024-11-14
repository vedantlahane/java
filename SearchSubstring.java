import java.util.Scanner;

public class SearchSubstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the substring to search: ");
        String sub = sc.nextLine();
        int index = str.indexOf(sub);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
        sc.close();
    }
}
