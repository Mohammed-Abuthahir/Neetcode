// Sort the People
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class sortPeople{
    public static String[] sortpeople(String[] names, int[] height){
        TreeMap<Integer, String> map = new TreeMap<>();
        for(int i = 0;i < names.length; i++) {
            map.put(height[i], names[i]);
        }
        int idx = 0;
        for(int num : map.keySet()){
            names[idx++] = map.get(num);
        }
        int left = 0; int right = names.length - 1;
        while(left < right){
            String temp = names[left];
            names[left] = names[right];
            names[right] = temp;
            left++;
            right--;
        }
        return names;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size :");
        int n2 = scan.nextInt();
        System.out.println("Enter the names :");
        String[] names = new String[n1];
        for(int i = 0;i < names.length; i++){
            names[i] = scan.next();
        }
        System.out.println("Enter the height :");
        int[] height = new int[n2];
        for(int i = 0;i < height.length; i++){
            height[i] = scan.nextInt();
        }
        String[] result = sortpeople(names, height);
        System.out.println(Arrays.toString(result));
    }
}