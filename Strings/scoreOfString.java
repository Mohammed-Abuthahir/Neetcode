// scoreOfString
import java.util.Scanner;
import java.util.Arrays;
class scoreOfString{
    public static int score(String s){
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            sum = sum + Math.abs((int) s.charAt(i - 1) - (int) s.charAt(i));
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = score(s);
        System.out.println(result);
    }
}