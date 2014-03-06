public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    public void add(int d) {
        ListNode end = new ListNode(d);
        ListNode n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
    public String printForward(){
        if (next != null) {
          return val + "->" + next.printForward();
        } else{
          return ((Integer) val).toString();
        }
      }
}