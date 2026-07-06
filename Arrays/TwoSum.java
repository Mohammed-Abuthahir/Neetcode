// Two Sum
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class TwoSum{
    public static int[] twosum(int[] nums,int target){
        // HashMap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     int compliment = target - nums[i];
        //     if(map.containsKey(compliment)){
        //         return new int[]{map.get(compliment), i};
        //     }
        //     map.put(nums[i], i);
        // }

        // HashTable
        Hashtable < Integer, Integer> table = new Hashtable<>();
        for(int i = 0;i < nums.length; i++){
            int compliment = target - nums[i];
            if(table.containsKey(compliment)){
                return new int[]{table.get(compliment), i};
            }
            table.put(nums[i], i);
        }
        return new int[]{};
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
        System.out.println("Enter the Target");
        int target = scan.nextInt();
        int[] result = twosum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}