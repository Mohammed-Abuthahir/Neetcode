// makeEqual
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class makeEqual{
    public static boolean makeequal(String[] nums){
        HashMap<Character, Integer> map = new HashMap<>();
        for(String str : nums){
            for(char c : str.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for(int val : map.values()){
            if(val % nums.length != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.next();
        }
        boolean result = makeequal(nums);
        System.out.print(result);
    }
}