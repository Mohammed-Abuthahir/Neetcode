// Climbing Stairs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class climbStairs{
    public static int Memozation(int n, int[] dp){
        if(n <= 2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = Memozation(n - 1, dp) + Memozation(n - 2, dp);
    }
    public static int tabulation(int n, int[] dp){
        dp[1] = 1; dp[2] = 2;
        for(int i = 3;i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }
    public static int climbingstairs(int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int memo = Memozation(n, dp);
        int tabu = tabulation(n, dp);
        return tabu;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int result = climbingstairs(n);
        System.out.println("Number of distinct ways to climb to the top of the staircase : "+result);
    }
}