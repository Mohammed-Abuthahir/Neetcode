// Length Of Last Word
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class LengthofLastWord{
    public static int lengthoflastword(String str) {
    String s = str.trim();
    int length = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) != ' ') {
            length++;
        } else {
        
            return length;
        }
    }

        return length;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = lengthoflastword(s);
        System.out.println(result);
    }
}