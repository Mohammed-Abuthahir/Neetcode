// Subset Sum Problem
// Given an array of positive integers arr[] and a value sum,
//  determine if there is a subset of arr[] with sum equal to given sum. 
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isSubsetSum{
    public static boolean subsetsum(int[] nums, int sum){
        int[][] dp = new int[nums.length][sum + 1];
        for(int i = 0;i < dp.length;i++){
            dp[i][0] = 1;
        }
        for(int j = 1;j <= sum; j++){
            if(nums[0] == j) dp[0][j] = 1;
            else dp[0][j] = 0;
        }
        for(int i = 1;i < nums.length; i++){
            for(int j = 1; j <= sum; j++){
                if(j < nums[i]) dp[i][j] = dp[i - 1][j];
                else if(dp[i - 1][j] == 1) dp[i][j] = 1;
                else dp[i][j] = dp[i - 1][j - nums[i]];
            }
        }
        return dp[nums.length - 1][sum] == 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int size = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[size];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Sum :");
        int sum = scan.nextInt();
        boolean result = subsetsum(nums, sum);
        System.out.println(result);
    }
}