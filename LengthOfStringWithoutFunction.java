import java.util.Scanner;
public class LengthOfStringWithoutFunction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int length = 0;
        String temp = "";
        while(temp != str){
            temp = str.substring(0, length);
            length++;
        }
        System.out.println("The length of the string is: " + (length - 1));
        
        //second method to find length without using inbuilt function

        
        str += '\0';

        length = 0;
        for(int i = 0 ; str.charAt(i) != '\0' ;i++){
            length++;
        }
        System.out.println("The length is: " + length);
        sc.close();
    }
}
