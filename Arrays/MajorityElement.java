// Majority Element
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class MajorityElement{
    public static int majorityelements(int[] nums){
        // Boyer-Moore Voting algorthum
        int candidate = 0; int count = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate) count++;
            else count--;
        }
        
        // HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > nums.length / 2){
                return key;
            }
        }
        return candidate;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size ;");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = majorityelements(nums);
        System.out.println("Majority Element in the Arrays is : "+result);
    }
}