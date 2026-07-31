// Missing Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class missingNumber{
    public static int missingnumber(int[] nums){
        int sum1 = 0; int sum2 = 0;
        for(int i = 1;i < nums.length; i++){
            sum1 = sum1 + i;
            sum2 = sum2 + nums[i - 1];
        }
        return Math.abs(sum2 - sum1);
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
        int result = missingnumber(nums);
        System.out.println(result);
    }
}