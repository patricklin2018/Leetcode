package No21;

class Solution {

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode ptr = first;
        while (true) {
            if (l1 == null) {
                ptr.next = l2;
                return first.next;
            }
            else if (l2 == null) {
                ptr.next = l1;
                return first.next;
            }
            else if (l1.val <= l2.val) {
                ptr.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else {
                ptr.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            ptr = ptr.next;
        }
    }
}