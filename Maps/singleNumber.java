// Single Number III
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class singleNumber{
    public static int[] singleNumber(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer> arr = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == 1) arr.add(key);
        }
        int[] num = new int[arr.size()];
        for(int i = 0;i < arr.size(); i++){
            num[i] = arr.get(i);
        }
        return num;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int size = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[size];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = singleNumber(nums);
        System.out.println(Arrays.toString(result));
    }
}