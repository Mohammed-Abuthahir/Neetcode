// levelOrder
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class levelOrder{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> nums = new ArrayList<>();
            for(int i = 0;i < size; i++){
                TreeNode current = queue.poll();
                if(current != null){
                    nums.add(current.val);
                    queue.add(current.left);
                    queue.add(current.right);
                }
            }
            if(nums.size() > 0) result.add(nums);
        }
        return result;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);
    }
}