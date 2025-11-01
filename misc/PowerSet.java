import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class PowerSet {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
        result.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    public static void main( String argd[] ){
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int[] nums = new int[n];
        for( int i = 0; i < n; i++ ){
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> result = subsets(nums);
        for( List<Integer> l : result ){
            System.out.print("[");
            for( int i : l ){
                System.out.print(i + " ");
            }
            System.out.println("]");
        }
        sc.close();
    }
}
