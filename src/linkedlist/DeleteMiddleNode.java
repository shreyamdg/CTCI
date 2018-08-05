package linkedlist;

public class DeleteMiddleNode {
	public void deleteMiddle(ListNode node) {
		if(node == null || node.next == null) return;
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
