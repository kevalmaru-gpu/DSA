import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (slow != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }
}

public class LinkedListCycle{
    public static void main(String[] args) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode x = new ListNode(2);
        map.put(x, 0);

        System.out.println(map.get(new ListNode(1)));
    }
}