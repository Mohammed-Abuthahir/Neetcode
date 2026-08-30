// Maximum Depth of Binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxDepth{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static int recursive(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(recursive(root.left), recursive(root.right));
    }
    public static int dfs(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size; i++){
                TreeNode current = queue.poll();
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            level++;
        }
        return level;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        int result = dfs(root);
        int result1 = recursive(root);
        System.out.println("Recursion Result :"+result1);
        System.out.println("Depth first Search Result :"+result);
    }
}