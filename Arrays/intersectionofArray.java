// Intersection of Two Arrays
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class intersectionofArray{
    public static int[] intersections(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left = 0;
        int right = 0;
        HashSet<Integer> set = new HashSet<>();
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] == nums2[right]){
                set.add(nums1[left]);
                left++;
                right++;
            }
            else if(nums1[left] < nums2[right]){
                left++;
            }
            else {
                right++;
            }
        }
        int idx = 0;
        int[] arr = new int[set.size()];
        for(int num : set){
            arr[idx++] = num;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length; i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays :");
        int[] nums2 = new int[n2];
        for(int i = 0;i < nums2.length; i++){
            nums2[i] = scan.nextInt();
        }
        int[] result = intersections(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}