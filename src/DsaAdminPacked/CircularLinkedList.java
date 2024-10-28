package DsaAdminPacked;

import java.util.Scanner;

public class CircularLinkedList
{
    public static void main(String []args)
    {
        System.out.println("CircularLink list");

        CircularLinkedList obj = new CircularLinkedList();
        obj.InsertDeleteOp();
        obj.Display();
    }
     static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
     }
     Node head = null;
    Node tail = null;
    public void InsertDeleteOp()
    {
        int input,n;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                    1.Beg
                    2.Pos
                    3.End
                    4.Del beg
                    5.Del pos
                    6.Del eng
                    7.Display
                    """);
            System.out.println("Enter choice");
            int choice = sc.nextInt();

            if(choice == 1 || choice == 2 || choice == 3) {
                System.out.println("Enter data");
                input = sc.nextInt();
                Node newNode = new Node(input);
                switch (choice) {
                    case 1:

                        if (head == null) {
                            head = newNode;
                            tail = newNode;
                            newNode.next = head;
                        } else {
                            newNode.next = head;
                            head = newNode;
                            tail.next = head;
                        }
                        break;
                    case 2:
                        System.out.println("Enter position");
                        int pos = sc.nextInt();
                        if (head == null) {
                            head = newNode;
                            tail = newNode;
                            newNode.next = head;
                        } else {

                            Node temp = head;
                            for (int i = 0; i < pos - 2; i++) {
                                temp = temp.next;
                            }
                            newNode.next = temp.next;
                            temp.next = newNode;
                        }

                        break;
                    case 3:
                        if (head == null) {
                            head = newNode;
                            tail = newNode;
                            newNode.next = head;
                            System.out.print("");
                        } else {
                            tail.next = newNode;
                            tail = newNode;
                            newNode.next = head;
                        }
                        break;
                }
            }
            else {
                switch (choice) {
                    case 4:
                        if (head == null) {
                            System.out.println("can't delete link list already empty");
                        }

                        else {
                            Node temp = head;
                            temp = temp.next;
                            head = temp;
                            tail.next = head;
                        }

                        break;
                    case 5:
                        if(head == null)
                        {
                            System.out.println("can't delete link list already empty");
                        }
                        else
                        {
                            System.out.println("Enter position");
                            int pos = sc.nextInt();
                            Node temp = head;
                            Node ptr = temp.next;
                            for (int i=0;i<pos-2;i++)
                            {
                                temp=ptr;
                                ptr=ptr.next;
                            }
                            temp.next = ptr.next;
                        }
                        break;
                    case 6:
                        if (head == null)
                        {
                            System.out.println("can't delete link list already empty");
                        }
                        else
                        {
                            Node temp = head;
                            while (temp.next!=head)
                            {
                                temp = temp.next;
                            }
                        }
                        break;
                    case 7:
                        Display();
                        break;
                    default:
                        System.out.println("invalid operation");
                        break;
                }
            }
            System.out.println("\nDo you enter more operation press 1 or not 2");
             n = sc.nextInt();
        }
        while (n==1);
    }
    public void Display()
    {
       Node temp = head;
       if(temp==null)
       {
           System.out.println("linked list is empty");
       }
       else{
            while (temp.next!= head) {
                System.out.print(temp.data+"->");

                temp=temp.next;
            }
           System.out.print(temp.data);
        }
    }
}