// 987. Vertical Order Traversal of a Binary Tree
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class verticalTraversal{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    static class Pair{
        TreeNode node;
        int row;
        int col;
        Pair(TreeNode node, int row, int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public static List<List<Integer>> verticalOrder(TreeNode root){
        List<int[]> list = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0, 0));
        while(!queue.isEmpty()){
            Pair curr = queue.poll();
            list.add(new int[]{curr.col, curr.row, curr.node.val});
            if(curr.node.left != null){
                queue.offer(new Pair(curr.node.left, curr.row + 1, curr.col - 1));
            }
            if(curr.node.right != null){
                queue.offer(new Pair(curr.node.right, curr.row + 1, curr.col + 1));
            }
        }
        Collections.sort(list, (a, b) -> {
            if(a[0] != b[0]){
                return a[0] - b[0];
            }
            if(a[1] != b[1]){
                return a[1] - b[1];
            }
            return a[2] - b[2];
        });
        List<List<Integer>> ans = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;
        for(int[] node : list){
            if(node[0] != prevCol){
                ans.add(new ArrayList<>());
                node[0] = prevCol;
            }
            ans.get(ans.size() - 1).add(node[2]);
        }
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = verticalOrder(root);
        System.out.println(result);
    }
}