// Counting Bits
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countBits{
    public static int[] countingbits(int n){
        int[] nums = new int[n + 1];
        for(int i = 0;i <= n; i++) nums[i] = Integer.bitCount(i);
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        int[] result = countingbits(n);
        System.out.println(Arrays.toString(result));
    }
}