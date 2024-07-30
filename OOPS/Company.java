           /*

//INHERITANCE:

  The process of acquairing all the properties of one class to another class is known as inheritence.
    *We can achieve inheritance with the help of
            1.extends keyword 
            2.implements keyword
    *The class whoes properties gets inherited to another class is known as parent class(super,base,master).
    *The class which acquires the properties from another class is known as child class(sub,derived).  
    
    

    *With the help of class B reference we can access the properties of class A as well as class B.
    *With the help of class A reference we can access only the properties of class A.

     */
//-------------------------------------------------------------------------------------------------------------------------
/* public class A {
    int max=30;
    public void demo()
    {
       System.out.println("demo method in class A");
    }
}
class B extends A  
{
    int min;
    public void sample ()
    {
        System.out.println("sample method in class B");
    }
}
class Main
{
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.max);
        b.demo();
        System.out.println(b.min);
        b.sample();



        System.out.println("-----------------------------------------");
        A a=new A();
        System.out.println(a.max);
        a.demo();
        //a.sample();        //Compile time Error

    }
}
    */                                                                          

//---------------------------------------------------------------------------------------------------------------------------------------------


/*
1.Do all members of a class inherited to child class ? 
        *Except private members and constructors are not inherited rest all other members will get inherit.

2.Why private members are not inherited?
        *As we know accesibility of private member is only within the classs but not
           outside of the class.so thats why private members are not inherited to child class.

3.Why constructors are not inherited? 
          *Constructor are special members of a class which have same as of class name.If constructors inherited in child class then
             child class would contain parent class constructor which against the rule of costructor so. thats why constructors are 
             not inherited.   

*/
//--------------------------------------------------------------------------------------------------------------------------
/*
class Parent
{
   int age=50;
   String name="Ram";
   public void m1()
   {
    System.out.println("--------------------------------");

    System.err.println("The name is: "+name);
    System.out.println("The age is: "+age);
   }
   
}
class Child extends Parent
{
 String name="Bheem";
 public void m2()
 
 {
    System.out.println("The Second name is: "+name);
 }
}
class main{
    public static void main(String[] args) {
        Parent a=new Parent();
        //System.out.println("It extends Parent class");
      


        System.out.println("-----------------------------------------------------------------");
        Child b=new Child();
        b.m2();
        b.m1();
        
    

    }
}
 */
 //--------------------------------------------------------------------------------------------------------------------------

/*
 //SUPER() KEYWORD:
            *Super keyword always refers to the parent class members.
            *It holds the reference of parent class object .
            *It is used to differentiate between child member and parent class member .
            *We cannot write super keyword inside static context.
            *It is only allowed in non static context and constructors.



//SUPER CALL STATEMENT:
       *Super call statement to use to call the costructor of imediate parent from child class constructor.

    //RULES for super class:   
       *Super call statement must be the first statement inside constructor.
       *This super call statement is not allowed method also.
       *It is both implicit as well as explicit.

       *In every constructor no argument super call statement added by the compilor imlicitly.(so recommended to make no 
         argument constructor whenever programmer making parameterized constructor)
       *If this() call statement added by the programmer then super() call statement cannot be added.
       *If there are n constructors we can write super call statement n times.
       *  



  //DIFFERENCE BETWEEN THis() AND super() call STATEMENT:
  
          THIS()CALL STATEMENT                                                SUPER() CALL STATEMENT

1.This call statment is used to call the constructor                   1.This call statment is used to call the constructor                   
 of the same class                                                       of the immediate parent class
  
2.This call statement only implicit type                               2.It is both implicit as well as explicit.

3.Inheritance is not mandatory for this call statement.                3.Inheritance is mandatory for super() call statement.

4.If programmer adding this() call statement                           4.If super() call statement is added explicitly,then this 
then super call statement cannot be added implicitly                      statement cannot be added programmer.
or explicitly

5.this() call statement is  allowed constructor                        5.Super call statement is only allowed inside constructor.

//--------------------------------------------------------------------------------------------------------------------------------
//TYPES OF INHERITANCE:
         *There are 5 types of inheritance.
                  1.single level inheritance
                  2.Multilevel inheritance
                  3.Hierarchical level
                  4.Hybrid inheritance 
                  5.Multiple inheritance 

1.Single level inheritance:
                *When one class acquires the properties of one single parent is known as single level inheritance

2.Multi level inheritance:
         *When one class acquires the properties of super class and that class acquires the properties of another super most 
         classs is known as multilevel inheritance.

3.Hierarchical Inheritance:
          *When two or more child class acquiers the properties of single parent class is known as hierarchical inheritance.

 4.Hybrid Inheritance:
          *Combination of any two or more inheritancr is known as hybrid inheritance.         

 5.Multiple Inheritance:
              *When a child class acquires the properties of two or more parent class is known as multiple inheritance.
              *It is not supported in java with this respect to classes but it is supported with respect to interfaces.          


                  



 */
//-------------------------------------------------------------------------------------------------------------------------------------
/* class College
{
    String col_name;
    String address;
    College()
    {

    }
    College(String col_name,String address)
    {
        this.col_name=col_name;
        this.address=address;
    }

}
class Student extends College
{
    int roll_no;
    String st_name;
    Student(String col_name,String address,String st_name,int roll_no)
    {
        super(col_name,address);
        this.st_name=st_name;
        this.roll_no=roll_no;
    }
    public void display()
    {
        System.out.println("---------------------------------------------------------------------");
    System.out.println("The College is:"+super.col_name);
    System.out.println("The address is:"+super.address);
    System.out.println("The student name is:"+this.st_name);
    System.out.println("The roll number is:"+this.roll_no);


    }


}
class CollegeDriver
{
    public static void main(String[] args) {
        Student s=new Student("Mahendra","Namakkal","Gowtham",2);
        s.display();


    }
}
 */

//-------------------------------------------------------------------------------------------------------------------------------
                            /* 
class Company 
{
    String com_name;
    Company()
    {

    }
    Company(String com_name)
    {
        this.com_name=com_name;
    }

}
class Employee extends Company {
String emp_name;
double salary;
Employee()
{

}
Employee(String com_name,String emp_name,double salary)
{
    super(com_name);
    this.emp_name=emp_name;
    this.salary=salary;

}
}
class SoftwareDeveloper extends Employee
{
float hike;
SoftwareDeveloper()
{

}
public SoftwareDeveloper(String com_name,String emp_name,double salary,float hike)
{
super(com_name,emp_name,salary);
this.hike=hike;
}
public void display()
{
    System.out.println("The company name is:"+com_name);
    System.out.println("The employee name is:"+emp_name);
    System.out.println("The salary is:"+salary);
    System.out.println("The hike is:"+this.hike);
}
}
class Main{
public static void main(String args[])
{
    SoftwareDeveloper d1=new SoftwareDeveloper("google","Raja",123434d,2.0f);
    d1.display();
}
} 

                                       */
class Bike
{
    int cc;
   int model;
   Bike()
   {

   }
   Bike(int cc,int model)
   {
    this.cc=cc;
    this.model=model;
   }

}     
class Tvs extends Bike
{
    String color;
    double price;
    String brand;
    Tvs(int cc,int model,String color,double price,String brand)
    {
super(cc,model);
this.color=color;
this.price=price;
this.brand=brand;
   
}
}  
class Splender extends Tvs
{
String s_color;
double s_price;
String s_brand;
Splender(int cc,int model,String color,double price,String brand,String S_color,double s_price,String s_brand)
{
super(cc,model,color,price,brand);
this.s_color=color;
this.s_price=price;
this.s_brand=brand;
}
public void display()

{
    System.out.println("***********************************************************");
    System.out.println("The cc is:"+cc);
    System.out.println("The model is:"+model);
    System.out.println("The color of TVS is:"+color);
    System.out.println("The price of TVS is"+price);
    System.out.println("The Brand is:"+brand);
    System.out.println("******************************************************88");
    System.out.println("The color of Splender is:"+this.s_color);
    System.out.println("The price of Splender is"+this.s_price);
    System.out.println("The Brand is:"+this.s_brand);
    System.out.println("-----------------------------------------------------");
}

}  
class Main{
    public static void main(String[] args) {
        Splender s1=new Splender(120,2016,"Blue",11344d,"Tvs","Red",343454d,"Splender");
        s1.display();
    }
}                           


/*Why multiple inheritance is not supported in java?
            *There are mainly reasons
                   1.Ambiquity problems(Confusion)
                  *2.Diemand problem/Death of diment*
1.Ambiquity problems:
      *Imagin we have two parent classes A and B and one child class C.Assume a test method is declared in both 
       parent classes,now if we create the object of class C and calls test method compilor gets confused to call 
       test method from which class.This is known as "ambiquity problem".

*2.Diemand problem/Death of diment*:
        *Imagine we have two parent class A and B and one child class C.As we know there is one common parent class(Object class)
           Which shares the properties to all the other classes in java.      
        *Now compilor gets confused to choose which path to reach to object class to inherit the properties from object class to 
        child class C.This is known as "Diemand problem".


 * 
 * 
 */
/* 
 //NON PRIMITIVE TYPE CASTING:
             *The process of converting one non_primitive datat type to another non-primitive datattype is known as 
             non-primitive type casting
             *We can convert one non primitive to another non primitive datatype.If it follows the below condition,0
                           1.Is a relationship.
                           2.Common child
          
                           
   //TYPES OF NON_PRIMITIVE TYPE CASTING:
                 *There are two types of non-primitive type casting
                        1.upcasting
                        2.Downcasting

 1.UpCasting:
          *The process of coverting child class object to parent type reference is known as
          *Upcasting is done by the parents implicitly.
          *Using upcasting reference we can only acess parent class members but not child class members.

    //DisAdvantage of Upcasting:
             *Using upcasted reference we cannot access child class members.to overcome this disadvantage we go for downcasting.
             
             
//2.DOWNCASTING:
               *The process of converting parent class reference through child reference time is known as downcasting.
               *Before doing down casting upcasting is mandatory.
               *Otherwise we get runtime exception called as ClassCastException.
               *Using downcasted reference we can access both child class as well as parent class member.
               *Compilor will never do downcasting implicitly so programmer has to do downcasting explicitly with the 
                help of typecasting operators.
    
      //EX:for downcasting:
          class          

 * 
 */