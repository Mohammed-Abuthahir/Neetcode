// Sort an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class SortArray{
    public static int[] sorttheArray(int[] nums){

        // Min Heap
        // PriorityQueue <Integer> queue = new PriorityQueue<>();
        // for(int num : nums){
        //     queue.add(num);
        // }
        // int index = 0;
        // while(!queue.isEmpty()){
        //     nums[index++] = queue.poll();
        // }

        // max Heap
        PriorityQueue <Integer> queue =  new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            queue.add(num);
        }
        int idx = nums.length - 1;
        while(!queue.isEmpty()){
            nums[idx--] = queue.poll();
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
        int[] result = sorttheArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}