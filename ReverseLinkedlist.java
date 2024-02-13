// reverse linked list using loop and recusion
public class ReverseLinkedlist {
    Node head;
	
	class Node {
		
		int num;
		Node next;
		
		Node(int num) {
			
			this.num = num;
			this.next = null;
		}
	}
	// add first
	public void addFirst(int num) {
		Node newNode = new Node(num);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	// add last
	public void addLast(int num) {
		Node newNode = new Node(num);
		if(head == null) {
			head = newNode;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	// print list 
	public void printList() {
		if(head == null) {
			System.out.println("List is empty.");
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.num+" ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	// reverse linked list using lopp 
	public void reverse() {
		if(head == null || head.next == null) {
			return;
		}
		Node prev = head;
		Node curr = head.next;
		while(curr != null) {
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		head.next = null;
		head = prev;
	}
	// reverse linked list using loop another system
	public Node reverse(Node head) {
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			return head;
		}
		Node prev = null;
		Node curr = head;
		while(curr != null) {
			Node newNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = newNode;
		}
		return prev;
	}
	// reverse linked list using recursion 
	public Node reverseRec(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseRec(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
    public static void main(String[] args) {
        ReverseLinkedlist list = new ReverseLinkedlist();
        list.addFirst(100);
		list.addFirst(50);
		list.addLast(200);
		list.addLast(500);
		list.printList();
		//list.head = list.reverse(list.head);
		//list.printList();
		//list.head = list.reverseRec(list.head);
		//list.printList();
	   list.reverse();
	   list.printList();
    }
}