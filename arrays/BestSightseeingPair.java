import java.util.Scanner;

class BestSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        // Initialize the maximum score to the smallest possible integer value.
        int ans = Integer.MIN_VALUE;
        
        // m stores the best value of (values[i] + i) seen so far.
        int m = values[0];
        
        // Iterate through the array starting from the second element.
        for (int i = 1; i < values.length; i++) {
            // Calculate the score for the current pair (m, values[i] - i).
            // Update the maximum score (ans) if the current pair's score is greater.
            if (values[i] - i + m > ans) {
                ans = values[i] - i + m;
            }
            
            // Update m to store the best value of (values[i] + i) so far.
            // This ensures that we always consider the optimal previous spot.
            if (values[i] + i > m) {
                m = values[i] + i;
            }
        }
        
        // Return the maximum score.
        return ans;
    }

    // Main method for testing the solution.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of elements in the array.
        System.out.print("Enter the number of sightseeing spots: ");
        int n = scanner.nextInt();
        
        // Create an array to store the values.
        int[] values = new int[n];
        
        // Prompt the user to enter the values.
        System.out.println("Enter the values of the sightseeing spots:");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        
        // Create an instance of BestSightseeingPair and compute the result.
        BestSightseeingPair solution = new BestSightseeingPair();
        int result = solution.maxScoreSightseeingPair(values);
        
        // Print the result.
        System.out.println("Maximum Score of Sightseeing Pair: " + result);
        
        // Close the scanner.
        scanner.close();
    }
}
