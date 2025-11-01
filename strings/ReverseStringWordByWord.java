import java.util.Scanner;
public class ReverseStringWordByWord {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if( i != 0) reversed.append(" ");
        }
        System.out.println("Reversed string: " + reversed.toString());

        //another way to reverse a string word by word without using split
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == ' '){
                if(word.length() > 0){
                    result.append(word);
                    result.append(" ");
                    word.setLength(0);
                }
            } 
            else word.insert(0, str.charAt(i));
        }
        
        // Append the last word if any
        if(word.length() > 0) {
            result.append(word);
        }
        
        System.out.println("Reversed string without using split: " + result.toString());
        sc.close();
    }
    
}
