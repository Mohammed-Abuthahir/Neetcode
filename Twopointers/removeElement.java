// Remove Element
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removeElement{
    public static int removeelement(int[] nums, int val){
        int left = 0; int right = nums.length - 1; int idx = 0;
        while(left <= right){
            if(nums[left] == val || nums[right] == val) idx++;
            if(nums[left] == val && nums[right] != val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            else if(nums[left] != val && nums[right] != val) left++;
            else right--;
        }
        System.out.println(Arrays.toString(nums));
        return (nums.length - idx);
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
        System.out.println("Enter the Value :");
        int val = scan.nextInt();
        int result = removeelement(nums, val);
        System.out.println(result);
    }
}