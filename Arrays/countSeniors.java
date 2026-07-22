// Number of Senior Citizens
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countSeniors{
    public static int countSeniors(String[] nums){
        int count = 0;
        for(String word : nums){
            if(Integer.parseInt(word.charAt(11) + "" + word.charAt(12)) > 60){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.next();
        }
        int result = countSeniors(nums);
        System.out.println(result);
    }
}