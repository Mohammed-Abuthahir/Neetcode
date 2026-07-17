// Binary Search
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class search{
    public static int binarySearching(int[] nums, int target){
        int left = 0; int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left + 1) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target) left++;
            else if(nums[mid] > target) right--;
            else {
                left++;
                right--;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Target :");
        int target = scan.nextInt();
        int result = binarySearching(nums, target);
        System.out.print(result);
    }
}
