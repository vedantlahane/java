import java.util.*;
public class ValidExpression {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> s = new Stack<>();
        String ope = "+-*/";
        boolean flag = true;
        for(char c: str.toCharArray()){
            if(s.isEmpty() && (Character.isLetter(c) || Character.isDigit(c) || c=='-')) s.push(c);
            else if(!s.isEmpty() && (Character.isLetter(s.peek()) || Character.isDigit(s.peek())) && ope.indexOf(c) !=-1) s.push(c);
            else if(!s.isEmpty() && (Character.isLetter(s.peek()) || Character.isDigit(s.peek())) && (Character.isLetter(c) || Character.isDigit(c))){
            flag = false;
            break;
            }
            else if(!s.isEmpty() && ope.indexOf(s.peek()) != -1 && ope.indexOf(c) != -1){
            flag = false;
            break;
            }
            else if(!s.isEmpty() && ope.indexOf(s.peek()) != -1 && (Character.isLetter(c) || Character.isDigit(c))) s.push(c);
            else flag = false;
        }
        if((Character.isLetter(s.peek()) || Character.isDigit(s.peek())) && flag) System.out.println("Valid Expression");
        else System.out.println("Invalid Expression");
        sc.close();

    }
}
