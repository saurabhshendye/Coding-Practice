package CodingProblems;

/**
 * LeetCode Problem #2 Add Two Numbers
 */

public class AddTwoNumbers {


    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null) {
            return l2;
        } else if (l2== null) {
            return l1;
        }

        int data, carry;
        carry = 0;

        ListNode l3Head = new ListNode(0);
        ListNode l3 = l3Head;
        while (l1!=null || l2!=null) {

            if (l1!=null) {
                l3.val += l1.val;
                l1 = l1.next;
            }

            if (l2!=null) {
                l3.val += l2.val;
                l2 = l2.next;
            }

            if (l3.val >=10) {
                carry = 1;
                l3.val = l3.val%10;
            }
            else {
                carry = 0;
            }

            if (l1==null && l2==null && carry==0) {
                l3.next = null;
            }
            else {
                l3.next = new ListNode(carry);
                l3 = l3.next;
            }
        }
        return l3Head;
    }
}
