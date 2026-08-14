// Merge Strings Alternately
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mergeAlternately{
    public static String mergeStringalternatively(String word1, String word2){
        int idx1 = 0; int idx2 = 0;
        StringBuilder sb = new StringBuilder();
        while(idx1 < word1.length() || idx2 < word2.length()){
            if(idx1 < word1.length()){
                sb.append(word1.charAt(idx1));
            }
            if(idx2 < word2.length()){
                sb.append(word2.charAt(idx2));
            }
            idx1++;
            idx2++;
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Word 1 :");
        String word1 = scan.next();
        System.out.println("Enter the Word 2 :");
        String word2 = scan.next();
        String result = mergeStringalternatively(word1, word2);
        System.out.println(result);
    }
}