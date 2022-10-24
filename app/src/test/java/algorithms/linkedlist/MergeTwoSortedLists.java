package algorithms.linkedlist;

import org.junit.jupiter.api.Test;

class MergeTwoSortedLists {

    /*
    You are given the heads of two sorted linked lists list1 and list2.

       Merge the two lists in a one sorted list. The list should be made by
       splicing together the nodes of the first two lists.

    Return the head of the merged linked list.
     */

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // handle base case, either of the lists could be null
        // create a dummy pointer with value 0
        // create a pointer curr that points to dummy
        // while l1 and l2 point to something
        //   if (l1 >= l2)
        //     curr.next is l2
        //     l2 is l2.next
        //   else
        //     curr.next is l1
        //     l1 is l1.next
        //   either way though curr is curr.next
        // loop is over, one pointer doesn't point to something anymore
        // curr.next is whichever pointer isn't null
        // return dummy.next


        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null? l2:l1;
        return dummy.next;

    }


    @Test
    public void test() {
        ListNode three = new ListNode(4, null);
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