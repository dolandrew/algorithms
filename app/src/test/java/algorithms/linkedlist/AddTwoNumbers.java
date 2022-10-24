package algorithms.linkedlist;

class AddTwoNumbers {

    /*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // create a dummy node (value 0) result
        // create a pointer curr to that node
        // initialize int carry to 0
        // while the pointers point to a node, or there's carry over
        //   get the value of  each node (it could be null at the end, in that case 0)
        //   add them together with carry
        //   carry is now sum / 10   (12 / 10 = 1)
        //   attach a node of value (sum % 10) to the result  (12 % 10 = 2)
        //   move the result pointer
        //   move l1 and l2 pointers right if they point to something
        // return dummy.next;


        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummy.next;

    }


}