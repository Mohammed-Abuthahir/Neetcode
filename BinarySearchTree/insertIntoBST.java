// Insert into a Binary Search Tree
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class insertintoBST{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode insertIntoBST(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(val < root.val){
            root.left = insertIntoBST(root.left, val);
        }
        else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        int target = 6;
        TreeNode result = insertIntoBST(root, target);
        display(result);
    }
    public static void display(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }
}