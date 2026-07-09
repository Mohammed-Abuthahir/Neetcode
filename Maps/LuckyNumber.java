// Find Lucky Integer in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class LuckyNumber{
    public static int luckynumber(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num , 0) + 1);
        }
        int max = 0;
        for(int num : map.keySet()){
            if(map.get(num) == num) max = Math.max(max, num);
        }
        return max == 0 ? -1 : max;
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
        int result = luckynumber(nums);
        System.out.println("largest lucky integer in the array :"+result);
    }
}