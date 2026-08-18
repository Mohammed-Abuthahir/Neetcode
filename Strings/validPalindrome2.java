// validPalindrome2
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class validPalindrome{
    public static boolean palindrome(String s){
        if (s.contentEquals(new StringBuilder(s).reverse())) return true;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder temp = new StringBuilder(s);
            temp.deleteCharAt(i); 
            if (temp.toString().contentEquals(temp.reverse())) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = palindrome(s);
        System.out.println(result);
    }
}