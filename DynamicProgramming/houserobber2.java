// House Robber 2
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class houserobber2{
    public static int circularhouse(int[] nums){
        if(nums.length == 1) return nums[0];
        int first = nums[0];
        int last =  nums[nums.length - 1];
        int n = nums.length;
        nums[nums.length - 1] = 0;
        int[] dp1 = new int[nums.length + 1];
        dp1[0] = nums[0]; dp1[1] = Math.max(nums[0], nums[1]);
        for(int i = 2;i < nums.length; i++){
            dp1[i] = Math.max(dp1[i - 1], nums[i] + dp1[i - 2]);
        }
        nums[nums.length - 1] = last;
        nums[0] = 0;
        int[] dp2 = new int[nums.length + 1];
        dp2[0] = nums[0]; dp2[1] = Math.max(nums[0], nums[1]);
        for(int i = 3;i < nums.length; i++){
            dp2[i] = Math.max(dp2[i - 1], nums[i] + dp2[i - 2]);
        }
        return Math.max(dp1[n - 1], dp2[n - 1]);
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
        int result = circularhouse(nums);
        System.out.println(result);
    }
}