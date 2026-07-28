// singleNonDuplicate
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class singleNonDuplicate{
    public static int singleNon(int[] nums){
        int xor = 0;
        for(int num : nums) xor = xor ^ num;
        return xor;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = singleNon(nums);
        System.out.println(result);
    }
}