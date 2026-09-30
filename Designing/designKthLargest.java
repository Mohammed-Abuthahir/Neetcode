// Kth Largest Element in a Stream
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class designKthLargest{
    public static void main(String[] args){
        int[] nums = {4, 5, 8, 2};
        KthLargest k1 = new KthLargest(3,nums);
        k1.add(3);
        k1.add(5);
        k1.add(10);
        k1.add(9);
        k1.add(4);
    }
}

class KthLargest{

    int k = 0;
    List<Integer> arr;
    
    public KthLargest(int k, int[] nums){
        this.k = k;
        arr = new ArrayList<>();
        for(int num : nums){
            arr.add(num);
        }
    }

    public int add(int val){
        Collections.sort(arr);
        return arr.get(arr.size() - k);
    }
}