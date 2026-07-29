// Frog Jump -> GFG
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class FrogJump{
    public static int frogjump(int[] nums){
        if(nums.length == 1) return 0;
        int[] dp = new int[nums.length];
        dp[0] = 0; dp[1] = Math.abs(nums[0] - nums[1]);
        for(int i = 2;i < nums.length; i++){
            dp[i] = Math.min(dp[i - 1] + Math.abs(nums[i] - nums[i - 1]),
                    dp[i - 2] + Math.abs(nums[i] - nums[i - 2]));
        }
        return dp[nums.length - 1];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = frogjump(nums);
        System.out.println(result);
    }
}