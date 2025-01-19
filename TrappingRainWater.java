    import java.util.Scanner;
public class TrappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        if(n == 0){
            return 0;
        }
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        right[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += Math.min(left[i], right[i]) - height[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }

        System.out.println(trap(height));
        sc.close(); 
    }
}
