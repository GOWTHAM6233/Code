                     /* 
//The program for Factorial of a given  number :

import java.util.Scanner;
class Method6{
    public static long fact(int num){
        long prod = 1;
        for (int i=1;i<=num;i++)
        {
            prod=prod*i;
        }
        return prod;
    }
    public static void main(String arrgs []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the factorial value:");
        int num = sc.nextInt();

        long res=fact(num);

        System.out.println("The factorial of the string is: "+res);


    }

}        */

                                 /* 
//write the program for leap year:
                     


class method6{
public static void main(String args[])
{
    int year=2100;
    if(year%4==0 && (year%400==0 || year%100!=0))
    {
        System.out.println("Its a leap year :");
    }
    else {
     System.out.println("Not a leap year: ");
    }
   
} 

}
                         */

//--------------------------------------------------------------------------------------------------------------------------------

//write a program to find x to the power n(x^n)

                                           /*
public class Method6{
    public static void power(int x,int n) {
        int prod=1;
        for(int i=1;i<=n;i++)
        {
            prod=prod*x;

        }
        System.out.println("The value is: "+prod);
    }
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the x value: ");
        int x=sc.nextInt();
        System.out.println("Enter the N value :");
        int n=sc.nextInt();
        power(x,n);
    }
}



             */
//-----------------------------------------------------------------------------------------------
                                      /*
      //                                
import java.util.*;
public class Method6{
    public static int countNoOfDigits(int num){
        int count=0;
        while(num!=0){
            count++;
             num=num/10;


        }
        return count;

    }
    public static int powerOfNumber(int x,int n){
        int prod=1;
        for(int i=1;i<=n;i++)
        {
          prod=prod*x;
        }
        return prod;

    }
    public static int logic(int num){
        int count=countNoOfDigits(num);
        int sum=0;
        while(num!=0)
        {
            int last =num%10;
           int  pow=powerOfNumber(last,count);
           sum=sum+pow;
           num=num/10;

        }
        return sum;
    }
    public static void main(String args[])
    {

      int num=234;
      int res=logic(num); 
      System.out.println("The result is: "+res);
    }
}                             
          */

//--------------------------------------------------------------------------------------------------------------------------------------

                                               /*
//write a program to check wether the given number is a palindrom.
import java.util.*;
public class Method6{
    public static int reverse (int num){
        int rev=0;
        int temp=num;

        
        while(num!=0){
            int last = num%10;
            rev=(rev*10)+last;
            num = num/10;
        }

        if(rev==temp)
        {
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }

            return rev;
        }
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=sc.nextInt();

    int res=reverse(num);
    }
    }
                                                          */

    //-----------------------------------------------------------------------------------------------------------

    //The program for Fibonaccci series number:


    public class Method6{
        public static void print(int n)
        {
            int n1=0;
            int n2=1;
            System.out.println(n1+""+n2);
        
        for(int i=3;i<=n;i++){
            int n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;

        }
    }
    public static void main(String args[]){
        int n=15;
        print(n);
    }
    }





    
    