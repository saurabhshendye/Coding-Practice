/**
 * removeKFromList problem form codeFights
 */
//Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in the list, since this is what you'll be asked to do during an interview.
//
//Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to k.
//
//Example
//
//For l = [3, 1, 2, 3, 4, 5] and k = 3, the output should be
//removeKFromList(l, k) = [1, 2, 4, 5];
//For l = [1, 2, 3, 4, 5, 6, 7] and k = 10, the output should be
//removeKFromList(l, k) = [1, 2, 3, 4, 5, 6, 7].
//Input/Output
//
//[execution time limit] 3 seconds (java)
//
//[input] linkedlist.integer l
//
//A singly linked list of integers.
//
//Guaranteed constraints:
//0 ≤ list size ≤ 105,
//-1000 ≤ element value ≤ 1000.
//
//[input] integer k
//
//An integer.
//
//Guaranteed constraints:
//-1000 ≤ k ≤ 1000.
//
//[output] linkedlist.integer
//
//Return l with all the values equal to k removed.

package CodingProblems;


public class removeKFromList {
    // Definition for singly-linked list:
 class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;
 }
    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        ListNode<Integer> temp1 = l;
        ListNode<Integer> temp2 = l;
        while(temp1!=null){
            if (temp1 == l && temp1.value == k){
                l = l.next;
                temp1 = l;
                continue;
            }
            if (temp1.value == k){
                temp2.next = temp1.next;
                temp1 = temp2.next;
                continue;
            }
            temp2 = temp1;
            temp1 = temp1.next;

        }
        return l;
    }
}
