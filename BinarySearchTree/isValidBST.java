// Validate Binary Search Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isValidBST{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean validBST(TreeNode root, long min, long max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return validBST(root.left, min, root.val) && validBST(root.right, root.val, max);
    }
    public static boolean validateBST(TreeNode root){
        return validBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        boolean result = validateBST(root);
        System.out.println(result);
    }
}