// Sort an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class InsertionSort{
    public static int[] InsertionSort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
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
        int[] result = InsertionSort(nums);
        System.out.println(Arrays.toString(result));
    }
}