//Linked List 
public class Linkedlist1 {
    //this is head
    Node head;
    private int size;
    Linkedlist1() {
        this.size = 0;
    }
    // this is Node 
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //Add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //Add last 
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //Print list
    public void printList() {
        if(head == null) {
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data +" ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    //Delete First 
    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //Delete Last 
    public void deleteLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        Linkedlist1 list = new Linkedlist1();
        list.addFirst("world");
        list.addLast("best");
        list.addFirst("Shakib");
        list.addLast("Allrounder");
        list.addLast("and");
        list.addLast("also");
        list.addLast("hardik pandiya");
        list.printList();
       // list.reverse();
        list.printList();
        //print list size
        System.out.println("size = " +list.getSize());
        list.deleteFirst();
        //Delete first element
        list.printList();
        list.deleteLast();
        //Delete Last element
        list.printList();
    }
}