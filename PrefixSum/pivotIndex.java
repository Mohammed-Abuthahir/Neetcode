// Find Pivot Index
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class pivotindex{
    public static int pivotindex(int[] nums){
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = nums[0];
        suffix[nums.length - 1] = nums[nums.length - 1];
        for(int i = 1;i < prefix.length; i++){
            prefix[i] = prefix[i - 1]  + nums[i];
        }
        for(int i = suffix.length - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] + nums[i];
        }
        for(int i = 0;i < prefix.length; i++){
            if(prefix[i] == suffix[i]){
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
        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = pivotindex(nums);
        System.out.println(result);
    }
}