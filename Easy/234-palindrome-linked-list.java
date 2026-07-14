// 234. Palindrome Linked List (Easy)
// https://leetcode.com/problems/palindrome-linked-list/
// Runtime: 5 ms  Memory: 94.5 MB
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode midNode=findMid(head);
        ListNode headOfReverseHalf=reverseSecondHalf(midNode);
        if(isPalindrome(head,headOfReverseHalf)){
            return true;
        }else{
            return false;
        }
    }
    public ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseSecondHalf(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode nextNode;

        while(curr!=null){
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head1,ListNode head2 ){
        ListNode left=head1;
        ListNode right=head2;
        while(right!=null){
            if(left.val !=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
}
