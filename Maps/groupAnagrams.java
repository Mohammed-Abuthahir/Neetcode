// Group Anagrams
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class groupAnagrams{
    public static List<List<String>> groupAnagrams(String[] nums){
        Map<String, List<String>> map = new HashMap<>();
        for(String word : nums){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String s1 = String.valueOf(c);
            if(!map.containsKey(s1)){
                map.put(s1, new ArrayList<>());
            }
            map.get(s1).add(word);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.next();
        }
        List<List<String>> result = groupAnagrams(nums);
        System.out.println(result);
    }
}