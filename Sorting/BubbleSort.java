// Sort an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class BubbleSort{
    public static int[] BubbleSort(int[] nums){
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                if(nums[i] <= nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
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
        int[] result = BubbleSort(nums);
        System.out.println(Arrays.toString(result));
    }
}