// Sort Colors
// Follow up: Could you come up with a one-pass algorithm using only constant extra space?
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class SortArray{
    public static void sortArray(int[] nums){
        int left = 0; int mid = 0; int right = nums.length - 1;
        while(mid <= right){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                mid++; left++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                mid++;
            }
        }
        System.out.println(Arrays.toString(nums));
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
        sortArray(nums);
    }
}