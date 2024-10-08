package DsaAdminPacked;

import java.util.Scanner;

public class Array_Sample {
    public static void main(String []args)
    {
        System.out.println("Admin driver code");
        System.out.println("Enter how many elements stored");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //create an object Arrays class
        Arrays create = new Arrays();
        int []elements = new int[size];
        System.out.println("Enter elements");
        for (int i=0;i<elements.length;i++)
        {
             elements[i] = sc.nextInt();
        }
        create.DisplayArray(elements,size);

    }
}
class Arrays{
    public void DisplayArray(int []elements,int size)
    {
        for (int i = 0;i<size;i++)
        {
            System.out.print(elements[i]+" ");
        }
    }
}
