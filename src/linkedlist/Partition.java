package linkedlist;

public class Partition {
	public static ListNode partitionNode(ListNode node, int x) {
		ListNode head = node;
		ListNode tail = node;
		
		while(node != null) {
			ListNode next = node.next;
			if(node.val < x) {
			node.next = head;
			head = node;
			}else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		
		tail.next = null;
		
		return head;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(3);
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(8);

		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(10);
		ListNode n6 = new ListNode(2);
		ListNode n7 = new ListNode(1);
		
		int x = 5;
		 
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;  n4.next =n5; n5.next= n6; n6.next = n7; n7.next=null;

		ListNode deleted = partitionNode(n1, x);
	}
}
