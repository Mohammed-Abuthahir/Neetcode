// countConsistentStrings
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class countConsistentStrings{
    public static int consistentString(String[] words, String allowed){
        StringBuilder word = new StringBuilder();
        for(String w : words) word.append(w + w.length());
        HashSet<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()) set.add(c);
        int realcount = 0; int count = 0;
        for(int i = 0;i < word.length(); i++){
            char c = word.charAt(i);
            if(set.contains(c)) count++;
            if(Character.isDigit(c)){
                if(count == (c - '0')) realcount++;
                count = 0;
            }
        }
        return realcount;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String allowed = scan.next();
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        String[] words = new String[n];
        for(int i = 0;i < words.length; i++){
            words[i] = scan.next();
        }
        int result = consistentString(words, allowed);
        System.out.println(result);
    }
}