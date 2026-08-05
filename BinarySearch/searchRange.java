// Find First And Last Position of Element In Sorted Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class searchRange{
    public static int[] firstandlast(int[] nums, int target){
        int left = 0; int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                int first = mid; int last = mid;
                while(first > 0 && nums[first - 1] == target) first--;
                while(last < nums.length - 1 && nums[last + 1] == target) last++;
                return new int[]{first, last};
            }
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return new int[]{-1, -1};
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
        int[] result = firstandlast(nums, target);
        System.out.println(Arrays.toString(result));
    }
}