// 118. Pascal's Triangle
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class pascaltraingle{
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < numRows; i++){
            List<Integer> ans = new ArrayList<>();
            for(int j = 0;j <= i; j++){
                if(j == 0 || j == i) ans.add(1);
                else ans.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(ans);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the NumRows : ");
        int numRows = scan.nextInt();
        List<List<Integer>> result = generate(numRows);
        System.out.println(result);
    }
}