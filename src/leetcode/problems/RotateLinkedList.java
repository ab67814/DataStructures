package leetcode.problems;

public class RotateLinkedList {

	public static void main(String[] args) {
		ListNode l = new ListNode(3, 4);
		rotateRight(l,1);
	}
	
	 public static ListNode rotateRight(ListNode head, int k) {
	        if(head==null) return null;
	        ListNode current = head;
	        int length = 1;
	        while(current.next != null) {
	            length++;
	            current = current.next;
	        }
	        
	        if(length==1 || k == 0 || k == length || k % length == 0) return head;
	        
	        //cycle list
	        current.next = head;
	        
	        for (int i = length - k % length; i > 1; i--){
	            head = head.next; 
	        }
	        
	        current = head.next;
		    head.next = null;
	        
	        return current;
	        
	    }

}
