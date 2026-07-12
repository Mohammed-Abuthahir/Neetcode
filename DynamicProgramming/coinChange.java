// 518. Coin Change II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class coinChange{
    public static int coinchange(int[] coins, int amount){
       int[][] dp = new int[coins][amount + 1];
       for(int i = 0;i < coins.length; i++){
            dp[i][0] = 1;
       }
       for(int j = 1; j <= amount ; j++){
            if(j % coins[0] == 0){
                dp[0][j] = 1;
            }
            else{
                dp[0][j] = 0;
            }
       }
       for(int i = 1; i < coins.length; i++){
            for(int j = 1;j <= amount; j++){
                if(j < coins[i]) dp[i][j] = dp[i - 1][j];
                else dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i]];
            }
       }
       return dp[coins.length - 1][amount];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] coins = new int[n];
        for(int i = 0;i < coins.length; i++){
            coins[i] = scan.nextInt();
        }
        System.out.println("Enter the Amount :");
        int amount = scan.nextInt();
        int result = coinchange(coins, amount);
        System.out.println(result);
    }
}