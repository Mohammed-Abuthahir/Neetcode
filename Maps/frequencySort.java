// Sort Array by Increasing Frequency
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class frequencySort{
    public static int[] frequencySortingArray(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr, (a, b) -> {
            if(map.get(a) != map.get(b)) return map.get(a) - map.get(b);
            else  return b - a;
        });
        int idx = 0;
        for(int key : arr){
            for(int i = 0;i < map.get(key); i++){
                nums[idx++] = key;
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
        int[] result = frequencySortingArray(nums);
        System.out.println(Arrays.toString(result));
    }
}