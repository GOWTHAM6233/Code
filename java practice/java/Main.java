          //Fibonacci Series in Java

/* public class Main {
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count=10;
        System.out.println(n1);
        System.out.println(n2);

        for(i=0;i<count;i++)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }  
    public static void m2()
    {
        
    }
}

 */
//-------------------------------------------------------------------------------
/* 
class Main{
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
} 
  //-------------------------------------------------------------------------------------------------  
*/








/* 
public class Main
{
    public static void main(String args[])
    {
        int arr[]={4,6,8,2,4,77,32,56,76,87,1,9};
        System.err.println("The Even numbers is:");
        for(int i=arr[0];i<=arr.length-1;i++)
        if(arr[i] %2==0)
        {
            System.out.println(arr[i]);
        }
        System.out.println("The Odd numbers is: ");
        for(int j=arr[0];j<arr.length;j++)
        if(arr[j] %2!=0)
        {
            System.out.println(arr[j]);
        }
        System.out.println("The index value is:");
        System.out.println(arr.length);
    }
}
 //----------------------------------------------------------------------------------------------------------
*/



/* 

class Main{
    public static void main(String args[])
    {
        int a[]={70,390,41,78};
        int sum=0;
        int max=a[0];
        int count=0;
        int min=a[0];
        int count2=0;
        int count3=0;
        System.out.println("The even numbers are:");
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
            if(a[i] %2==0)
            {
                System.out.println(a[i]);
                count2++;
            }
            if(a[i] %2!=0)
            {
                System.out.println("The Odd numbers are:");
                System.out.println(a[i]);
                count3++;
            }

            sum=sum+a[i];
            count++;
        }
        System.out.println("The minimum element is: "+min);
        System.out.println("The maximum number is: "+max);
        System.out.println("The sum of the elemnts is: "+sum);
        System.out.println("The count is:"+count);
        System.out.println("The count is a:"+a.length);
        System.out.println("The count of even numbers in array is: "+count2);
        System.out.println("The count of Odd numbers in array is: "+count3);
    }
} */

/* class Main{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,12,18,30,40,60,120};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%6==0)
            {
                System.out.println("The Divisible of 6 is:"+a[i]);
            }
        }
    }

} */

//DUPLICATE ELEMENTS IN AN ARRAY:

/* public class Main
{
    public static void main(String[] args) {
        int a[]={1,2,1,2,3,4,1,5,6,4,};
        System.out.println("The Duplicate elements are: ");
        int count=a[0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    System.out.println(a[j] +" ");
                }
            } 
        } 
        System.out.println("The count is:" +count);
    }
}

//--------------------------------------------------------------------------------------
 */


/* 
 import java.util.*;
public class Main{
    public static void main(String args[]){
        int a[]={1,2,3};
        int b[]={5,6,2};
        int c[]=new int[a.length+b.length];

        int k=0;
        for(int i=0;i<c.length;i++)
        {
         if(i<a.length)                                        
         {
        c[i]=a[i];                              
         }
        else
        {
         c[i]=b[k++];
        }
        }
        System.out.println(Arrays.toString(c));   
    }
}
    //----------------------------------------------------------------------------------------------
 */
/* 
//THE DUPLICATES ELEMENTS IN ARRAY WITHOUT THE REPEATED ELEMENTS:
 public class Main
{
    public static void main(String[] args) {
        int a[]={1,2,1,2,2,4,3,4,1,5,6,4,};
        System.out.println("The Duplicate elements are: ");
       
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=i+1;j<a.length;j++)
            { 
                if(a[i]==a[j])
                {
                    count++;
                }
            } 
            if(count==1)
            {
            System.out.println(a[i]);
            }
        } 
    }
} */
//-----------------------------------------------------------------------------------------------------------

/* public class Main{
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={4,5,6};
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
            System.out.println(b[i]);
        }
        System.out.println(array);
    }
} 
    //-------------------------------------------------------------------------------------------------
    */


/* class Main{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        System.out.println("The normal array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("The array reverse");
        for(int j=a.length-1;j>=0;j--)
        {
            System.out.println(a[j]);
        }
    }
}
 */

 //-------------------------------------------------------------------------------------------------



/* public class Main
{
    public static void main(String[] args)
    {
        int a[]={1,2,3};
        int b[]={4,5,6};
        int c[]=new int[a.length+b.length];
            for(int i=0;i<a.length+a.length;i++)
          {
            c[i]=
            System.out.println(c[i]);
          }
        
    }
} 
    */
    
    //----------------------------------------------------------------------------------------------------------------------

    //SORTA AN ARRAY:
/* 
    class Main{
        public static void main(String[] args) {
            int a[]={9,8,6,1,4,3,2,10,7,5};
            for(int i=0;i<a.length;i++)
            {
                int num=a[i];
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[j]>a[i])
                    {
                        num=a[j];
                        a[j]=a[i];
                        a[i]=num;
                    }
                }
                System.out.println(a[i]);
            }
        }
    } 
        */

        //----------------------------------------------------------------------------------------------------------------------------


public class Main{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,7};
        int num=0;
        int min=a[0];
        for (int i=0;i<a.length;i++)
        {
        
            if(a[i]<min)
            {
              min+=a[i];
            }
        }
        System.out.println(min);
    }
}