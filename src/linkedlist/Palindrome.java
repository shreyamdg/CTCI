package linkedlist;

public class Palindrome {
	public boolean ifPalindrome(ListNode head) {
		ListNode reversed = getReversedList(head);
		return checkEqual(head, reversed);
	}
	
	public ListNode getReversedList(ListNode head) {
		ListNode prev = null;
		while(head != null) {
			ListNode newNode = new ListNode(head.val);
			newNode.next = prev;
			prev = newNode;
			head = head.next;
		}
		
		return prev;
	}
	
	public boolean checkEqual(ListNode head, ListNode reversed) {
		while(head != null) {
			if(head.val != reversed.val) {
				return false;
			}
			
			head = head.next;
			reversed = reversed.next;
		}
		return true;
	}
}
