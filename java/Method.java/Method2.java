/* 
    1. write a program to calculate area of trangle.(1/2*base*high)
    2.write a program to calculate area of circle (pi r square h)
    3.TO find area of square.
    4.Find the area of Rectangle.(2*l+b)
    5.write a program to calculate volume of a cylinder. 

 

----------------------------------------------------------------------------------------------------------------------------------*/
/*                                    // 1.

public class Main2 {
    public static void main(String[] args) {
        double base=10;
        double height=7;
        areaoftriangle(base,height);
        
    }
    public static void areaoftriangle(double base,double height){
        double area=(0.5*base*height);
        System.out.println("The area of traingle is "+area);
    }
    
}                          
                          
----------------------------------------------------------------------------------------------------------------   */                       
                                 //   2.
 import java.util.*;
 public class Method2{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of r :");
    double r=sc.nextDouble();
    m1(r);

    
    
 }
 public static void m1(double r)
 {
    double rev=(3.14)*(r*r);
    System.out.println("The Area of the circle is: "+rev);

 }
    
 }

//------------------------------------------------------------------------------------------------------------------------  */

/*                                         // 3. 

import java.util.*;
public class Method2
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of a :");
   double a=sc.nextDouble();
   area(a);

}
public static void area(double a)
{
    double area=a*a;
    System.out.println("The area of square is: "+area);
}
}

----------------------------------------------------------------------------------------------------------------------------------*/

                /*                           // 4.
import java.util.*;
public class Main2
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of l :");
   double l=sc.nextDouble();

   System.out.println("Enter the value of b :");
   double b=sc.nextDouble();

   m2(l,b);
}
public static void m2(double l,double b)
{
    double area=l*b;
    System.out.println("The area of the rectangle is: "+area);
}
}                        

-----------------------------------------------------------------------------------------------------------------------------------
            */                              //5.                    

/*import java.util.*;
 public class Main2{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of r :");
    double r=sc.nextDouble();

    System.out.println("Enter the value of h :");
    double h=sc.nextDouble();

    m1(r,h);

    
    
 }
 public static void m1(double r,double h)
 {
    double volumeofcylinder=(3.14)*(r*r)*h;
    System.out.println("The volume of the cylinder is: "+volumeofcylinder);
 }
    
 }
              */