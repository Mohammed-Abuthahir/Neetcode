// Minimum Difference Between Highest And Lowest of K Scores
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumDifference{
    public static int minimumDiff(int[] nums, int k){
        Arrays.sort(nums);
        int minimum = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0;right < nums.length; right++){
            int max = 0; int min = Integer.MAX_VALUE;
            while(right - left + 1 == k){
                for(int i = left; i <= right; i++){
                    max = Math.max(max, nums[i]);
                    min = Math.min(min, nums[i]);
                }
                left++;
                minimum = Math.min(minimum, max - min);
            }
        }
        return minimum;
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = minimumDiff(nums, k);
        System.out.println("Minimum Difference Between Highest And Lowest of K Scores : "+result);
    }

}
