// House Robber
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class houserobber{
    public static int rob(int[] nums){
       if(nums.length == 1) return nums[0];
       int n = nums.length;
       int[] dp = new int[n];
       dp[0] = 0; dp[1] = Math.max(nums[0], nums[1]);
       for(int i = 2;i < nums.length; i++){
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
       }
       return dp[n - 1];
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
        int result = rob(nums);
        System.out.println(result);
    }
}