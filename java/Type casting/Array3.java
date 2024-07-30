//Write a program to print the sum of all the elements in an array
/*
import java.util.*;
public class Array3 {
    public static void m1(int[] a){
        int k=0;
        for(int i=0;i<a.length;i++)
        {
         k=k+a[i];
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        m1(a);
      

    }
    
}
                             */


//Write a program to print sum of only even number in an array.
                             /*
import java.util.*;
public class Array3 {
    public static int m1(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++)                                         
        {
            if(a[i]%2==0){
               sum=sum+a[i];       
    
            }
        }
        return sum;
        
    }
    public static void main(String args[]){
        int a[]={10,23,45,56,76};
        System.out.println(Arrays.toString(a));
        int res=m1(a);
        System.out.println(res);
    }
}

                   */


//Write a program to return true if first and last elements are same.
                    /*
import java.util.*;
public class Array3 {
    public static boolean m1(int[] a){
     
    return a[0]==a[a.length-1];
    }
    public static void main(String args[]){
        int a[]={10,20,39,23};
        boolean res=m1(a);
    
        System.out.println(Arrays.toString(a));
        System.out.println(res);

    }
}
                         */


     
                         
     //write a program to find missing number an array(Array is from 1-n):  


      /*

     import java.util.*;
public class Array3 {
    public static void m1(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            for(int j=a[0];j<a.length;j++)
            {
                if(i)

            }
    
             
    

  
    
        System.out.println(sum-a[i]);


        }
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,7,8,9};
        m1(a);

       // System.out.println("The missing number is " +sum);
    



    }
}
     
     
         */
                                           /*

         //write program to find the largest element in an array:
import java.util.*;
public class Array3 {
    public static void m1(int[] a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
        if(a[i]>max)
        {
           max=a[i];
        }
    }
    System.out.println("The large number is: "+max);
    }
    public static void main(String args[]){
        int a[]={3,5,2,7,2,9};
        System.out.println(Arrays.toString(a));
        m1(a);
    }
}
                         */

                                     /*

                                  //write program to find the largest element in an array:
import java.util.*;
public class Array3 {
    public static void m1(int[] a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
        if(a[i]<min)
        {
           min=a[i];
        }
    }
    System.out.println("The lowest number is: "+min);
    }
    public static void main(String args[]){
        int a[]={3,5,2,7,2,9};
        System.out.println(Arrays.toString(a));
        m1(a);
    }
}


                                  */

                                  /*
         
//Write a program to find pairs whoes sum is equals to given value:

import java.util.*;
public class Array3 {
    public static void m1(int[] a,int gv){
       for(int i=0;i<a.length;i++)
       {
        for(int j=i+1;j<a.length;j++)
        {
            int c=a[i]+a[j];
            if(c==gv)
            {
                System.out.println((a[i]+","+a[j]));
            }
        }

       }
    }
    public static void main(String args[]){
      int a[]={3,1,4,2,8,3};
      int gv=5;
        System.out.println(Arrays.toString(a));
        m1(a,gv);
    }
}

 */
                           /*

//Write the program to find  average of 5 numbers in an array:

import java.util.*;
public class Array3{
    public static float  m1(int[] a){
float avg=0;
for(int i=0;i<a.length;i++)
{
    avg+=a[i];       
    }
   float gv=avg/a.length;
   return gv;

    }

public static void main(String args[]){
    int[] a={1,2,3,4,5,6,7,8};
   
    float res=m1(a);
    System.out.println("The average is: "+res);


}
}

                                                            */



import java.util.*;
public class Array3{
    public static int[] m1() {
        int [] a={1,2,3,4,5};
        return a;
    }
    public static void main(String[] args) {
        int[] a=m1();
        System.out.println(Arrays.toString(a));
    }
}                                                            