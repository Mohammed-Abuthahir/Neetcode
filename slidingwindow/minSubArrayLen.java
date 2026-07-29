// Minimum Size Subarray Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minSubArrayLen{
    public static int minimumsize(int[] nums, int target){
        int sum = 0;
        int left = 0;
        int min = Integer.MAX_VALUE;
        for(int right = 0;right < nums.length; right++){
            sum = sum + nums[right];
            while(sum >= target){
                min = Math.min(right - left + 1, min);
                sum = sum - nums[left];
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
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
        System.out.println("Enter the target");
        int target = scan.nextInt();
        int result = minimumsize(nums, target);
        System.out.println(result);
    }
}