// Ransom Note
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class RansomNote{
    public static boolean ransomnote(String ransomNote, String magazine) {
        ArrayList<Character> list = new ArrayList<>();
        for(char c : magazine.toCharArray()){
            list.add(c);
        }
        for(char c : ransomNote.toCharArray()){
            if(!list.contains(c)) return false;
            list.remove((Character) c);
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the RansomNote :");
        String ransomNote = scan.next();
        System.out.println("Enter the magazine :");
        String magazine = scan.next();
        boolean result = ransomnote(ransomNote, magazine);
        System.out.println(result);
    }
}