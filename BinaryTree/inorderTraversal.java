// inorderTraversal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class inorderTraversal{
    public static class TreeNode{
        int val;
        TreeNode left; 
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void inorderTraversal(TreeNode root, List<Integer> nums){
        if(root == null) return;
        inorderTraversal(root.left, nums);
        nums.add(root.val);
        inorderTraversal(root.right, nums);
    }
    public static List<Integer> inordertraversal(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        inorderTraversal(root, nums);
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
        List<Integer> result = inordertraversal(root);
        System.out.println(result);
    }
}