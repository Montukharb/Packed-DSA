package DsaAdminPacked;

import java.util.Scanner;

public class DoublyLinkedList {
    public static void main(String []args)
    {
        System.out.println("run");
        Doubly Db = new Doubly();
        Db.Creation();
        Db.Display();
    }
}
class Doubly{
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
                    newNode.prev = null;
                    head = newNode;
                    break;
                    case 2:
                        tail.next = newNode;
                        newNode.prev = tail;
                        tail = newNode;
                        break;
                    case 3:
                        System.out.println("Enter position");
                        int pos = sc.nextInt();
                        Node temp3 = head;
                        Node ptr = temp3.next;
                        for(int i =0;i<pos-2;i++)
                        {
                            temp3 = ptr;
                            ptr = ptr.next;
                        }
                        newNode.next = temp3.next;
                        temp3.next = newNode;
                        ptr.prev = newNode;
                        newNode.prev = temp3;
                        break;

                    case 4:
                        Node temp4 = head;
                        if(temp4==null)
                        {
                            System.out.println("list already empty");
                        }
                        else
                        {
                            temp4 = temp4.next;
                            head = temp4;
                            temp4.prev = null;
                            System.out.println("first node delete");
                        }
                        break;
                    case 5:
                        Node temp5 = tail;
                        if(temp5==null)
                        {
                            System.out.println("list already empty");
                        }
                        else
                        {
                            temp5 =  temp5.prev;
                            temp5.next.prev = null;
                            temp5.next = null;
                            tail = temp5;
                            System.out.println("last node delete");
                        }
                        break;
                    case 6:
                        System.out.println("Enter position");
                        int pos2 = sc.nextInt();
                        Node temp6 = head;
                        if(temp6 == null)
                        {
                            System.out.println("list already empty");
                        }
                        else
                        {
                            Node ptr6 = temp6.next;
                            for(int i =0;i<pos2-2;i++)
                            {
                                temp6 = ptr6;
                                ptr6 = ptr6.next;
                            }
                            ptr6.next.prev = temp6;
                            temp6.next = ptr6.next;
                            System.out.println("item delete");
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
        Node temp = head;
        System.out.println("Normal Traversing");
        if(temp == null)
        {
            System.out.println("list empty");
        }
        else {
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
        System.out.println("\nBack Traversing");
        Node temp2 = tail;
        try {
            if (temp2 == null) {
                System.out.println("list empty");
            } else {
                while (tail != null) {
                    System.out.print("<-"+temp2.data);
                    temp2 = temp2.prev;
                }
            }
        }catch (Exception e)
        {
            System.out.println("\n"+e.getMessage());
        }finally {
            System.out.println("without problem exit");
        }
    }

}
