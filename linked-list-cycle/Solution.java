public class Solution {
    // Linked List Cycle
    // http://oj.leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
        return false;
        ListNode slowRunner = head;
        ListNode fastRunner = head;

        while (fastRunner != null && fastRunner.next != null){
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
            if (slowRunner == fastRunner)
                break;
        }

        // error check
        if (fastRunner == null || fastRunner.next == null)
            return false;

       /* slow runner = head
        * then iterate slow and fast runners at the same pace
        * they will meet at some point. the point is the meeting point
        */
        slowRunner = head;
        while (slowRunner != fastRunner){
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next;
        }

        return true;
    }
}
