// Min Cost Climbing Stairs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minCostClimbingStairs{
    public static int minCost(int[] nums){
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 0; dp[1] = 0;
        for(int i = 2;i <= nums.length; i++){
            dp[i] = Math.min(dp[i - 1] + nums[i - 1], dp[i - 2] + nums[i - 2]);
        }
        return dp[n];
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
        int result = minCost(nums);
        System.out.println(result);
    }
}