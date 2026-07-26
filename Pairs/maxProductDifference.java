// 1913. Maximum Product Difference Between Two Pairs
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class maxProductDifference{
    public static int maxProduct(int[] nums){
       Arrays.sort(nums);
       return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
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
        int result = maxProduct(nums);
        System.out.println(result);
    }
}