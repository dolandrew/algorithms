package algorithms.linkedlist;

import org.junit.jupiter.api.Test;

class ReverseLinkedListII {
    ListNode left;
    boolean stop;

    public ListNode reverseBetween(ListNode head, int m, int n) {

        this.left = head;
        this.stop = false;

        recurseAndReverse(head, m, n);
        return head;
    }
    
    public void recurseAndReverse(ListNode right, int m, int n) {
        if (n > 1) {
            right = right.next;
        } else {
            return;
        }

        if (m > 1) {
            this.left = this.left.next;
        }

        recurseAndReverse(right, m - 1, n - 1);

        if (left == right || right.next == left) {
            stop = true;
        }

        if (!this.stop) {
            int t = this.left.val;
            this.left.val = right.val;
            right.val = t;
            this.left = this.left.next;
        }
    }

    @Test
    public void test() {
        ListNode six = new ListNode(6, null);
        ListNode five = new ListNode(5, six);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);
        System.out.println(reverseBetween(head, 2, 3));
    }
}