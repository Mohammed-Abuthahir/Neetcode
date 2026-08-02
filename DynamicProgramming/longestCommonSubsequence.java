// 1143. Longest Common Subsequence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class longestCommonSubsequence{
    public static int longestcommon(String s1, String s2){
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for(int i = 0;i <= s1.length(); i++){
            dp[i][0] = 0;
        }
        for(int j = 1;j <= s2.length(); j++){
            dp[0][j] = 0;
        }
        for(int i = 1;i <= s1.length(); i++){
            for(int j = 1;j <= s2.length(); j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[s1.length()][s2.length()];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String s1 = scan.next();
        System.out.println("Enter the String 2 :");
        String s2 = scan.next();
        int result = longestcommon(s1, s2);
        System.out.println(result);
    }
}