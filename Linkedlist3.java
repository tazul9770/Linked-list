// Remove nth node from end 
public class Linkedlist3 {
    DemoNode head;
    class DemoNode {
        int num;
        DemoNode next;

        DemoNode(int num) {
            this.num = num;
            this.next = null;
        }
    }
    // add first 
    public void addFirst(int num) {
        DemoNode newNode = new DemoNode(num);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add last 
    public void addLast(int num) {
        DemoNode newNode = new DemoNode(num);
        if(head == null) {
            head = newNode;
        }
        DemoNode currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // print list 
    public void printList() {
        if(head == null) {
            System.out.println("List is empty");
        }
        DemoNode currNode = head;
        while(currNode != null) {
            System.out.print(currNode.num +" ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    // remove Nth node from end 
    public DemoNode remove(DemoNode head, int n) {
        if(head.next == null) {
            return null;
        }
        int size = 0;
        DemoNode currNode = head;
        while(currNode != null) {
            currNode = currNode.next;
            size++;
        }
        if(n == size) {
            return head.next;
        }
        int indxToSearch = size-n;
        DemoNode prev = head;
        int i = 1;
        while(i < indxToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public static void main(String[] args) {
        Linkedlist3 list = new Linkedlist3();
        list.addFirst(78);
        list.addLast(100);
        list.addFirst(5);
        list.addFirst(45);
        list.printList();
        list.remove(list.head, 2);
        list.printList();
    }
}