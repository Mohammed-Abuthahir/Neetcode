// Maximum Difference Between Even and Odd Frequency 
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxDifference{
    public static int maximumDiff(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int val : map.values()){
            if(val % 2 == 0) minEven = Math.min(minEven, val);
            else maxOdd = Math.max(maxOdd, val);
        }
        return maxOdd - minEven;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = maximumDiff(s);
        System.out.println(result);
        
    }
}