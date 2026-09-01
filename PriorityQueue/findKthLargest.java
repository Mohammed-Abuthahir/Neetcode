// Kth Largest Element in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findKthLargest{
    public static int findklargest(int[] nums, int k){
        int n = (nums.length - k) + 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) pq.add(num);
        int count = 0;
        while(!pq.isEmpty()){
            int num = pq.poll();
            count++;
            if(count == n) return num;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = findklargest(nums, k);
        System.out.println(result);
    }
}