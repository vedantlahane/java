import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class WordInWord {
    public static List<String> wordInWord(String[] words){
        int n = words.length;
        List<String> ans = new ArrayList<>();

        for( int i = 0 ; i < n ; i++ ){
            for( int j = 0 ; j < n ; j++ ){
                if( i != j && words[i].contains(words[j]) ){
                    ans.add(words[j]);
                }
            }
        }

        return ans;
    }

    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words");
        int n = sc.nextInt();
        String[] words = new String[n];
        System.out.println("Enter the words");
        for( int i = 0 ; i < n ; i++ ){
            words[i] = sc.next();
        }
        List<String> ans = wordInWord(words);
        System.out.println("The words that are present in other words are:");
        for( String word : ans ){
            System.out.print(word + " ");
        }
        sc.close();
    }
}
