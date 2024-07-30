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


