// Power of Two
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class powerofTwo{
    public static boolean checkpowerTwo(int n){
        if(n == 1) return true;
        if(n == 0 || n % 2 != 0) return false;
        return checkpowerTwo(n / 2);
    }
    public static boolean isPowerTwo(int n){
        return checkpowerTwo(n);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        boolean result = isPowerTwo(n);
        System.out.println(result);
    }
}