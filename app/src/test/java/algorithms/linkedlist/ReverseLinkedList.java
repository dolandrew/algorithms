package algorithms.linkedlist;

import org.junit.jupiter.api.Test;

class ReverseLinkedList {
    class ListNode {
       int val;
       ListNode next;

       ListNode(int val, ListNode next) {
           this.val = val;
           this.next = next;
       }
   }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
        }
        return prev;
    }

    @Test
    public void test() {
        ListNode six = new ListNode(6, null);
        ListNode five = new ListNode(5, six);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);
        ListNode reversed = reverseList(head);
        while (reversed != null) {
            System.out.println(reversed.val);
            reversed = reversed.next;
        }
    }
}