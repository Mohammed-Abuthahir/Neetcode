// Binary Tree Preorder Traversal
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class preorderTraversal{
    public static class TreeNode{
        int val;
        TreeNode left; 
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void getpreordersequence(TreeNode root, List<Integer> nums){
        if(root == null) return;
        nums.add(root.val);
        getpreordersequence(root.left, nums);
        getpreordersequence(root.right, nums);
    }
    public static List<Integer> preordertraversal(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        getpreordersequence(root, nums);
        return nums;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> result = preordertraversal(root);
        System.out.println(result);
    }
}