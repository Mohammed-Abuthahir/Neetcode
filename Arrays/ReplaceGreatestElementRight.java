// Replace Elements With Greatest Element On Right Side
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ReplaceGreatestElementRight{
    public static int[] replaceElements(int[] nums){
        //1.one Loop
        int maxRight = -1;
        for(int i = nums.length - 1; i > 0; i--){
            int current = nums[i];
            nums[i] = maxRight;
            maxRight = Math.max(maxRight, current)
        }
        return nums;

        //  2.Two Loops
        // for(int i = nums.length - 1; i > 0; i--){
        //     nums[i - 1] = Math.max(nums[i], nums[i - 1]);
        // }
        // for(int i = 0;i < nums.length - 1;i++){
        //     nums[i] = nums[i + 1];
        // }
        // nums[nums.length - 1] = -1;
        // return nums

        // 3.new Arrays
        // int[] arr = new int[nums.length];
        // arr[arr.length - 1] = nums[nums.length - 1];
        // for(int i = nums.length - 1; i > 0; i--){
        //     arr[i - 1] = Math.max(nums[i], nums[i - 1]);
        // }
        // for(int i = 0;i < arr.length - 1; i++){
        //     arr[i] = arr[i + 1];
        // }
        // arr[arr.length - 1] = -1;

        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = replaceElements(nums);
        System.out.println(Arrays.toString(result));
    }
}