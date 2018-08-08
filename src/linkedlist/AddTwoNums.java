package linkedlist;

public class AddTwoNums {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode prev = new ListNode(0);
		ListNode head = prev;
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			ListNode curr = new ListNode(0);
			int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
			curr.val = sum % 10;
			carry = sum / 10;
			prev.next = curr;
			prev = curr;

			l1 = (l1 == null) ? l1 : l1.next;
			l2 = (l2 == null) ? l2 : l2.next;
		}

		return head.next;
	}

	// Recursive Solution:

	public ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2) {
		return helper(l1, l2, 0);
	}

	private ListNode helper(ListNode l1, ListNode l2, int carry) {
		if (l1 == null && l2 == null && carry == 0)
			return null;
		int sum = carry;
		if (l1 != null)
			sum += l1.val;
		if (l2 != null)
			sum += l2.val;

		ListNode head = new ListNode(sum % 10);
		ListNode more = helper(l1 != null ? l1.next : null, l2 != null ? l2.next : null, sum / 10);
		head.next = more;

		return head;
	}
}
