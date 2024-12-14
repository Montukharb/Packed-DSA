package DsaAdminPacked;
import java.util.Scanner;
import static java.lang.System.exit;
public class StackUsingArray {
    public static void main(String []args)
    {
        System.out.println("Stack using array");
        Scanner sc = new Scanner(System.in);
        StackUsingArray obj = new StackUsingArray();
        System.out.println("Enter size");
        int size = sc.nextInt();
        obj.Stack(sc,size);
    }
   public void Stack(Scanner sc,int size)
    {
        int []arr = new int[size];
        int n,top = -1;//by default minus top
        do {
            System.out.println("""
                    1.push
                    2.pop
                    3.display
                    4.exit
                    """);
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter item");
                    int data = sc.nextInt();
                    if (top == size - 1) {
                        System.out.println("overflow");
                    } else {
                        top++;
                        arr[top] = data;
                        System.out.println("item inserted");
                    }
                    break;
                case 2:
                    if (top == -1) {
                        System.out.println("underflow");
                    } else {
                        top = top - 1;
                        System.out.println("item delete");
                    }
                    break;
                case 3:
                    for (int i = top; i >= 0; i--) {
                        System.out.println(arr[i]);
                    }
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("invalid operation");
                    break;
            }
            System.out.println("Do u enter more  process 1 or n't 2");
             n = sc.nextInt();
        }
        while (n==1);
    }
}