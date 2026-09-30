// Implement Trie (Prefix Tree)
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class designTrie{
    public static void main(String[] args){
        Trie t1 = new Trie();
        t1.insert("apple");
        System.out.println(t1.search("apple"));
        System.out.println(t1.search("app"));
        System.out.println(t1.startsWith("app"));
        t1.insert("app");
        System.out.println(t1.search("app"));
    }
}

class Trie{

    HashSet<String> nums;
    public Trie(){
        nums = new HashSet<>();
    }

    public void insert(String word){
        nums.add(word);
    }

    public boolean search(String word){
        return nums.contains(word);
    }

    public boolean startsWith(String prefix){
        for(String word : nums){
            if(word.startsWith(prefix)){
                return true;
            }
        }
        return false;
    }
}
