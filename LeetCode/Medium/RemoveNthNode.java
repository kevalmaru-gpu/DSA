class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0, head);
        ListNode slow = start, fast = start;

        for (int i=0; i<=n; i++){
            fast = fast.next;
        }
        
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }
}

public class RemoveNthNode{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        Solution s = new Solution();
        s.removeNthFromEnd(head, 1);
    }
}