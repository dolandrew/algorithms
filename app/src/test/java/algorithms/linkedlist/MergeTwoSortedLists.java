package algorithms.linkedlist;

import org.junit.jupiter.api.Test;

class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1 != null && l2!= null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null? l2:l1;
        return dummy.next;
    }


    @Test
    public void test() {
        ListNode three = new ListNode(3, null);
        ListNode two = new ListNode(2, three);
        ListNode head1 = new ListNode(1, two);

        ListNode five = new ListNode(4, null);
        ListNode four = new ListNode(3, five);
        ListNode head2 = new ListNode(1, four);
        ListNode merged = mergeTwoLists(head1, head2);
        while (merged != null) {
            System.out.println(merged.val);
            merged = merged.next;
        }
    }
}