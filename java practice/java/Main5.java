import java.util.*;
public class Main5 {
    public static void main(String[] args) {
        int a[]={12,7,50,6,30};//6 7 12 30 50
        int temp=0;
        for ( int i=0;i<a.length;i++)
        {
            for ( int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
