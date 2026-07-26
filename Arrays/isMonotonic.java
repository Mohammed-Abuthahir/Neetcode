// Monotonic Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isMonotonic{
    public static boolean ismonotone(int[] nums){
        int n = nums.length;
        if(nums[0] <= nums[n - 1]){
            for(int i = 1;i < nums.length; i++){
                if(nums[i - 1] > nums[i]){
                    return false;
                }
            }
            return true;
        }else{
            for(int i = 1;i < nums.length; i++){
                if(nums[i - 1] < nums[i]){
                    return false;
                }
            }
            return true;
        }
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
        boolean result = ismonotone(nums);
        System.out.println(result);
    }
}