// deleteNode
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class deleteNode{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode deletenode(TreeNode root, int target){
        if(root == null) return null;
        if(root.val < target){
            root.left = deletenode(root.left, target);
        }
        else if(root.val > target){
            root.right = deletenode(root.right, target);
        }
        else{
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            TreeNode successor = root.right;
            if(successor.left != null){
                successor = successor.left;
            }
            root.val = successor.val;
            root.right = deletenode(root.right, successor.val);
        }
        return root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        int target = 3;
        TreeNode result = deletenode(root, target);
        display(result);
    }
    public static void display(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }
}