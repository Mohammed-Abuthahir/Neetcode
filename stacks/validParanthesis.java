// Valid Parentheses
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class validParanthesis{
    public static boolean validparanthisis(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                if((c == ')' && stack.pop() != '(') ||
                (c == '}' && stack.pop() != '{') || (c == ']' &&
                stack.pop() != '[')) return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Paranthissis String :");
        String s = scan.next();
        boolean result = validparanthisis(s);
        System.out.println(result);
    }
}