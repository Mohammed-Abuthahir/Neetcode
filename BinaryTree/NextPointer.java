// Populating Next Right Pointers in Each Node
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class NextPointer{
    static class Node{
        int val;
        Node left;
        Node right;
        Node next;

        public Node() {};

        public Node(int _val){
            val = _val;
        }

        public Node(int _val,Node _left, Node _right, Node _next){
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size; i++){
                Node node = queue.poll();
                if(i < size - 1){
                    node.next = queue.peek();
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        NextPointer next = new NextPointer();
        next.connect(root);
        System.out.println("Root next: " + (root.next == null ? "null" : root.next.val));
        System.out.println("Left child of root (2) next: " + (root.left.next == null ? "null" : root.left.next.val));
        System.out.println("Node 4 next: " + (root.left.left.next == null ? "null" : root.left.left.next.val));
        System.out.println("Node 5 next: " + (root.left.right.next == null ? "null" : root.left.right.next.val));
    }
}