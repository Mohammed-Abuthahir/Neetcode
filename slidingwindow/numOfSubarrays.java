// Number of Sub Arrays of Size K and Avg Greater than or Equal to Threshold
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class numOfSubarrays{
    public static int countksizeavgsubarray(int[] nums, int k, int threshold){
       int count = 0;
        int windowSum = 0;
        for(int i = 0;i < k; i++) windowSum = windowSum + nums[i];
        int avg = windowSum / k;
        if(avg >= threshold) count++;
        for(int i = k; i < nums.length; i++){
            windowSum = (windowSum - nums[i - k]) + nums[i];
            avg = windowSum / k;
            if(avg >= threshold) count++;
        }
        return count;
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
        System.out.println("Enter the ThresHold :");
        int threshold = scan.nextInt();
        int result = countksizeavgsubarray(nums,k, threshold);
        System.out.println(result);
    }
}