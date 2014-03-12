public class Solution{
    // Remove Nth Node From End of List
    // http://oj.leetcode.com/problems/remove-nth-node-from-end-of-list/
    public static Node removeNthFromEnd(Node head, int n) {
        if (head == null)
            return null;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node cur = head;
        while (n-- > 0)
            cur = cur.next;
        while (cur != null) {
            cur = cur.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return dummy.next;
    }
    
    public static void main(String[] args) {
    	int[] arr = {2,5,8,6,1,2,8,4,3,2};
	ListNode list = new ListNode(arr);
	System.out.println(list.printList());
	System.out.println(removeNthFromEnd(list, 3).printList());
    }
}
