// Top K Frequent Elements
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class topKFrequent{
    public static int[] topkfrequent(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Integer> queue = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        Collections.addAll(map.keySet());
        int idx = 0;
        while(!queue.isEmpty()){
            nums[idx++] = queue.poll();
        }
        return Arrays.copyOf(nums, k);
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
        int[] result = topkfrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }
}