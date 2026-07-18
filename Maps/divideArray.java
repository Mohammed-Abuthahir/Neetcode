// Divide Array Into Equal Pairs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class divideArray{
    public static boolean dividearray(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : map.values()){
            if(num % 2 != 0) return false;
        }
        return true;
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
        boolean result = dividearray(nums);
        System.out.println(result);
    }
}