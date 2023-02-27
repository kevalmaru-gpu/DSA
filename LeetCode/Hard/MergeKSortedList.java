class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    static ListNode merge(ListNode s, ListNode t){
        ListNode temp = new ListNode(-1, s);
        ListNode i = temp, j = t;
        ListNode p = null;

        while (j != null){
            if (i.next == null){
                i.next = new ListNode(j.val);
                i = i.next;
                j = j.next;
                p = p == null ? i : p;
                continue;
            }
            if (i.next.val >= j.val){
                temp = i.next;
                i.next =  new ListNode(j.val, i.next);
                i = i.next;
                j = j.next;
            }
            else{
                i = i.next;
            }

            if (p == null){
                p = i;
            }
        }

        return p;
    }
    
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        
        ListNode p = lists[0];

        for (int i=1; i<lists.length; i++){
            p = merge(p, lists[i]);
        }

        // dev
        ListNode temp = p;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

        return p;
    }

    public static void main(String[] args) {
        ListNode[] nodes = {
            null,
            new ListNode(1)
        };

        mergeKLists(nodes);
    }
}