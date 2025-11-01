import java.util.Scanner;
public class MinCostOfJoiningNRopes {
    public static int minCost( int ropes[]){
        int n = ropes.length;
        int cost = 0;
        while(n>1){
            int min1 = 0, min2 = 1;
            if(ropes[min1]>ropes[min2]){
                int temp = min1;
                min1 = min2;
                min2 = temp;
            }
            for(int i=2; i<n; i++){
                if(ropes[i]<ropes[min1]){
                    min2 = min1;
                    min1 = i;
                }
                else if(ropes[i]<ropes[min2]){
                    min2 = i;
                }
            }
            int newRope = ropes[min1]+ropes[min2];
            cost += newRope;
            if(min1 == n-1){
                int temp = min1;
                min1 = min2;
                min2 = temp;
            }
            ropes[min1] = newRope;
            ropes[min2] = ropes[n-1];
            n--;
        }
        return cost;
    }
    public static void main( String args[] ){
        Scanner sc =new Scanner( System.in);
        System.out.println("Enter the number of ropes: ");
        int n = sc.nextInt();
        int[] ropes = new int[n];
        System.out.println("Enter the length of ropes: ");
        for(int i=0; i<n; i++){
            ropes[i] = sc.nextInt();
        }
        System.out.println("Minimum cost of joining the ropes: "+minCost(ropes));
        sc.close();
    }
}
