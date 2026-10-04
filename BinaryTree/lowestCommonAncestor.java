// Lowest Common Ancestor of a Binary  Tree
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class lowestCommonAncestor{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);
        if(left != null && right != null) return root;
        if(left == null && right == null) return null;
        if(left != null) return left;
        if(right != null) return right;
        return root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode p = root.left;
        TreeNode q = root.left.left;
        TreeNode result = LCA(root, p , q);
        System.out.println(result.val);
    }
}