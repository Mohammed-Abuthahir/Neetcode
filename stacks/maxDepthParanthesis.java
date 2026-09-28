    // 1614. Maximum Nesting Depth of the Parentheses
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxDepthParanthesis{
    public static int maxDepth(String s){
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
                res = Math.max(res, stack.size());
            }
            else if(c == ')'){
                stack.pop();
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        int result = maxDepth(s);
        System.out.println(result);
    }
}