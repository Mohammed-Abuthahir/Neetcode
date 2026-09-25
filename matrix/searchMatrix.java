// Search a 2D Matrix
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class searchMatrix{
    public static boolean searchMatrix(int[][] nums, int target){
        int n = nums.length; int m = nums[0].length;
        int low = 0; int high = (n * m) - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;
            if(nums[row][col] == target) return true;
            else if(nums[row][col] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int col = scan.nextInt();
        System.out.println("Enter the Matrix : ");
        int[][] nums = new int[row][col];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the Target : ");
        int target = scan.nextInt();
        boolean result = searchMatrix(nums, target);
        System.out.println(result);
    }
}