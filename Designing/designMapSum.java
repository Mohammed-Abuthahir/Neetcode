// Map Sum Pairs
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class designMapSum{
    public static void main(String[] args){
        MapSum m1 = new MapSum();
        m1.insert("apple", 3);
        System.out.println(m1.sum("ap"));
        m1.insert("app", 2);
        System.out.println(m1.sum("ap"));
    }
}
class MapSum{
    HashMap<String,Integer> map;
    public MapSum(){
        map = new HashMap<>();
    }

    public void insert(String key, int val){
        map.put(key, val);
    }

    public int sum(String prefix){
        int sum = 0;
        for(String word : map.keySet()){
            if(word.startsWith(prefix)) sum = sum + map.get(word);
        }
        return sum;
    }
}