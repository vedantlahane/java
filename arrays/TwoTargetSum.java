import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class TwoTargetSum {
    public static void main(String args[]){
        try{
            System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }        
        int arr[] = {4,2,9,10,6,8,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum");
        int target = sc.nextInt();
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            if( arr[left] + arr[right] == target ){
                System.out.println("Target found !! The elements are " + arr[left] + " and " + arr[right]);
                break;

            }
            else if(arr[left] + arr[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        if(left >= right){
            System.out.println("Target not found !!");
        }
        sc.close();

    }
    
}
