// Maximum Subarray
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxSubArraySum{
    public static int KadansAlgo(int[] nums){
        int currSum = 0; int maxSum = -1;
        for(int num : nums){
            currSum = currSum + num;
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = KadansAlgo(nums);
        System.out.println(result);
    }
}