// Remove Linked List Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removeElements{
    static class ListNode{
        int val; 
        ListNode next; 
        ListNode(int val) { 
            this.val = val; 
            this.next = null; 
        } 
    }
    public static ListNode removeElements(ListNode head, int val){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            else curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        int val = 6;
        ListNode result = removeElements(head, val);
        display(result);
    }
    public static void display(ListNode head){
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
    }
}