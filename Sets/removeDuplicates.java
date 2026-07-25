// Remove Duplicates From Sorted Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removeDuplicates{
    public static int removeduplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        for(int num : nums){
            if(!set.contains(num)){
                nums[idx++] = num;
            }
            set.add(num);
        }
        return idx;
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
        int result = removeduplicates(nums);
        int[] arr = Arrays.copyOf(nums, result);
        System.out.println(Arrays.toString(arr));
    }
}
