//Linked list using java collection framework.
import java.util.LinkedList;
public class Linkedlist2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        // add first
        list.addFirst(100);
        list.addFirst(10);
        System.out.println(list);
        // add last 
        list.addLast(1200);
        list.addLast(1000);
        System.out.println(list);
        // list size
        System.out.println("size = " +list.size());
        // print list using loop 
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) +" ");
        }
        System.out.println("NULL");
        // remove first 
        list.removeFirst();
        System.out.println(list);
        //remove last 
        list.removeLast();
        System.out.println(list);
        // remove any index 
        list.remove(0);
        System.out.println(list);
    }
}