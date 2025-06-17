import  java.util.*;
public class IPAddressValidOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP address:");
        String ip = sc.nextLine();
        String[] parts = ip.split("\\.");
        boolean isValid = true;
        if(parts.length != 4) isValid = false;
        else{
            for(String part: parts){
                int num = Integer.parseInt(part);
                if(num<0 ||num > 255){
                    isValid = false;
                    break;
                }
            }
        }
        if(isValid) System.out.println("IP address is Valid");
        else System.out.println("IP address is Invalid");
        sc.close();
    }
}
