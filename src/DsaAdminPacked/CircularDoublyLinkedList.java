package DsaAdminPacked;

import java.util.Scanner;

public class CircularDoublyLinkedList {
    public static void main(String []args)
    {
        System.out.println("run");
        CircularDoubly Db = new CircularDoubly();
        Db.Creation();
        Db.Display();
    }
}
class CircularDoubly{
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    Node tail = null;
    public void Creation()
    {
        Scanner sc = new Scanner(System.in);
        int item,n,choice;
        do {
            System.out.println("Enter data");
            item = sc.nextInt();
            Node newNode = new Node(item);

            if (head == null) {
                head = newNode;
                newNode.next = head;
                newNode.prev = newNode;
                tail = newNode;
            } else {
                System.out.println("""
                        1.Beg
                        2.End
                        3.Pos
                        4.Del Beg
                        5.Del Eng
                        6.Del Pos
                        7 Display
                        Enter choice""");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                     newNode.next = head;
                     head.prev = newNode;
                     head = newNode;
                     tail.next = head;
                     newNode.prev = tail;
                        break;
                    case 2:
                        tail.next = newNode;
                        newNode.prev = tail;
                        tail = newNode;
                        tail.next = head;
                        break;
                    case 3:
                        System.out.println("Enter position");
                        int pos = sc.nextInt();
                        Node temp =head;
                        Node ptr = temp.next;
                        for(int i=0;i<pos-2;i++)
                        {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        newNode.next = ptr;
                        temp.next = newNode;
                        ptr.prev = newNode;
                        newNode.prev = temp;
                        break;
                    case 4:
                        Node temp1 = head;
                        if (temp1 == null) {
                            System.out.println("List is already empty");
                        } else {
                            // Handle single node list
                            if (head == head.next) { // Only one node
                                head = null;
                                tail = null;
                            } else {
                                // Update head and last node pointers for multiple nodes
                                head = head.next;
                                head.prev = temp1.prev; // Set new head's prev to the previous last node
                                tail.next = head; // Set previous last node's next to the new head
                            }
                            temp = null; // Optionally, set temp to null for garbage collection
                            System.out.println("Item deleted");
                        }
                        break;
                    case 5:
                        if (head == null) {
                            System.out.println("List is empty");
                            return;
                        }

                        if (head == tail) { // Single node
                            head = tail = null;
                        } else {
                            Node secondLast = tail.prev;
                            tail.prev.next = null; // Break the link between second-last and last
                            tail = secondLast; // Update tail pointer
                            tail.next = head; // Make the circular link
                        }
                        break;
                    default:
                        System.out.println("invalid operation");
                        break;
                }
            }
            System.out.println("Do u enter more date Press 1 or not 2");
            n = sc.nextInt();
        }while (n==1);
    }
    void Display()
    {
        Node temp11 = head;
        System.out.println("Normal Traversing");
        if(temp11 == null)
        {
            System.out.println("list empty");
        }
        else {
            while (temp11.next!= head) {
                System.out.print(temp11.data+"<-" );
                temp11 = temp11.next;
            }
            System.out.print(temp11.data );
        }

    }

}
