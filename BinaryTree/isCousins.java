// isCousins in a binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isCousins{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean iscousins(TreeNode root, int x, int y){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean A = false;
            boolean B = false;
            for(int i = 0;i < size; i++){
                TreeNode current = queue.poll();
                if(current.val == x) A = true;
                if(current.val == y) B = true;
                if(current.left != null && current.right != null){
                    if(current.left.val == x && current.right.val == y) return false;
                    if(current.left.val == y && current.right.val == x) return false;
                }
                if(current.left != null){
                    queue.offer(current.left);
                }
                if(current.right != null){
                    queue.offer(current.right);
                }
                if(A && B) return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        int x = 5;
        int y = 4;
        boolean result = iscousins(root, x, y);
        System.out.println(result);
    }
}