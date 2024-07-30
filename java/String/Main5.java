

/*LOCAL VARIABLES:
                *Local variables are variables which are declared inside a block.(It can be method block, constructor block  OR any other block) 




    //Charasteristic of local variable:  
                    *Local variable are not stored with default values.
                    *Local variables must be initialize before using it.
                    *Scope of local variable is only to the specific block.

//NON-STATIC MEMBERS:
                       *Any member of a class which is not prefixed with static keyword it is known as non static member of a class.
                       *Members include non static variable and non static method.     
                       *Non static member belongs to an instance of a class(object). Hence it also known as instance member of a class.
                       *The memory for non static member is allocated inside heap area.
                       *We can create any number of instances of a class.
       
                       

      //NON STATTIC MEMBERS:
                    1.Non static variable 
                    2.non static number    
                    
       //1.Non static variable:
                        *A variable declare inside of a class but outside of method block OR cunstructor 
                          block and not prefixed with static keyword is known as non static variable.

         //1Charasterstic variable:
                         *We cannot use non static variable without creating a object.
                         *we can only use non static variable with the help of reference variable.
                         *Non static variable assigned are with default values.
                         *Multiple copies of non static variables will be created(Once for every object).
                                        
                       
    //NON STATIC METHOD:
                 *Any method which is not prefixed with static keyword is known as non static method.
    
        //charasteristics of non-static method:
                   *We cannot call non static method without creating an object.
                   *Memory for non static method is stored inside heap area.
          
                   
//OBJECT:
         *Any substance which have existance in real world is known as object.
         *In java object is a memory created inside heap area.
         *Every object is having states and behaviour.Where states represent the information of an object and behaviour
           represent the actions performed by an object.                


//CLASS:
        *Class represents the blue print of an object.
        *It is a user defined non primitive datatype.
        *Steps to create object.
      Strep 1:create a new class OR use existing class if already created.
      Step 2:Instantitation(the process of creating an object is known as instantitation).

      //Syntax to create object:
      ClassName var_name=new className();


      *Before creating an object blue print must to be defined.
      *Every class name in java is known as non-primitive data type.

            //EX:
                class pen
                {
                    String brand;
                    double price;
                    public static void main(String args[])
                {
                    pen p1=new pen();
                    System.out.println(p1);   //0X1(object reference)
                }
                }


    //  OBJECT LOADING PROCESS:
                    Step 1:New keyword creates an object inside in heap area          
                    Step 2:Constructor loads all  static member of class inside object.
                    Step 3: Non static variable are stored with default valu 
                    Step 4:Here object loading process is completed.
                    Step 5:Now new keyword returns the reference back to reference variable. \

                    //EX:
                    class Demo
                    {
                        int a;
                        String b;
                        public void sample()                        //output:
                                                                           0 null                                            
                        {                                                  
                          System.out.println(a+" "+b);
                        }
                    }

        
        

    */
                                             /*

    public class Main2 {
        
          String name;
          String color;
          int price;
          int speed;
            public void car()
            {
                System.out.println("the car:");
            }
        
        public static void main(String args[])
        {
            Main2 s=new Main2();
            s.name="Rolls Roys";
            s.color="Blue";
            s.speed=100;
            s.price=20000000;
            System.out.println(s.name);   
             System.out.println(s.color);
             System.out.println(s.price);
             System.out.println(s.speed);
             
            
        }
    }
    
                                         */
/* 
                                         import java.util.Scanner;

                                         class employee{
                                             String name;
                                             int age;
                                             char gender;
                                             double salary;
                                         
                                             public void insertdetails()
                                             {
                                                 System.out.println("--------------------------");
                                                 Scanner sc=new Scanner(System.in);
                                                 System.out.println("Enter the employee Name : ");
                                                 name= sc.next();
                                                 System.out.println("Enter the employee Age : ");
                                                 age= sc.nextInt();
                                                 System.out.println("Enter the employee Gender : ");
                                                 gender=sc.next().charAt(0);                                 
                                                 System.out.println("Enter the employee Salary : ");
                                                 salary= sc.nextDouble();
                                         
                                             }
                                             public void employeedetails() {
                                                 System.out.println("-------------------------------");
                                                 System.out.println("Name is : "+name);
                                                 System.out.println("Age is : "+age);
                                                 System.out.println("Gender is : "+gender);
                                                 System.out.println("Salary is : "+salary);
                                         
                                             }
                                         
                                                 //IT COMPILE ON FIENAME (Main3 class) IN NEXT FILE. 
                                         }

 


                                           */
/* 

import java.util.*;
public class student
{
    String name;
    int rollno;
    char gender;
    long phone; 
    String address;
    public void Student()
    {
     System.out.println("Student of Mahendra College");
    }
    public void insertdetails()
    {
    
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Student name:");
    name=sc.next();
    System.out.println("Enter the Student Roll number:");
    rollno=sc.nextInt();
    System.out.println("Enter the Student gender:");
    gender=sc.next().charAt(0);
    System.out.println("Enter the Student Phone:");
    phone=sc.nextLong();
    System.out.println("Enter the Student address:");
    address=sc.next();
    System.out.println("-------------------------------------------------------------------------------------------------");
    

    }
    public void studentdetails()
    {
        System.out.println("The student name is: "+name);
        System.out.println("");
        System.out.println("The student Roll number is: "+rollno);
        System.out.println("");
        System.out.println("The Student Gender is: "+gender);
        System.out.println("");
        System.out.println("The student phone is: "+phone);
        System.out.println("");
        System.out.println("The student Address is: "+address);

        System.out.println("----------------------------------------------------------------------------------------------");
     
    }
    public static void main(String[] args) {
       
       
       
       
        student s1=new student();
        s1.insertdetails();
        student s2=new student();
        s2.insertdetails();
        student s3=new student();
        s3.insertdetails();

        s1.studentdetails();
        s3.studentdetails();
        s3.studentdetails();
    }
}



 */
/*
//THIS KEYWORD:
     *This keyword is used to differentiate between local variable and non static variable 
     *This keyword holds the reference of current object.
     *This keyword is not allow inside static method.

class object demo
{
    int max=10;
    puclic void demo()
    {
        int max=20;
        s.o.p(max);//20 (local variable)
        s.o.p(this.max);//10 (non static variable)
        s.o.p(this);  // prints reference of current variable(demo)
    }
    public sstatic void main(String args[])
    {
        objectdemo d1=mew objectdemo();  //1st object
        objectdemo d2=new objectdemo();  //2nd object
        s.o.p(d1);   //ox1(address)
        d1.demo();
    }
}

                */                        


public class Main5
{
    int max;
    public void m1(int max)
    {
        this.max=max;
        System.out.println(a);
        System.out.println(max);
        System.out.println(max);

    }
public static void main(String args[])
{
Main5 d1=new Main5();
int a=40;
d1.m1(a);

Main5 d2=new Main5();
d2.m1(100);

Main5 d3=new Main5();
d3.m1(200);

System.out.println(d1.max);
System.out.println(d2.max);
System.out.println(d3.max);
}
}             