import java.util.Scanner;

public class RecursivePattern{
    public static void pattern(int n,int temp,boolean flag) {
        if(flag && temp== n) return;
        System.out.print(temp + " ");
        if(temp<=0) {
            flag= true;}
        if(!flag){
            pattern(n,temp-7,false);
        } 
        else{
            pattern(n,temp+7,true);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n =sc.nextInt();
        System.out.println("The pattern is: ");
        pattern(n, n - 7, false);
        System.out.print(n);
        sc.close();
    }
}
