package DsaAdminPacked;

import java.util.Scanner;

public class Array_Delete {
    public static void main(String []args)
    {
        System.out.println("Array deleting");
        System.out.println("Before deleting array create a array");
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        System.out.println("Enter elements");
        int []arr = new int[size];
        for(int i =0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }


        Array_Deleting obj = new Array_Deleting();
        obj.Delete_First(arr,size);
        obj.Delete_End(arr,size);
        obj.Delete_Position(arr,size);

    }
}
class Array_Deleting{
    public void Delete_First(int []arr,int size)
    {
        System.out.println("Before Delete any element");
        for (int s:arr)
        {
            System.out.print(s+" ");
        }
        System.out.println("After Delete first element");

        for(int i=0;i<size;i++)
        {
            if(i==0)
            {
                continue;
            }
            else
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public void Delete_End(int []arr,int size)
    {
        System.out.println("Before Delete any element");
        for (int s:arr)
        {
            System.out.print(s+" ");
        }
        System.out.println("After Delete last element");
        for(int i=0;i<size;i++)
        {
            if(i==size-1)
            {
                continue;
            }
            else
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public void Delete_Position(int []arr,int size)
    {
        System.out.println("Enter deleted position");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        System.out.println("Before Delete any element");
        for (int s:arr)
        {
            System.out.print(s+" ");
        }
        System.out.println("After Delete position element");
        for(int i=0;i<size;i++)
        {
            if(i==pos)
            {
                continue;
            }
            else
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

}
