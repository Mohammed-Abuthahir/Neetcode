// N-ary Tree Postorder Traversal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class postorder{
    static class Node {
        int val;
        List<Node> children;
        Node(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }
    }
    public static void fillthelist(Node root, List<Integer> nums) {
        // If there is no node
        if (root == null) {
            return;
        }
        // First visit all children
        for (Node child : root.children) {
            fillthelist(child, nums);
        }
        // Then visit the current node
        nums.add(root.val);
    }
    public static List<Integer> postorder(Node root) {
        List<Integer> nums = new ArrayList<>();
        fillthelist(root, nums);
        return nums;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);
        node3.children.add(node5);
        node3.children.add(node6);
        List<Integer> result = postorder(root);
        System.out.println(result);
    }
}