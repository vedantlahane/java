import java.util.Scanner;
public class BalancedParantheses {
    public static boolean isBalanced( String str ){
        char arr[] = new char[str.length()];
        int top = -1;
        for  ( int i = 0; i < str.length(); i++){
            if( str.charAt(i) == '(') arr[++top] = str.charAt(i);
            else if( str.charAt(i) == '[') arr[++top] = str.charAt(i);
            else if( str.charAt(i) == '{') arr[++top] = str.charAt(i);
            else if( str.charAt(i) == ')'){
                if( top == -1 || arr[top] != '(') return false;
                top--;
            }
            else if( str.charAt(i) == ']'){
                if( top == -1 || arr[top] != '[') return false;
                top--;
            }
            else if( str.charAt(i) == '}'){
                if( top == -1 || arr[top] != '{') return false;
                top--;
            }
        }
        if( top == -1){
            return true;
        } else {
            return false;
        }
    }
    public static void main( String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        if (isBalanced(str)) {
            System.out.println("The string has balanced parantheses.");
        } else {
            System.out.println("The string does not have balanced parantheses.");
        }
        sc.close();
    }
}
