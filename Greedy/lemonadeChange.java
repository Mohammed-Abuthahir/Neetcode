// 860. Lemonade Change
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class lemonadeChange{
    public static boolean lemonade(int[] nums){
        int five = 0; int ten = 0;
        for(int num : nums){
            if(num == 5){
                five++;
            }
            else if(num == 10){
                if(five > 0){
                    five--;
                    ten++;
                }
                else return false;
            }
            else {
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }
                else if(five >= 3){
                    five = five - 3;
                }
                else return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        boolean result = lemonade(nums);
        System.out.println(result);
    }
}