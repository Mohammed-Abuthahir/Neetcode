// Concatenation of Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class ConcatinationofArray{
    public static int[] getConcatinations(int[] nums){
        int[] arr = new int[nums.length << 1];
        for(int i = 0;i < arr.length; i++){
            arr[i] = nums[i % nums.length];
        }

        // Two ForLoops 
        // int[] arr = new int[nums.length << 1];
        // int idx = 0;
        // for(int i = 0;i < nums.length; i++){
        //     arr[idx++] = nums[i];
        // }
        // for(int i = 0;i < nums.length; i++){
        //     arr[idx++] = nums[i];
        // }

        return arr;
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
        int[] result = getConcatinations(nums);
        System.out.println(Arrays.toString(result));
    }
}