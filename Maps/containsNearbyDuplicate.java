// 219. Contains Duplicate II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class containsNearbyDuplicate{
    public static boolean containsduplicates(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
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
        boolean result = containsduplicates(nums, k);
        System.out.println(result);
    }
}