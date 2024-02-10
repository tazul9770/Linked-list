// Linked list palindrome 
public class ListPalindrome {
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
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while(curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public Node middle(Node head) {
        Node first = head;
        Node second = head;
        while(first.next != null && first.next.next != null) {
            first = first.next.next;
            second = second.next;
        }
        return second;
    }
    // Palindrome method
    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null) {
            return true;
        }
        Node firstHalfEnd = middle(head);
        Node secondHalfStart = reverse(firstHalfEnd.next);
        Node firstHalfStart = head;
        while(secondHalfStart != null) {
            if(firstHalfStart.num != secondHalfStart.num) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListPalindrome list = new ListPalindrome();

        list.addFirst(2); 
		list.addFirst(1);
		list.addLast(2);
		list.addLast(1);
		list.printList();
        System.out.println(list.isPalindrome(list.head));
    }
}