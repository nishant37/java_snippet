
public class reverseList {
	
	static Node head;
	
	static class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseList rl = new reverseList();
		rl.head = new Node(1);
		rl.head.next = new Node(2);
		rl.head.next.next = new Node(3);
		head = rl.reverse(head);
		System.out.print("Reverse linked list is ");
		while(head!=null) {
			System.out.print(head.data + " ");
		    head = head.next;	
		}
	}

	private Node reverse(Node head2) {
		// TODO Auto-generated method stub
		
		Node previous = null;
		Node current = head2;
		Node next = null;
		
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head2 = previous;
		return head2;
		
		
	}

}
