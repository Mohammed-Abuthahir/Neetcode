// Search In Linked List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class SearchLinkedList{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    // Recursive Approach
    public static boolean searchKey(ListNode head, int key){
        if(head == null) return false;
        if(head.val == key) return true;
        return searchKey(head.next, key);
    }
    // Iterative Approach
    public static boolean searchKey1(ListNode head, int key){
        ListNode curr = head;
        while(curr != null){
            if(curr.val == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int key = 4;
        boolean result = searchKey1(head, key);
        System.out.println(result);
    }
}