class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a, b, rem = 0, sum;
        ListNode head = new ListNode(), prevHead = head, origHead = head;

        while (l1 != null || l2 != null){
            a = l1 != null ? l1.val : 0;
            b = l2 != null ? l2.val : 0;
            sum = a + b + rem;
            rem = 0;
            
            head.val = sum % 10;
            head.next = new ListNode();
            prevHead = head;
            head = head.next;

            rem = sum / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (rem != 0){
            head.val = rem;
            head.next = null;
            prevHead = head;
        }

        prevHead.next = null;

        return origHead;
    }
}

public class AddTwo {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4))));
    }    
}
