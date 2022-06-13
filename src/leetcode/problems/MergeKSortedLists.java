package leetcode.problems;

public class MergeKSortedLists {
	
	public static void main(String[] args) {
		mergeKLists(null, 0, 5);
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
		// Base condition
		if (lists == null || lists.length == 0) {
			return null;
		}
		return mergeKLists(lists, 0, lists.length - 1);
	}
	
    private static ListNode mergeKLists(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        // Mid of list of lists
        int mid = start + (end - start) / 2;
        // Recursive call for left sublist
        ListNode left = mergeKLists(lists, start, mid);
        // Recursive call for right sublist
        ListNode right = mergeKLists(lists, mid + 1, end);
        // Merge the left and right sublist
        return mergeTwoLists1(left, right);
    }
    

	public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
		ListNode h = new ListNode(0);
		ListNode ans = h;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				h.next = l1;
				h = h.next;
				l1 = l1.next;
			} else {
				h.next = l2;
				h = h.next;
				l2 = l2.next;
			}
		}
		if (l1 == null) {
			h.next = l2;
		}
		if (l2 == null) {
			h.next = l1;
		}
		return ans.next;
	}
        
	//recursive way
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }
        
	
	

}
