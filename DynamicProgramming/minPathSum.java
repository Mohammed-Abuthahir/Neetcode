// 64. Minimum Path Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minPathSum{
    public static int minPathsum(int[][] nums){
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                if(i == 0 && j == 0) continue;
                else if(i == 0) nums[i][j] = nums[i][j] + nums[i][j - 1];
                else if(j == 0) nums[i][j] = nums[i][j] + nums[i - 1][j];
                else nums[i][j] = nums[i][j] + Math.min(nums[i][j - 1], nums[i - 1][j]);
            }
        }
        return nums[nums.length - 1][nums[0].length - 1];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int r = scan.nextInt();
        System.out.println("Enter the Cols :");
        int c = scan.nextInt();
        System.out.println("Enter the Matrix : ");
        int[][] nums = new int[r][c];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = minPathsum(nums);
        System.out.println(result);
    }
}