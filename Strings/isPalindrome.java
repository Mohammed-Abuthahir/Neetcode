// Valid Palindrome
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class isPalindrome{
    public static boolean palindromeornot(String s){
       String original = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String revword = new StringBuilder(original).reverse().toString();
        return original.equals(revword);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = palindromeornot(s);
        System.out.println(result);
    }
}