// Odd Even Linked List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class oddevenlinkedlist{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode oddeven(ListNode head){
          if(head == null || head.next == null) return head;
       ListNode odd = head;
       ListNode even = head.next;
       ListNode evenhead = even;
       while (even != null && even.next != null){
           odd.next = even.next;
           odd = odd.next;
           even.next = odd.next;
           even = even.next;
       }
       odd.next = evenhead;
       return head;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = oddeven(head);
        System.out.println(result.val);
    }
}