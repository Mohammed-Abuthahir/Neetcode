// Find a Peak Element II -> Leetcode
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findPeakGrid{
    public static int[] findPeak(int[][] nums){
        int row = nums.length; int cols = nums[0].length;
        for(int i = 0;i < row; i++){
            for(int j = 0;j < cols; j++){
                boolean peak = true;
                if(i > 0 && nums[i][j] < nums[i - 1][j]) peak = false;
                if(i < row - 1 && nums[i][j] < nums[i + 1][j]) peak = false;
                if(j > 0 && nums[i][j] < nums[i][j - 1]) peak = false;
                if(j < cols - 1 && nums[i][j] < nums[i][j + 1]) peak = false;
                if(peak) return new int[]{i, j};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix : ");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int[] result = findPeak(nums);
        System.out.println(Arrays.toString(result));
    }
}