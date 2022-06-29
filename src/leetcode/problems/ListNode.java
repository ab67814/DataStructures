package leetcode.problems;

public class ListNode {
	

	int val;
	ListNode next;

	ListNode() {
	}
	
	ListNode(int three,int four) {
		this.val = 1;
		next = new ListNode(2);
		next.next = new ListNode(three);
		next.next.next = new ListNode(four);
		next.next.next.next = new ListNode(5);
	}
	
	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
//	@Override
//	public String toString() {
//		System.out.print("["+val);
//		while(next!=null) {
//			System.out.print(","+next.val);
//			next = next.next;
//		}
//		System.out.print("]");
//		return "";
//	}
}
