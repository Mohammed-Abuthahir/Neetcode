// Longest Strictly Increasing or Strictly Decreasing Subarray
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class longestMonotonicSubarray{
    public static int longestincreaseordecrease(int[] nums){
        int count1 = 1;  int count2 = 1;
        int max1 = 0; int max2 = 0;
        for(int i = 0;i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                count1++;
                max1 = Math.max(max1, count1);
            }
            else{
                count1 = 1;
            }
        }
        for(int i = 0;i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                count2++;
                max2 = Math.max(max2, count2);
            }
            else{
                count2 = 1;
            }
        }
        return Math.max(max1, max2) == 0 ? 1 : Math.max(max1, max2);
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
        int result = longestincreaseordecrease(nums);
        System.out.println("Longest Increasing or Decreasing SubArray is to :"+result);
    }
}