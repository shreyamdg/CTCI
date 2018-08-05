package linkedlist;

import java.util.HashSet;

// In this code, we have a unsorted LinkedList. 
// Our solution include two methods: 
// 1) Using a hashtable which will be O(n) time complexity and O(n) space complexity.
// 2) Second solution is using two pointers which will be O(n^2) time and O(1) space complexity. 

public class RemoveDups {
	// 1) First solution using HashTable:
	
	public void removeDuplicates(ListNode head) {
		if(head == null || head.next == null)	return;
	
		HashSet<Integer> dup = new HashSet<>();
		ListNode curr = head;
		ListNode prev = null;
		while(curr != null) {
			if(dup.contains(curr.val)) {
				prev.next = curr.next;
			}else {
				dup.add(curr.val);
				prev = curr;
			}
			curr = curr.next;
		}
		
	}
	
	public void twoPointers(ListNode head) {
		ListNode curr = head;
		while(curr != null) {
			ListNode runner = curr;
			while(runner.next != null) {
				if(runner.next.val == curr.val) {
					runner.next = runner.next.next;
				}else {
					runner = runner.next;
				}
			}
			curr = curr.next;
		}
	}
}
