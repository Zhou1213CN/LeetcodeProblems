class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (ListNode l : lists){
            while (l != null){
                p.add(l.val);
                l = l.next;
            }
        }
        ListNode cur = new ListNode(-1);
        ListNode res = cur;
        while (!p.isEmpty()){
            cur.next = new ListNode(p.remove());
            cur = cur.next;
        }
        return res.next;
        
    }
}