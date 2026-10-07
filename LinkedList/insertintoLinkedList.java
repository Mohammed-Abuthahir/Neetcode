// insertintoLinkedList
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class insertintoLinkedList{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode insertintohead(ListNode head, int key){
        ListNode curr = new ListNode(key);
        curr.next = head;
        head = curr;
        return head;
    }
    public static ListNode insertintoend(ListNode head, int key){
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new ListNode(key);
        return head;
    }
    public static ListNode insertintoNth(ListNode head, int key, int n){
        if(head == null) return new ListNode(key);
        ListNode curr = head;
        while(n != 0){
            curr = curr.next;
            n--;
        }
        ListNode newnode = new ListNode(key);
        ListNode temp = curr.next;
        curr.next = newnode;
        newnode.next = temp;
        return head;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int key = 4;
        // ListNode result = insertintohead(head, key);
        // ListNode result1 = insertintoend(head, key);
        ListNode result2 = insertintoNth(head, key, 3);
        display(result2);
    }
    public static void display(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}