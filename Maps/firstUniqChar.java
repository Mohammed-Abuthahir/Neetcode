// firstUniqChar
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class firstUniqChar{
    public static int firstuniquecharacter(String s){
        HashMap<Character, Integer> map = new HashMap<>();
       for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
       }
       char ch = ' ';
       for(char c : s.toCharArray()){
            if(map.get(c) == 1) {
                ch = c;
                break;
            }
       }
       for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == ch) return i;
       }
       return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = firstuniquecharacter(s);
        System.out.println(result);
    }
}