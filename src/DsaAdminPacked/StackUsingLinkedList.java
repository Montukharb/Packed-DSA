package DsaAdminPacked;

import java.util.Scanner;

import static java.lang.System.exit;

public class StackUsingLinkedList {
    public static void main(String []args)
    {
        System.out.println("Stacks using Linked list");
        StackUsingLinkedList obj = new StackUsingLinkedList();
        obj.CreateStack();
    }
    static class Stack{
        int data;
        Stack next;
        Stack(int data)
        {
            this.data = data;
            this.next =null;
        }
    }
    Stack head = null;
    void CreateStack()
    {
        int n,ch;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("""
                             1.push
                             2.pop
                             3.display
                             4.exit
                             """);
                     System.out.println("Enter choice");
                     ch = sc.nextInt();
                     switch (ch) {
                         case 1:
                             System.out.println("Enter data");
                             int item = sc.nextInt();
                             Stack newStack = new Stack(item);
                          if(head == null)
                          {
                              head = newStack;
                              System.out.println("first stack inserted");
                          }
                             else{
                             newStack.next = head;
                             head = newStack;
                             System.out.println("item inserted");
                         }
                             break;
                         case 2:
                             if (head == null) {
                                 System.out.println("Stack list already empty");
                             } else {
                                 Stack temp = head;
                                 temp = temp.next;
                                 head = temp;
                                 System.out.println("item deleted");
                             }
                             break;
                         case 3:
                             if (head == null) {
                                 System.out.println("Stack list empty");
                             } else {
                                 Stack temp1 = head;
                                 while (temp1 != null) {
                                     System.out.println(temp1.data);
                                     temp1 = temp1.next;
                                 }
                             }
                             break;
                         case 4:
                             exit(0);
                             break;
                         default:
                             System.out.println("invalid operation");
                             break;
                     }

             System.out.println("Do you enter more process press 1 or n't 2");
             n = sc.nextInt();
         } while (n == 1);
         }
}
