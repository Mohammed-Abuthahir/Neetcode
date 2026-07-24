// Products of Array Except Self
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class productExceptSelf{
    public static int[] productexceptself(int[] nums){
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = 1;  suffix[suffix.length - 1] = 1;
        for(int i = 1;i < prefix.length; i++) prefix[i] = prefix[i - 1] * nums[i - 1];
        for(int i = suffix.length - 2; i >= 0; i--) suffix[i] = suffix[i + 1] * nums[i + 1];
        for(int i = 0;i < nums.length; i++) nums[i] = prefix[i] * suffix[i];
        return nums;
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
        int[] result = productexceptself(nums);
        System.out.println(Arrays.toString(result));
    }
}