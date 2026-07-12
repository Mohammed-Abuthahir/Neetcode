// Fibonacci Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Fibbonacci{
    // Tabulation
    public static int fib(int n){
        if(n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0; dp[1] = 1;
        for(int i = 2;i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // Memozation
    public static int fiboonacci(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fiboonacci(n - 1 , dp) + fiboonacci(n - 2, dp);
    }
    public static int fib(int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        fiboonacci(n , dp);
        return dp[n];
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = fib(n);
        System.out.println(result);
    }
}