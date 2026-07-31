// arraySign
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class arraySign{
    public static int arraySign(int[] nums){
        int sign = 1;
        for(int num : nums){
            if(num == 0) return 0;
            else if(num < 0) sign = -sign;
        }
        return sign > 0 ? 1 : -1;
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
        int result = arraySign(nums);
        System.out.println(result);
    }
}