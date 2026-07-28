// Sort Array by Parity
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sortArrayByParity{
    public static int[] sortarraybyparity(int[] nums){
        int left = 0; int right = nums.length - 1;
        while(left <= right){
            if(nums[left] % 2 != 0 && nums[right] % 2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            else if(nums[left] % 2 != 0 && nums[right] % 2 != 0) right--;
            else left++;
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
        int[] result = sortarraybyparity(nums);
        System.out.println(Arrays.toString(result));
    }
}