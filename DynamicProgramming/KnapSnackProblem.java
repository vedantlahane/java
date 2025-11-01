package DynamicProgramming;
import java.util.Scanner;
public class KnapSnackProblem {
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number of items: ");
        int n = sc.nextInt();
        int weight[] = new int[ n ];
        int value[] = new int[ n ];
        System.out.println("Enter the weight of the items: ");
        for( int i = 0 ; i < n ; i++ ){
            weight[ i ] = sc.nextInt();
        }
        System.out.println("Enter the value of the items: ");
        for( int i = 0 ; i < n ; i++ ){
            value[ i ] = sc.nextInt();
        }
        System.out.println("Enter the capacity of the knapsack: ");
        int W = sc.nextInt();
        int vw[] = new int[ n];// value per unit weight
        for( int i = 0 ; i < n ; i++ ){
            vw[ i ] = value[ i ] / weight[ i ];
        }
        // Sort items by value per unit weight in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            if (vw[j] < vw[j + 1]) {
                // Swap vw
                int tempVW = vw[j];
                vw[j] = vw[j + 1];
                vw[j + 1] = tempVW;
                
                // Swap weight
                int tempWeight = weight[j];
                weight[j] = weight[j + 1];
                weight[j + 1] = tempWeight;
                
                // Swap value
                int tempValue = value[j];
                value[j] = value[j + 1];
                value[j + 1] = tempValue;
            }
            }
        }

        int totalValue = 0;
        int remainingCapacity = W;

        for (int i = 0; i < n; i++) {
            if (weight[i] <= remainingCapacity) {
            remainingCapacity -= weight[i];
            totalValue += value[i];
            } else {
            totalValue += vw[i] * remainingCapacity;
            break;
            }
        }

        System.out.println("Maximum value in Knapsack = " + totalValue);
        sc.close();
    }
}
