package linkedlist;

import java.util.Stack;

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
	
	/* Another Solution */
	
	public boolean isPalindrome(ListNode head) {
		Stack<Integer> nodes = new Stack<>();
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast != null && fast.next != null) {
			nodes.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}

		//if we have odd number of elements
		if(fast != null) {
			slow = slow.next;
		}
		
		while(slow != null) {
			int data = nodes.pop();
			
			if(slow.val != data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
    }
}
