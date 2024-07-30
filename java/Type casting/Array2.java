
                                     /*

import java.util.*;
public class Array2{
    public static void main(String args[]){
        int a[]={1,2,3};
        int b[]={5,6,2};
        int c[]=new int[a.length+b.length];

        int k=0;
        for(int i=0;i<c.length;i++)
        {
         if(i<a.length)                                        //OUTPUT:
         {
        c[i]=a[i];                               //                     [1, 2, 3, 5, 6, 2]
         }
        else
        {
         c[i]=b[k++];
        }
        }
        System.out.println(Arrays.toString(c));

        
    }
}



                                                */


import java.util.*;
public class Array2{
    public static void m1(int[] a)
    {
        System.out.println(Arrays.toString(a));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.err.println("Enter the value of array a: ");
        int [] a=sc.nextInt();
        m1(a);
    }

    
}                                                





