// Relative Sort Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class relativeSortArray{
    public static int[] relativesort(int[] arr1, int[] arr2){
       TreeMap<Integer, Integer> map = new TreeMap<>();
       for(int num : arr1) map.put(num, map.getOrDefault(num, 0) + 1);
       List<Integer> nums = new ArrayList<>();
       for(int num : arr2) nums.addAll(Collections.nCopies(map.get(num), num));
       for(int key : map.keySet()){
            if(!nums.contains(key) && map.get(key) == 1) nums.add(key);
            else if(!nums.contains(key)) nums.addAll(Collections.nCopies(map.get(key), key));
       }
       return nums.stream().mapToInt(Integer :: intValue).toArray();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1:");
        int[] arr1 = new int[n1];
        for(int i = 0;i < arr1.length; i++){
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2:");
        int[] arr2 = new int[n2];
        for(int i = 0;i < arr2.length; i++){
            arr2[i] = scan.nextInt();
        }
        int[] result = relativesort(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}