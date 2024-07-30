//REVERSING AN ARRAY:
/* 
import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length/2;i++)
        {
            int temp=0;
            temp=a[i];
            a[i]=a[(a.length-1)-i];
            a[(a.length-1)-i]=temp;
        }
        System.out.println(Arrays.toString(a));
        
    }
}
     */

//--------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class Main4 
{

    public static void main(String[] args)
     {
      /*  int a[]={1,2,3,0,67,65};
        int max1=a[0];
        int max2=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max1<a[i])
            {
                max2=max1;
                max1=a[i];
            }
            else if(max2<a[i])
            {
                max2=a[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);*/
        int nums[]={1,1,2};
        int j = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(j);
}}

