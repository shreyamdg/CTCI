package linkedlist;

public class ReturnKthToLast {

	// 1-2-6-4-3-7-8-9 and we want to find the 3rd Node in the list which is 7
	
	public ListNode returnKth(ListNode head, int k) {
		ListNode fast = head;
		ListNode slow = head;
		
		for(int i =1; i<k; i++) {
			if(fast == null)	return null;
			fast = fast.next;
		}
		
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
