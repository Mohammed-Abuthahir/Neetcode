// prefixCount
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class prefixCount{
    public static int prefixcount(String s,String[] nums){
        int count = 0;
        for(String word : nums){
            if(word.startsWith(s)) count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String  :");
        String s = scan.next();
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.next();
        }
        int result = prefixcount(s, nums);
        System.out.println(result);
    }
}