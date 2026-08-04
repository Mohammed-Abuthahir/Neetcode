// Find K Closest Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findClosestElements{
    public static List<Integer> findKclosestElement(int[] nums, int k, int x){
        int left = 0;
        int right = nums.length - 1;
        while(right - left + 1 > k){
            if(Math.abs(nums[left] - x) > Math.abs(nums[right] - x)) left++;
            else right--;
        }
        List<Integer> arr = new ArrayList<>();
        for(int i = left; i <= right; i++){
            arr.add(nums[i]);
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size ;");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        System.out.println("Enter the x :");
        int x = scan.nextInt();
        List<Integer> result = findKclosestElement(nums, k, x);
        System.out.println(result);
    }
}