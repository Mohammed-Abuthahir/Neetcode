// middleNode -- Fast and Slow pointer Technique
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class middleNode{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode middleNodes(ListNode head){
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        length = length / 2;
        while(length != 0){
            length--;
            head = head.next;
        }
        return head;
    }
    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ListNode result = middleNodes(node);
        DisplayLinkedList(result);
    }
    public static void DisplayLinkedList(ListNode node){
        ListNode current = node;
        while(current != null){
            System.out.print(current.val + " --> ");
            current = current.next;
        }
    }
}