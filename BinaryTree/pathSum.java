// pathsum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class pathSum{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean findPathSum(TreeNode root, int targetSum, int currSum){
        if(root == null) return false;
        currSum = currSum + root.val;
        if(root.left == null && root.right == null){
            if(currSum == targetSum) return true;
            currSum = 0;
        }
        return findPathSum(root.left, targetSum, currSum) || findPathSum(root.right, targetSum, currSum);
    }
    public static boolean pathsum(TreeNode root, int targetSum){
        int currSum = 0;
        return findPathSum(root, targetSum, currSum);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int targetSum = 3;
        boolean result = pathsum(root, targetSum);
        System.out.println(result);
    }
}