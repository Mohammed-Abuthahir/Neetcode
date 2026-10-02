//  Same Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Sametree{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean isSubtree(TreeNode root, TreeNode subroot){
        if(root == null) return false;

        if(isSametree(root, subroot)){
            return true;
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }
    public static boolean isSametree(TreeNode root, TreeNode subroot){
        if(root == null && subroot == null) return true;
        if(root == null || subroot == null) return false;
        if(root.val != subroot.val) return false;
        return isSametree(root.left, subroot.left) && isSametree(root.right, subroot.right);
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode subroot = new TreeNode(1);
        subroot.left = new TreeNode(2);
        subroot.right = new TreeNode(3);

        boolean result = isSametree(root, subroot);
        System.out.println(result);
    }
}