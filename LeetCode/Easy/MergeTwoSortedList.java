class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode lCrawl = list1, rCrawl = list2;
        ListNode sortedList = new ListNode();
        ListNode head = sortedList;
        ListNode prev = head;

        if (list1 == null && list2 == null) {
            return null;
        }

        while (lCrawl != null && rCrawl != null) {
            if (lCrawl.val < rCrawl.val) {
                sortedList.val = lCrawl.val;
                sortedList.next = new ListNode();
                prev = sortedList;
                sortedList = sortedList.next;
                lCrawl = lCrawl.next == null ? null : lCrawl.next;
            } else if (lCrawl.val > rCrawl.val) {
                sortedList.val = rCrawl.val;
                sortedList.next = new ListNode();
                prev = sortedList;
                sortedList = sortedList.next;
                rCrawl = rCrawl.next == null ? null : rCrawl.next;
            } else {
                sortedList.val = lCrawl.val;
                sortedList.next = new ListNode();
                prev = sortedList;
                sortedList = sortedList.next;
                sortedList.val = rCrawl.val;
                prev = sortedList;
                sortedList.next = new ListNode();
                sortedList = sortedList.next;
                lCrawl = lCrawl.next == null ? null : lCrawl.next;
                rCrawl = rCrawl.next == null ? null : rCrawl.next;
            }

        }

        while (lCrawl != null) {
            sortedList.val = lCrawl.val;
            sortedList.next = new ListNode();
            prev = sortedList;
            sortedList = sortedList.next;
            lCrawl = lCrawl.next == null ? null : lCrawl.next;
        }
        while (rCrawl != null) {
            sortedList.val = rCrawl.val;
            sortedList.next = new ListNode();
            prev = sortedList;
            sortedList = sortedList.next;
            rCrawl = rCrawl.next == null ? null : rCrawl.next;
        }

        prev.next = null;

        return head;
    }
}

public class MergeTwoSortedList {
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode s1 = new ListNode(1, new ListNode(2, null));
        ListNode s2 = new ListNode(2, new ListNode(3, null));

        s.mergeTwoLists(s1, s2);
    }
}