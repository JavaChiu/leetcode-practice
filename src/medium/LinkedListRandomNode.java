package medium;

public class LinkedListRandomNode {
	ListNode root;
	int length;

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	/**
	 * @param head
	 *            The linked list's head. Note that the head is guaranteed to be not
	 *            null, so it contains at least one node.
	 */
	public LinkedListRandomNode(ListNode head) {
		this.root = head;
		int i = 0;
		ListNode temp = head;
		for (; temp != null; i++) {
			temp = temp.next;
		}
		length = i;
	}

	/** Returns a random node's value. */
	public int getRandom() {
		if(length==1) {
			return root.val;
		}else {
			int random = (int)(Math.random()*length);	
			ListNode temp = root;
			random--;
			for(;random>=0;random--) {
				temp=temp.next;
			}					
			return temp.val;			
		}		
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		
		LinkedListRandomNode linkedListRandomNode = new LinkedListRandomNode(head);
		
		for(int i=0;i<10;i++) {
			System.out.println(linkedListRandomNode.getRandom());
		}
	}
}
