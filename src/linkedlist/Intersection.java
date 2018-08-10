package linkedlist;

public class Intersection {
	public ListNode intersectionNodes(ListNode a, ListNode b) {
		ListNode currA = a;
		ListNode currB = b;
		
		// if no loop is present, both linked list reaches the end of node after two iteration and currA == currB i.e null == null
		// and breaks out of the loop. 
		while(currA != currB) {
			currA = currA == null? b : currA.next;
			currB = currB == null? a : currB.next;
		}
		
		return currA;
	}

}
