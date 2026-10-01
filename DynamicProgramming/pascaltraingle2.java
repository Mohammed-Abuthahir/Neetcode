// Pascal's Triangle II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class pascaltraingle2{
    public static List<Integer> getRow(int rowIndex){
        int num = 0;
        if(rowIndex != 0) num = rowIndex; 
        else num = 1;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < num * 2; i++){
            List<Integer> ans = new ArrayList<>();
            for(int j = 0;j <= i; j++){
                if(j == 0 || j == i) ans.add(1);
                else ans.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(ans);
        }
        return res.get(rowIndex);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numRows : ");
        int numRows = scan.nextInt();
        List<Integer> result = getRow(numRows);
        System.out.println(result);
    }
}