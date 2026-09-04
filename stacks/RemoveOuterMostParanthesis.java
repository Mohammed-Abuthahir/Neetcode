// Remove Outermost Parentheses
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class RemoveOuterMostParanthesis{
    public static String removeOuter(String s){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            sb.append(c);
            if(c == '(') stack.push(c);
            else if (c == ')') stack.pop();
            if(stack.isEmpty()){
                sb1.append(sb.substring(1, sb.length() - 1).toString());
                sb.setLength(0);
            }
        }
        return sb1.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        String result = removeOuter(s);
        System.out.println(result);
    }
}