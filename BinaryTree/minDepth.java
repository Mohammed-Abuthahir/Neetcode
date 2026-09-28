// Minimum Depth Of Binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minDepth{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    // public static int minDepthofBT(TreeNode root){
    //     if(root == null) return 0;
    //     int left = minDepthofBT(root.left);
    //     int right = minDepthofBT(root.right);
    //     return (left == 0 || right == 0) ? left + right + 1 : Math.min(left , right) + 1;
    // }
    public static int minDepthofBT(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size; i++){
                TreeNode current = queue.poll();
                if(current.left == null && current.right == null){
                    return level;
                }
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            level++;
        }
        return 0;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int result = minDepthofBT(root);
        System.out.println(result);
    }
}