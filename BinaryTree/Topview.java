// TopView of the Binary Tree
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Topview{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    static class Pair{
        TreeNode node;
        int col;
        Pair(TreeNode node, int col){
            this.node = node;
            this.col = col;
        }
    }
    public static List<Integer> TopView(TreeNode root){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()){
            Pair curr = queue.poll();
            if(!map.containsKey(curr.col)){
                map.put(curr.col, curr.node.val);
            }
            if(curr.node.left != null){
                queue.add(new Pair(curr.node.left, curr.col - 1));
            }
            if(curr.node.right != null){
                queue.add(new Pair(curr.node.right, curr.col + 1));
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(15);
        root.right.left = new TreeNode(7);
        List<Integer> result = TopView(root);
        System.out.println(result);
    }
}