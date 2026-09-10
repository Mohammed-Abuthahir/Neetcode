// Next Greater Element I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class nextGreaterElement{
    public static int[] nextgreaterelement(int[] nums1, int[] nums2){
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums2.length; i++){
            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }
        for(int i = 0;i < nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int size1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int size2 = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums1 = new int[size1];
        for(int i = 0;i < nums1.length; i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays :");
        int[] nums2 = new int[size2];
        for(int i = 0;i < nums2.length; i++){
            nums2[i] = scan.nextInt();
        }
        int[] result = nextgreaterelement(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}