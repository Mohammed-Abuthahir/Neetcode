// Reverse String
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class ReverseString{
    public static void reverseString(char[] arr){
        int left = 0;  int right = arr.length - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        char[] arr = new char[n];
        for(int i = 0;i < arr.length; i++){
            arr[i] = scan.next().charAt(0); 
        }
        reverseString(arr);
        System.out.println("After Reversing :" + Arrays.toString(arr));
    }
}