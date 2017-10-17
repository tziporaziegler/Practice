package linkedlist;

/**
 * Reverse a singly linked list.
 * 
 * @author Tzipora Ziegler
 *
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}
		return prev;
	}
}
