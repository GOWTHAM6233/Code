/* public class Main2
{
    public static void main(String[] args) {
        int a[]={1,2,1,2,3,4,1,5,6,4,};
        int temp=0;
        System.out.println("The Duplicate elements are: ");
       
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            { 
                if(a[i]==a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            } 
        } 

    }
} 
     */
    //------------------------------------------------------------------------------------------------------------------
//FIND THE MISSING NUMBER:
   /*  public class Main2{
        public static void main(String[] args) {
            int a[]={1,2,3,4,5,7,8};
            int min=a[0];
            for ( int i=0; i<a.length; i++)
            {
                if(a[i]<min)
                min=a[i];
            }
            System.out.println("The Minimum element is:"+min);
            int max=a[0];
            for ( int i=0; i<a.length; i++)
            {
                
                if(a[i]>max)
                max=a[i];
            }
            System.out.println("The Maximum element is:"+max);

            for(int i=min;i<max;i++)
            {
                boolean flag=true;
                for(int j=0;j<a.length;j++)
                {
                    if(i==a[j])
                    {
                        flag=false;
                    }
                   
                }
                if(flag)
                {
                    System.out.println("The missing element is:"+i);
                }
            }
        }
    } 
        */
        //============================================================================================================================

/* public class Main2{
    public static void main(String[] args) {
        int a[]={1,2,3,4,2,11,11,3,11,1,2,4,6};
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
            int[] b=new int [a.length];
            if(count==1)
            {
                b[i]=a[i];
                System.out.println(a[i]);
            }
            int temp=b[0];
            for(int k=0;k<b.length;k++)
            {
                for(int l=k+1;l<b.length;l++)
                {
                    if(b[k]>b[l])
                    {
                        temp=b[l];
                        b[l]=b[k];
                        b[k]=temp;
                    } 
                }
            }
            System.out.println("The ascending order is:"+a[i]);
        }
    }
}      
    */
    //-------------------------------------------------------------------------------------------------------


                        //THE FREEQUENCY OF NUMBER
/* class Main2
{
    public static void main(String[] args) {
        int a[]={10,20,30,20,10,40};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {

            boolean flag=true;
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[i])
                {
                    flag=false;
                }
            }
            if(flag)
            {
                int count=0;
                for(int k=0;k<a.length;k++)
                {
                    if(a[i]==a[k])
                    {
                        count++;
                    }
                }
                System.out.println("The freequency of "+"'"+a[i]+"'"+" is:"+count);
            }
        }
    }
}     */

//---------------------------------------------------------------------------------------------
//PAIR OF SUM ELEMENTS:

/* import java.util.*;
class Main2{
    public static void main(String[] args) {
        int a[]={1,2,3,4,3};
        System.err.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(num==a[i]+a[j])
                {
                    System.out.println(a[i]+"," +a[j]);
                }
            }
        }  
    }

}  */
//--------------------------------------------------------------------------------------------------------------
/* 
//DELETE ELEMENT FROM AN ARRAY:
import java.util.*;
public class Main2{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for ( int i=0; i<a.length;i++)
        {
            if(num!=a[i])
            {
                num=a[i];
            }
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }

    }
} 

*/

/**
 * Main2
 */
public class Main2 {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int min1=a[0];
        int min2=a[1];
        for(int i=0;i<a.length;i++)
        {
            if(min1>a[i])
            {
                min1=a[i];
            }
        }
        for(int i=0;i<a.length;i++)
        {

        }

    }
}