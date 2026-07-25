// Rotate Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class rotateArray{
    public static void rotateFunc(int[] nums, int left, int right){
        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void rotate(int[] nums, int k){
        rotateFunc(nums, 0, nums.length - 1);
        rotateFunc(nums, 0, k - 1);
        rotateFunc(nums, k, nums.length - 1);
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}