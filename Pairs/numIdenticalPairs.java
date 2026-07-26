// Number of Good Pairs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class numIdenticalPairs{
    public static int numberofGoodPairs(int[] nums){
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int key : map.keySet()) sum = sum + (map.get(key) * (map.get(key) - 1)) / 2;
        return sum;
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
        int result = numberofGoodPairs(nums);
        System.out.println(result);
    }
}