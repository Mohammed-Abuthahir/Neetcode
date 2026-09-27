// Bottomview of the Binary tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class BottomView{
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
    public static List<Integer> Bottomview(TreeNode root){
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()){
            Pair curr = queue.poll();
            map.put(curr.col, curr.node.val);
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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);
        root.right = new TreeNode(9);
        List<Integer> result = Bottomview(root);
        System.out.println(result);
    }
}