// Kth Distinct String in an Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class kthDistinct{
    public static String kthdistinct(String[] arr, int k){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                list.add(key);
            }
        }
        return list.size() >= 1 ? list.get(k - 1) : "";
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] arr = new String[n];
        for(int i = 0;i < arr.length; i++){
            arr[i] = scan.next();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        String result = kthdistinct(arr, k);
        System.out.println(result);
    }
}