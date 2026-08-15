// kthSmallest Element in a Tree
// Inorder traversal in BST always gives you the sorted order
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class kthSmallest{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void KthsmallestElement(TreeNode root, List<Integer> nums, int k){
        if(root == null) return;
        KthsmallestElement(root.left, nums, k);
        nums.add(root.val);
        KthsmallestElement(root.right, nums, k);
    }
    public static int kthsmallest(TreeNode root, int k){
        List<Integer> nums = new ArrayList<>();
        KthsmallestElement(root, nums, k);
        return nums.get(k - 1);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 2;
        int result = kthsmallest(root, k);
        System.out.println(result);
    }
}