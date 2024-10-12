package DsaAdminPacked;

import java.util.Scanner;

public class SingleLinkList {
    public static void main(String[] args) {
        System.out.println("A LinkedList presents");
    SingleLinkList obj = new SingleLinkList();
    int status = 1;
    Scanner sc = new Scanner(System.in);
    while(status!=0) {

        System.out.println("""
                
                1. Insert Beginning,
                2. Insert Position,
                3. Insert End,
                4. Display,
                5. Delete Beginning,
                6. Delete Position,
                7. Delete End
                8. Exit
                """);
        System.out.println("Enter your choice");
        int checkout = sc.nextInt();
        switch (checkout)
        {
            case 1:
                obj.InsertBeginning();
                break;
            case 2:
                obj.InsertPosition();
                break;
            case 3:
                obj.InsertEnd();
                break;
            case 4:
              obj.Display();
                break;
            case 5:
                obj.DeleteBeginning();
                break;
            case 6:
                obj.DeletePosition();
                break;
            case 7:
                obj.DeleteEnd();
                break;
            case 8 :
                status = 0;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void InsertBeginning()
    {
            int input,i;
            Scanner sc =new Scanner(System.in);
            do {
                System.out.println("Enter data");
                input = sc.nextInt();
                Node NewNode = new Node(input);
                if (head != null) {
                    NewNode.next = head;
                }
                head = NewNode;
                System.out.println("Do you enter data press 1 or not 2 key");
                i = sc.nextInt();
            }while (i!=2);
        }

       public void InsertPosition()
       {
           int input,i;
           Scanner sc =new Scanner(System.in);
           do {
               System.out.println("Enter data");
               input = sc.nextInt();
               Node NewNode = new Node(input);
               if (head == null) {
                   head = NewNode;
               } else {
                   Node temp = head;
                   System.out.println("Enter position");
                   int pos = sc.nextInt();
                   for(int i1=0;i1<pos-2;i1++) {
                       temp = temp.next;
                   }
                   NewNode.next = temp.next;
                   temp.next=NewNode;
               }
               System.out.println("Do you enter data press 1 or not 2 key");
               i = sc.nextInt();
           }while (i!=2);
       }

    public void InsertEnd()
    {
        int input,i;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println("Enter data");
            input = sc.nextInt();
            Node NewNode = new Node(input);
            if (head == null) {
                head = NewNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = NewNode;
            }
            System.out.println("Do you enter data press 1 or not 2 key");
            i = sc.nextInt();
        }while (i!=2);
    }
    public void DeleteBeginning()
    {
        if(head==null)
        {
            System.out.println("Linked list is null");
        }
        else
        {
            Node temp;
            temp=head.next;
            head=temp;
        }
    }
    public void DeletePosition()
    {
        try {
            if (head == null) {
                System.out.println("Linked list is empty");
            } else {
                System.out.println("Enter position");
                Scanner sc = new Scanner(System.in);
                int position = sc.nextInt();
                Node ptr = head;
                Node temp = ptr.next;
                for (int j = 0; j < position - 2; j++) {
                    ptr = temp;
                    temp = temp.next;
                }
                ptr.next = temp.next;


            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void DeleteEnd()
    {
        try {
            if(head==null)
            {
                System.out.println("Linked list is null");
            }
            if(head.next==null)
            {
                head = null;
            }
        else
            {
                Node temp = head;
                Node ptr = temp.next;
                while (temp.next != null) {
                    ptr = temp;
                    temp = temp.next;
                }
                    ptr.next = null;



            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void Display()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }
}