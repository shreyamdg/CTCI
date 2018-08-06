package linkedlist;

public class LoopDetection {
	
	public ListNode getStartofTheLoop(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && slow != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				break;
			}
		}
		
		slow = head;
		
		while(fast != slow) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
	}

}
