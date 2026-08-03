// First Missing Positive
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class firstMissingPositive{
    public static int missing(int[] nums){
        // Arrays.sort(nums);
        // int missing = 1;
        // for(int num : nums){
        //     if(num > 0 && missing == num){
        //         missing++;
        //     }
        // }
        // Set 
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num > 0) set.add(num);
        }
        int missing = 1;
        while(set.contains(missing)){
            missing++;
        }
        return missing;
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
        int result = missing(nums);
        System.out.println("First Missing Positive is to : "+result);
    }
}