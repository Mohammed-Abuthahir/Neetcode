// postorderTraversal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class postorderTraversal{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void postorders(TreeNode root, List<Integer> nums){
        if(root == null) return;
        postorders(root.left, nums);
        postorders(root.right, nums);
        nums.add(root.val);
    }
    public static List<Integer> postordertraversal(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        postorders(root, nums);
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
        List<Integer> result = postordertraversal(root);
        System.out.println(result);
    }
}