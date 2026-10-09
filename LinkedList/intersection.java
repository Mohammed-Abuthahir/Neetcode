// intersection of two linkedList
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class intersection{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode getInterSection(ListNode headA, ListNode headB){
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
    public static void main(String[] args){
        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersect; 

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect;
        ListNode result = getInterSection(headA, headB);
        System.out.println(result.val);
    }
}