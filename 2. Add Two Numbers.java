class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p = dummy;
        int sum = 0, carry = 0;
        while (p1 != null || p2 != null){
            if (p1 != null && p2 != null){
                sum = p1.val + p2.val+carry;
                carry = sum/10;
                p.next = new ListNode(sum%10);
                p1 = p1.next;
                p2 = p2.next;
            } else if (p2 != null && p1 == null){
                sum = p2.val+carry;
                carry = sum/10;
                p2 = p2.next;
                p.next = new ListNode(sum%10);
            } else if (p2 == null && p1 != null){
                sum = p1.val+carry;
                carry = sum/10;
                p1 = p1.next;
                p.next = new ListNode(sum%10);
            }
            p = p.next;
        }
        if (carry != 0) p.next = new ListNode(carry);
        return dummy.next;
    }
}