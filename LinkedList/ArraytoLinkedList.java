// Convert the Arrays into LinkedList
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ArraytoLinkedList{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void display(ListNode head){
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
    }
    public static ListNode BuildLinkedList(int[] nums, int idx){
        if(idx == nums.length) return null;
        ListNode head = new ListNode(nums[idx]);
        head.next = BuildLinkedList(nums, idx + 1);
        return head;
    }
    public static ListNode arraytoLinkedList(int[] nums){
        return BuildLinkedList(nums, 0);
    }
    // public static ListNode arraytoLinkedList(int[] nums){
    //     if(nums.length == 0) return null;
    //     ListNode head = new ListNode(nums[0]);
    //     ListNode curr = head;
    //     for(int i = 1;i < nums.length; i++){
    //         curr.next = new ListNode(nums[i]);
    //         curr = curr.next;
    //     }
    //     return head;
    // }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        ListNode result = arraytoLinkedList(nums);
        display(result);
    }
}