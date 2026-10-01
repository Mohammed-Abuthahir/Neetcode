// Last Stone Weight
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class lastStoneWeight{
    public static int lastStone(int[] nums){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for(int num : nums){
            pq.add(num);
        }

        while(pq.size() > 1){
            int stone1 = pq.poll();
            int stone2 = pq.poll();

            pq.add(stone1 - stone2);
        }
        return !pq.isEmpty() ? pq.peek() : 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = lastStone(nums);
        System.out.println(result);
    }
}