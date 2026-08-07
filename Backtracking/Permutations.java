// Permutations
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Permutations{
    public static void GetAllPermutations(List<List<Integer>> result, int[] nums, int idx){
        if(idx == nums.length - 1){
            List<Integer> arr = new ArrayList<>();
            for(int i = 0;i < nums.length; i++){
                arr.add(nums[i]);
            }
            result.add(new ArrayList<>(arr));
        }
        for(int i = idx; i < nums.length; i++){
            swap(i, idx, nums);
            GetAllPermutations(result, nums, idx + 1);
            swap(i, idx, nums);
        }
    }
    public static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<List<Integer>> findPermutations(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        GetAllPermutations(result, nums, 0);
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        List<List<Integer>> result = findPermutations(nums);
        System.out.println(result);
    }
}