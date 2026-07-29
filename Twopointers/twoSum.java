// Two Integer Sum II
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class twoSum{
    public static int[] twosum(int[] nums, int target){
        int left = 0; int right = nums.length - 1;
        while(left <= right){
            int sum = nums[left] + nums[right];
            if(sum == target) return new int[]{left + 1, right + 1};
            else if(sum < target) left++;
            else right--;
        }
        return new int[]{};
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
        System.out.println("Enter the Target :");
        int target = scan.nextInt();
        int[] result = twosum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}