// Linked list middle 
public class LinkedlistMiddle {
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
    public Node middle(Node head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        LinkedlistMiddle list = new LinkedlistMiddle();

        list.addFirst(2);
		list.addFirst(1);
		list.addLast(10);
		list.addLast(20);
        list.addLast(50);
		list.printList();
		Node newNode = list.middle(list.head);
		System.out.println(newNode.num);
    }
}