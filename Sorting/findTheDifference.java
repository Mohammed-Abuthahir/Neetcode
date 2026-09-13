// Find the Difference
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class findTheDifference{
    public static char findTheDifference(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        for(int i = 0;i < schar.length; i++){
            if(schar[i] != tchar[i]){
                return tchar[i];
            }
        }
        return tchar[tchar.length - 1];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1 : ");
        String s = scan.next();
        System.out.println("Enter the String 2 :");
        String t = scan.next();
        char result = findTheDifference(s, t);
        System.out.println(result);
    }
}