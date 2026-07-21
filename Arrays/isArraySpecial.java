// Special Array I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isArraySpecial{
    public static boolean Arrayspecial(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if((nums[i - 1] % 2 == 0 && nums[i] % 2 == 0) &&
             nums[i - 1] % 2 != 0 && nums[i] % 2 != 0){
                return false;
             }
        }
        return true;
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
        boolean result = Arrayspecial(nums);
        System.out.println(result);
    }
}