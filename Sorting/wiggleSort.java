// Wiggle Sort
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class wiggleSort{
    public static void wigglesort(int[] nums){
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int n = nums.length;
        int left = (n - 1) / 2;
        int right = (n - 1);
        for(int i = 0;i < nums.length; i++){
            if(i % 2 == 0) nums[i] = temp[left--];
            else nums[i] = temp[right--];
        }
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
        wigglesort(nums);
        System.out.println(Arrays.toString(nums));
    }
}