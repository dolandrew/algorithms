package algorithms.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        // make a copy of the list

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        // use two pointers to compare the lists

        int low = 0;
        int high = list.size()-1;
        while (low < high) {
            if (!list.get(low).equals(list.get(high))) {
                return false;
            }
            low++;
            high--;
        }
        return true;

    }

    @Test
    public void test() {
        ListNode four = new ListNode(1, null);
        ListNode three = new ListNode(2, four);
        ListNode two = new ListNode(1, three);
        ListNode head = new ListNode(1, two);
        System.out.println(isPalindrome(head));

    }
}