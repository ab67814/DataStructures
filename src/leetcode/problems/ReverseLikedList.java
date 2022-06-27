package leetcode.problems;

public class ReverseLikedList {
	public static void main(String[] args) {
		ListNode listNode = new ListNode(3, 4);
		listNode.toString();
		ListNode revList = recReverseList(new ListNode(3, 4));
		System.out.println();
		revList.toString();
	}

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	// recursive Approach
	public static ListNode recReverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode rest = recReverseList(head.next);
		head.next.next = head;

		head.next = null;
		return rest;
	}
}
