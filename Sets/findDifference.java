// Find the Difference of Two Arrays
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findDifference{
    public static List<List<Integer>> finddifference(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);
        List<Integer> arr1 = new ArrayList<>();
        for(int num : set1){
            if(!set2.contains(num)){
                arr1.add(num);
            }
        }
        List<Integer> arr2 = new ArrayList<>();
        for(int num : set2){
            if(!set1.contains(num)){
                arr2.add(num);
            }
        }
        return Arrays.asList(arr1, arr2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size 1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1 :");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length; i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2 :");
        int[] nums2 = new int[n2];
        for(int i = 0; i < nums2.length; i++){
            nums2[i] = scan.nextInt();
        }
        List<List<Integer>> result = finddifference(nums1, nums2);
        System.out.println(result);
    }
}