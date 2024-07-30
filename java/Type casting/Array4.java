 //Write a program to swap the values:

 /*1st way:
          temp=a;
         a=b;
        b=temp;

 *2nd way:
        x=x^y;
        y=x^y;
        x=x^y;
 *3rd way:
        x=x+y;
        y=X-y;
        x=x-y;
*4th way:
         x=y-x+(y=x);

*5th way:      
                          
    


  

  */                                   /*
import java.util.*;
public class Array4{
    public static void m1(int a,int b) {
        int temp=0;
        temp=a;
         a=b;
        b=temp;
        System.out.println("After swap a and b is: "+a+" "+b);
    }
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        System.out.println("Before swap a and b is: "+a+" "+b);
        m1(a,b);
    }
    }



                                 */


                                                        /*
// Write a program to find a prime numbers in an array:


import java.util.*;
public class Array4{
    public static void m1(int[] a) {
        
        for(int i=0;i<a.length;i++){
        int count=0;
        int num=a[i];
        for(int j=1;j<=num;j++)
        {
            if(num%j==0)
            count++;
        }
        if(count==2)
        System.out.println(num);

    }
    }
    public static void main(String args[])
    {
        
        
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] a=new int[size];

        m1(a);

    }
    }

                                                       */





    //Write a program to sort a array in ascending order.
       /*
        *bubble Sort
        *insertion sort
        *selection sort
        *Quick sort
        *Merge sort(recursion) 
        .
        .
        .
        .

         */


                                                        /*
    import java.util.Arrays;
    class Array4{
        public static void main(String[] args) {
            int a[]={2,1,4,3,5};
            System.out.println(Arrays.toString(a));
            ascanarray(a);
        }
    
        public static void ascanarray(int []a) {
    
            for (int i=0;i<a.length;i++){
                 for (int j=i+1;j<a.length;j++){
                     if(a[i]>a[j]){
                         a[i]=a[j]-a[i]+(a[j]=a[i]);
    
                     }
    
                 }
            }
            System.out.println(Arrays.toString(a));
    }
    }

                                      */

                                 /*
    //Write a program to left rotate an array:
import java.util.*;
public class Array4{
    public static void rotate(int[] a){
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1]-a[i]+(a[i+1]=a[i]);
        }
         System.out.println(Arrays.toString(a));

    }
    public static void main(String args[])
    {
    int[] a={6,2,9,1,3};
    System.out.println(Arrays.toString(a));
    rotate(a);
    }
}
                            */


  //Write a program to Right rotate an array:
  import java.util.*;
  public class Array4{
      public static void rotate(int[] a){
        int temp=a[a.length-1];
          for(int i=a.length-2;i>0;i--){
              a[i+1]=a[i];
          }
           a[0]=temp;
  
      }
      public static void main(String args[])
      {
      int[] a={6,2,9,1,3};
      System.out.println(Arrays.toString(a));
      rotate(a);
      }
  }
                                  
  
