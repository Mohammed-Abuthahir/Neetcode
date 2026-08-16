// Sum Root to Leaf Numbers
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class sumNumber{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static int sumOfRoottoLeaf(TreeNode root, int num){
        if(root == null) return 0;
        num = num * 10 + root.val;
        if(root.left == null && root.right == null) return num;
        return sumOfRoottoLeaf(root.left, num) + sumOfRoottoLeaf(root.right, num);
    }
    public static int sumNumbers(TreeNode root){
        return sumOfRoottoLeaf(root, 0);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        int result = sumNumbers(root);
        System.out.println(result);
    }  
}