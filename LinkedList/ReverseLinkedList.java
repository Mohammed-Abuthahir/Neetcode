// ReverseLinkedList
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ReverseLinkedList{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode result = reverseLinkedList(node);
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