//REMOVE THE INDEX OF ARRA ELEMENT
/* public class Main3
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        int index=1;
        int pointer=0;
        for(int i=0;i<a.length;i++)
        {
            if(i!=index)
            {
                b[pointer]=a[i];
                pointer++;
            }
        }
        for(int i=0;i<a.length-1;i++)
        {
        System.out.println(b[i]);
        }
    }
} 
*/
//------------------------------------------------------------------------------------------------------

//MINIMUM DIFFERENCE BETWEEN THE ELEMENT:

/* import java.util.*;
class Main3
{
    public static void main(String[] args) {
        int a[]={1,2,30,4,3,8,5,9,7};
        int minValue=200;
        int minVar1=a[0];
        int minVar2=a[1];
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]-a[j]<minValue && a[i]>a[j])
                {
                    minValue=a[i]-a[j];
                    minVar1=a[i];
                    minVar2=a[j];

                }
                if(a[j]-a[i]<minValue && a[j]>a[i]);
                {
                    minValue=a[j]-a[i];
                    minVar1=a[i];
                    minVar2=a[j];
                }
            } 
        }
        System.out.println("The minimum difference between "+minVar1 +" and "+minVar2 +" is: "+minValue);
    }
} */

//------------------------------------------------------------------------------------------
/**
 * Main3
 */
/* public class Main3
 {
    public static void main(String[] args) {
        
    }

    int a[]={2,2,1,4};
    int b[]=new int[a.length-1];
    int min=a[0];
    int min1=0;
    int min2=0;
    for(int i=1;i<a.length;i++)
    {
        if(min>a[i])
        {
           min=a[i];
           min1=min; 
        }
    }
    for(int i=0;i<a.length;i++)
    {
      if(min1!=)
    }
    
}
} */

//----------------------------------------------------------------------------------------------------------
//FIRST MINIMUM:


/* import java.util.*;
class Main3
{
    public static void main(String[] args)
     {
        int a[]={10,2,2,2,2,2,30,4,3,4,1,3,3,3,3,-1,1000};
        int m1=a[0];
        int m2=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(m1<a[i])
            {
                m1=a[i];
            }
        }
        for(int i=0;i<a.length;i++)
        {

            if(m1!=a[i]&&m2<a[i])
            {
                m2=a[i];
            }
        }
    }
}
  */
    

     //----------------------------------------------------------------------------------------------------------------------------

//EVEN INDEX OF AN ARRAY:

/* class Main3{
    public static void main(String[] args) {
        int a[]={1,2,3,5,6,6,84,84,3};
        for(int i=0;i<a.length;i++)
        {  
            if(a[i]%2==0)
            {
                System.out.println(i);
            }      
        }

    }
} 
 */
//---------------------------------------------------------------------------------------------------------------------

 /**
  * THE AVERAGE OF AN ARRAY ELEMENTS:
  */
 public class Main3 {
    public static void main(String[] args) {
        Dup();
        /*int a[]={1,2,3,4,5,6};
        int count=0;
        int avg=0;
        for(int i=0;i<a.length;i++)
        {
           count+=a[i]; 
        }
        avg=count/a.length;
        System.out.println("The average is:"+avg);
    } */
    public static void Dup()
    {
        int a[]={1,2,1,1,2,3};
        int count=0;
        for(int i=0;i<a.length;i++)
        {
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
 }
 