// 739. Daily Temperatures
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class dailyTemperatures{
    public static int[] dailyTemperature(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i = 0;i < nums.length; i++){
            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                int top = stack.pop();
                ans[top] = i - top;
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = dailyTemperature(nums);
        System.out.println(Arrays.toString(result));
    }
}