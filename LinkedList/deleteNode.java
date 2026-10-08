// Delete Node in LinkedList
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class deleteNode{
    static class ListNode{
        int val;
        ListNode head;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode deleteFirstNode(ListNode head){
        return head.next;
    }
    public static ListNode deleteLastNode(ListNode head){
        if(head == null) return head;
        ListNode curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        if(curr != null && curr.next != null){
            curr.next = curr.next.next;
        }
        return head;
    }
    public static ListNode deleteNthNode(ListNode head, int n){
        if(head == null) return head;
        ListNode curr = head;
        for(int i = 1;i < n - 1;i++){
            curr = curr.next;
        }
        if(curr != null && curr.next != null){
            curr.next = curr.next.next;
        }
        return head;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // ListNode result1 = deleteFirstNode(head);
        // ListNode result2 = deleteLastNode(head);
        ListNode result3 = deleteNthNode(head, 5);
        // display(result1);
        // System.out.println();
        // display(result2);
        // System.out.println();
        display(result3);
    }
    public static void display(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        
    }
}