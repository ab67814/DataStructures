package leetcode.problems;

public class SwapNodesInPair {

	public static void main(String[] args) {

	}
	
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
      return swapPairs(head,head.next);
    }
    
    private ListNode swapPairs(ListNode l1, ListNode l2) {
        //base condition
        if(l1==null || l2==null) return l1;
        //swap begins
        l1.next = l2.next;
        l2.next = l1;
        if(l1.next!=null)l2.next.next = swapPairs(l1.next,l1.next.next); 
         
        return l2;

    }

}
