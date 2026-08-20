// largestGoodInteger
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class largestGoodInteger{
    public static String largestInteger(String num){
        int max = -1; int k = 3;
        for(int i = 0;i <= num.length() - k; i++){
            String number = num.substring(i, i + k);
            if(number.charAt(0) == number.charAt(1) && number.charAt(1) == number.charAt(2) && number.charAt(0) == number.charAt(2)){
                max = Math.max(max, Integer.parseInt(number));
            }
            if(max == -1) return ""; if(max == 0) return "000";
        }
        return String.valueOf(max);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String num = scan.next();
        String result = largestInteger(num);
        System.out.println(result);
    }
}