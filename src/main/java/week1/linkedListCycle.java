package week1;

/***
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * Input: head = [3,2,0,-4], pos = 1
 */
public class linkedListCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode cur = head, next = head;
        while (next != null && next.next != null) {
            cur = cur.next;
            next = next.next.next;

            if (cur == next) return true;
        }
        return false;
    }

}
