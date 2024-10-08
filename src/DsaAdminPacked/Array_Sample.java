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
        create.AddFirst(elements,size);
        create.AddEnd(elements,size);
        create.AddPosition(elements,size);


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
    public void AddFirst(int []elements,int size)
    {
        System.out.println("Enter new element");
        Scanner sc = new Scanner(System.in);
        int newElement = sc.nextInt();
        int []b = new int[size+1];
        for(int i=0;i<size+1;i++)
        {
            if(i==0)
            {
                b[i]=newElement;
            }
            else
            {
                b[i]=elements[i-1];
            }
        }
        for (int e:b)
        {
            System.out.println(e+" ");
        }
    }
    public void AddEnd(int []array,int size)
    {
        System.out.println("Enter new elements");
        Scanner sc = new Scanner(System.in);
        int newElement = sc.nextInt();
        int []b = new int[size+1];
        for(int i=0;i<size+1;i++)
        {
            if(i<size)
            {
                b[i]=array[i];
            }
            else
            {
                b[i]=newElement;
            }
        }
        for (int e:b)
        {
            System.out.println("After addition End"+e+" ");
        }
    }
    public void AddPosition(int []array,int size)
    {
        System.out.println("Enter position");
        int []b = new int[size+1];
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        System.out.println("Enter new element");
        int new_element = sc.nextInt();
        for(int i=0;i<size+1;i++)
        {
            if(i<pos)
            {
                b[i] = array[i];
            }
            else if(i==pos)
            {
                b[i]=new_element;
            }
            else
            {
                b[i]=array[i-1];
            }
        }
        System.out.println("After position");
        for (int c:b)
        {
            System.out.println(c+" ");
        }
    }
}
