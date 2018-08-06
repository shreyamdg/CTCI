package linkedlist;

public class Intersection {
	public ListNode intersectionNodes(ListNode a, ListNode b) {
		ListNode currA = a;
		ListNode currB = b;
		
		while(currA != currB) {
			currA = currA == null? b : currA.next;
			currB = currB == null? a : currB.next;
		}
		
		return currA;
	}

}
