
import static java.lang.Math.sqrt;

public class primecheck{
    public static void main(String[] args){
        int num = 43;
        int twist = 0;
        while(num != 0){
            twist = twist*10 + num%10;
            num = num/10;
        } 
        for(int i = 2;i<=sqrt(twist);i++){
            if(twist%i==0){
                System.out.println("Not a prime number");
                break;
            }
        }
        for(int i = 2;i<=sqrt(num);i++){
            if(num%i==0){
                System.out.println("Not a prime number");
                break;
            }
        }
    }
}