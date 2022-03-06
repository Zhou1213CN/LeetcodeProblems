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
    public ListNode reverse(ListNode head){
        ListNode cur = head, next = null, prev = null;
        
        while (cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        int i = 0;
        ListNode cur = head;
        while (cur != null){
            cur = cur.next;
            i++;
        }
        
        //System.out.println(i);
        int j = 0;
        //i-n-1
        ListNode cur1 = head;
        ListNode res = cur1;
        while (cur1 != null){
            if (j == i-n-1) {
                
                cur1.next = cur1.next.next;
                //System.out.println(cur1.val);
            }
            cur1 = cur1.next;
            j++;
        }
        if (n == i) return head.next;
        return res;
        
    }
}