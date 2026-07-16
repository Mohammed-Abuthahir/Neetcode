// Max Consecutive Ones
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxConcecutiveOnce{
    public static int maxconcecutiveonce(int[] nums){
        int count = 0; int max = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count = 0;
            }
        }
        return max;
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
        int result = maxconcecutiveonce(nums);
        System.out.println("Max Concecutive one is to : "+result);
    }
}