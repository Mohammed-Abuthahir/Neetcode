// Height Checker
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class heightChecker{
    public static int heightchecker(int[] heights){
        int[] arr = new int[heights.length];
        for(int i = 0;i < heights.length; i++){
            arr[i] = heights[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i < heights.length; i++){
            if(arr[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] heights = new int[n];
        for(int i = 0;i < heights.length; i++){
            heights[i] = scan.nextInt();
        }
        int result = heightchecker(heights);
        System.out.println("student doesn't matching is height with respective order"+result);
    }
}