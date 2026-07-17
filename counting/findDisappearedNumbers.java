// Find All Numbers Disappeared in An Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class findDisappearedNumbers{
    public static List<Integer> finddisapper(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1;i <= nums.length; i++) set.add(i);
        for(int i = 0;i < nums.length; i++) set.remove(nums[i]);
        return new ArrayList<>(set);
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
        List<Integer> result = finddisapper(nums);
        System.out.println(result);
    }
}