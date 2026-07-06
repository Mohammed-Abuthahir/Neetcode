// Contains Duplicate
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ContainsDuplicates{
    public static boolean hasDuplicate(int[] nums){
        // 1 . sorting algorthum
        // Arrays.sort(nums);
        // for(int i = 1;i < nums.length; i++){
        //     if(nums[i - 1] == nums[i]){
        //         return true;
        //     }
        // }
 
        // 2. HashSet
        HashSet <Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)) return true;
        }

        // 3. HashMap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num : nums){
        //     if(map.containsKey(num)) return true;
        //     else map.put(num, 1);
        // }

        // 4. HashTable
        // Hashtable <Integer, Integer> table = new Hashtable<>();
        // for(int num : nums){
        //     if(table.containsKey(num)) return true;
        //     else table.put(num, 1);
        // }

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
        boolean result = hasDuplicate(nums);
        System.out.println(result);
    }
}