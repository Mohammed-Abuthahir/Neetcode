// 3903. Smallest Stable Index I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class firstStableIndex{
    public static int firstindex(int[] nums, int k){
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            suffix[i] = Math.min(suffix[i + 1], nums[i]);
        }
        int max = 0;
        for(int i = 0;i < nums.length; i++){
            max = Math.max(max, nums[i]);
            int instability = max - suffix[i];
            if(instability <= k){
                return i;
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
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = firstindex(nums,k);
        System.out.println(result);
    }
}