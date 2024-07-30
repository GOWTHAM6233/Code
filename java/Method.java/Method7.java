
//Perfect number program:   //perfect number example:6  the 6 is dividible by 1,2 and 3 also.so 1+2+3=6.so that the 6 is also a perfect number.

/*

public class Method7 {
    public static void perfect()
    for (int i=1;i<=num/2;i++)
    {
        int(num%i==0)
        sum=sum+1
    }
    
}



*/
//-------------------------------------------------------------------------------------------------------------------------------

                                /* 
//write a program to check whether the number is strong number.
public class Method7{
    public static void strong(int num){
        int sum=0;
        int temp=num;
        while(num!=0)
        {
            int last = num%10;
            int prod=1;
            for(int i=1;i<=last;i++)
            {
                prod=prod*i;
            }
            sum=sum+prod;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("Strong number ");
            
            
        }
        else {
            System.out.println("Its not a strong number");
        }
    }
    public static void main(String args[]){
        int num=145;
        strong(num);


    }

}


                                                */ 
//-------------------------------------------------------------------------------------------------------------                                                 


//write a program to find number of digits in a given number 
                /* 

public class Method7{
    public static void count(int num){
        int count=0;
        while(num!=0)
        {
            count++;
            num=num/10;

        }
        System.out.println(count);

    }
    public static void main(String args[]){
        int num=1313244;
        count(num);
    }
}

                             */
//------------------------------------------------------------------------------------------------------------------------


import java.util.*;
public class Method7{
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