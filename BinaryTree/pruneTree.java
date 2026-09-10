// pruneTree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class pruneTree{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode prunetree(TreeNode root){
        if(root == null) return null;
        root.left = prunetree(root.left);
        root.right = prunetree(root.right);
        if(root.left == null && root.right == null && root.val == 0){
            return null;
        }
        return root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode result = prunetree(root);
        display(root);
    }
    public static void display(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }
}