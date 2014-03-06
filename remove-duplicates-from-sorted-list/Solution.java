import java.util.Hashtable;

public class Solution{
    // Remove Duplicates From Sorted List
    // http://oj.leetcode.com/problems/remove-duplicates-from-sorted-list/
    public static ListNode deleteDuplicates(ListNode head) {
        Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
        ListNode previous = null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while (head != null) {
            if (table.containsKey(head.val)) {
                previous.next = head.next;
            } else {
                table.put(head.val, true);
                previous = head;
            }
            head = head.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode n = new ListNode(5);
        n.add(2);
        n.add(6);
        n.add(1);
        n.add(2);
        n.add(8);
        n.add(5);
        System.out.println(n.printForward());
        ListNode k = deleteDuplicates(n);
        System.out.println(k.printForward());
    }
}