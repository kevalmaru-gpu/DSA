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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = headA;

        int i=0;
        while (temp.next != null){
            map.put(temp, i);
            temp = temp.next;
            i++;
        }

        temp = headB;
        while (map.get(temp) == null){
            temp = temp.next;
        }

        return temp;
    }
}