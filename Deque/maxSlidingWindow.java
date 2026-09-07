// 239. Sliding Window Maximum
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class maxSlidingWindow{
    public static int[] maxSlidingwindow(int[] nums, int k){
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int idx = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0;i < nums.length; i++){
            if(!deque.isEmpty() && deque.peekFirst() < i - k + 1){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i >= k - 1){
                result[idx++] = nums[deque.peekFirst()];
            }
        }
        return result;
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int[] result = maxSlidingwindow(nums, k);
        System.out.println(Arrays.toString(result));
    }
}