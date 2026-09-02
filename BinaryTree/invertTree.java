// invert BT;/
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class invertTree{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode invertBT(TreeNode root){
        if(root == null) return root;
        TreeNode temp = root.left;
        root.left = invertBT(root.right);
        root.right = invertBT(temp);
        return root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeNode result = invertBT(root);
    }
}