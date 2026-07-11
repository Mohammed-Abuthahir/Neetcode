// Valid Anagram
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ValidAnagrams{
    public static boolean isAnagram(String s1, String s2){
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        s1 = new String(a1);
        s2 = new String(a2);
        return s1.equals(s2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Strings 1 :");
        String s1 = scan.next();
        System.out.println("Enter the String 2 :");
        String s2 = scan.next();
        boolean result = isAnagram(s1, s2);
        System.out.println(result);
    }
}