/*import java.util.Scanner;
public class Method5 {
    public static void main(String[] args) {
        int prod=1;
        while(num!=0)
        {
            
        }

    }
    
}
*/
 

                                         /* 
//write a program to reverse a number 
import java.util.*;
public class Method5{
    public static int reverse (int num){
        int rev=0;
        
        while(num!=0){
            int last = num%10;
            rev=(rev*10)+last;
            num = num/10;
        }
            return rev;
        }
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to reverse: ");
    int num=sc.nextInt();

    int res=reverse(num);
    System.out.println(res);

    }
    }
           */

            //write a program to check whether the given number is a prime number: 
public class Method5{
    public static void prime(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%1==0)
            count++;
        }
        if(count==2)
    System.out.println("prime number:");
    else 
    System.out.println("Not a prime number:");
    }
    public static void main(String args []){
        int num=13;
        prime(num);
    }
}