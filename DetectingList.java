// when linked list is cycle return true otherwise return false
public class DetectingList {
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
    // here I solve detecting
    public boolean hasCycle(Node head) {
        if(head == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        DetectingList list = new DetectingList();

        list.addFirst(2);
		list.addFirst(1);
		list.addLast(3);
		list.addLast(1);
		list.printList();
		System.out.println(list.hasCycle(list.head));
    }
}