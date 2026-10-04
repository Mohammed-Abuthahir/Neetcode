// Lowest Common Ancestor of a Binary Search Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
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
        TreeNode curr = root;
        while(curr != null){
            if(p.val < curr.val && q.val < curr.val){
                curr = curr.left;
            }
            else if(p.val > curr.val && q.val > curr.val){
                curr = curr.right;
            }
            else {
                return curr;
            }
        }
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
        TreeNode q = root.right;
        TreeNode result = LCA(root, p, q);
        System.out.println(result.val);
    }
}