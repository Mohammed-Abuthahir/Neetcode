// 1382. Balance a Binary Search Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class balanceBST{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void fillthelist(TreeNode root, List<Integer> nums){
        if(root == null) return;
        fillthelist(root.left, nums);
        nums.add(root.val);
        fillthelist(root.right, nums);
    }
    public static TreeNode constractBT(List<Integer> nums,int left, int right){
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = constractBT(nums, left, mid - 1);
        root.right = constractBT(nums, mid + 1, right);
        return root;
    }
    public static TreeNode balanceBST(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        fillthelist(root,nums);
        return constractBT(nums, 0, nums.size() - 1);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        TreeNode result = balanceBST(root);
        display(result);
    }
    public static void display(TreeNode root){
        if(root == null) return;
        display(root.left);
        System.out.println(root.val);
        display(root.right);
    }
}