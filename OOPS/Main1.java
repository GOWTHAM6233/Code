/*
//POLYMORPHISM:

        poly - many
        morphism-forms
        *polymorphism is an ability of an object showing different behaviour and different stages of its life cycle.
        *In java we achieve polymorphism with methods.which means method showing diffrent behaviour.
        *There are two polymorphism in java.
                 1.compiletime polymorphism 
                 2.Runtime polymorphism

//COMPILE TIME POLYMORPHISM:
        *When method declaration and method body or implimentation gets bit together at compile time is known as
        compile time polymorphism.
        *It is also known as static binding or early binding.
        *In compile time polymorphism rebinding is not possible.
        *Compile time polymorphism can be achieved with constructor overloading method overloading.

  //METHOD OVERLOADING:
        *Creating multiple methods with same name but different formal arguments is known as method overloading.

     //RULES FOR METHOD OVERLOADING:
                *Length of formal argumments can be changed.
                *Positions of arguments can be changed.
                *Same method with same datatype is not allowd.
                  

*/
//------------------------------------------------------------------------------------------------------
/* 
import java.util.*;
public class Main1 {
      public static void test()
       {
            System.out.println("Test with no arguments:");
            
      }
   public static void tets(float x)
   {
System.out.println("test float argument");
   } 
   public static void test(int x,float y)
   {
System.out.println("test with int, float argument");
   }
public static void test(float x,int y)
{
      System.out.println("test with float,int x");
}
    
}
class main{
      public static void main(String[] args) 
      {
            
      }
}


 */
//-----------------------------------------------------------------------------------------------------------------------------
/*
//RUNTIME POLYMORPHISM:
           *When method declarartion and method body implementation gets bind together at reun time is known run time polymorphism.
           *It is also known as dynamic binding or late binding.
           *Re-binding is possible.
           *We can achieve runtime polymorphism with method overriding.


//Method Overrinding:
          *Any non-static method having same signatuere in parent class as well as in sub class also is known as method overriding.
          *Method overriding is only applicable for non-static methods.

//RULES: method overriding
      *Method signature must be same.
      *Return type also should be same.
      *Access specifier can be same or can be of higher visibility(It can be increase but cannot be decreased).
     
 //NOTE:
       *We denote method overriding with annotation as at the rate "@Override".
       


//QUESTION AND ANSWER:
   //1. Why do we need overriding?     
         when programmer wants to provide new implementation for a method then we go for method overriding.

   //2.Method execution depends on what?
        In runtime polymorphism method execution always depends on type of object created.




//ORDER OF VISIBILITY OF ACCESS SPECIFIER:
                               ------(*Chech note)--
            
 */


//-------------------------------------------------------------------------------------------------------


 /*
 //FINAL MODIFIER:
         *Final is a keyword.final modifier is a applicable for variable,classes and methods.


    //FINAL VARIABLE:
        *A variable which is prefixed with final modifiers is known as final variable 
        *final variable cannot be reinitialized.
        *It behaves like a constant variable.

        //EX:
            class A
            {
            }
                  class Main
                  {
                    public static void main(String args[])
                    {
                        A a=new A();
                        System.out.println(a.x);
                        a.x=30;        //CTE
                    }
                  }



       //Final method:
              *Any method prefixed with final modifier is known as final method. 
              *final cannot be overridden 
              *final methods are inherited to child class.   
              
            //EX:  
                 *(check notes)*
            

      //final class:
              *The classes prefixed with final meodifier is known as final classes.
              *final classes cannot be inhrited.//(EX:String is also a inbuild final class) 

             
              //EX:
              Wrapper classes also a final class we cannot inherit it to another class

                 class A extends String      //it will through compile time error
                 {

                 }
              
  */




                                         /*
//ABSTRACTION:
         *Abstrsct means incomplete method
         *The process of hiding the implementation and showing only the functionality is known as abstraction.
         *We can achieve abststraction with the help of abstract classes and interfaces.
         

     //Abstract:
     *Abstract is a keyword in java.
     *Dictionary meaning of abstract is incomplete.
     *Abstract keyword is applicable with methods and classes.

     //ABSTRACT CLASSES:
         *classes declared with abstract keyword is known as abstract classes.

         //EX:
            abstact class Demo
            {

            }



//CONCRETE CLASESS:
          *A class which is not declared with abstract keyword is known as concrete classes.
          *In simple words normal classes in java is known as concrete classes
          //EX:
              class Demo
              {

              }
    
               
    //ABSTRACT METHOD:
            *A method which is prefixed with abstract keyword is known as abstract method.
            *Abstract methods doesnot have implementation and they always ends with semicolon.


     //Syntax:
      abstract [access-Specifier] [modifier] return-type methodName(formal arguments);



 //CONCRETE METHODS:
         *Method is not prefixed abstract is known as concrete method.
         *In simple words normal methods are in java is concrete methods.
         *COncrete methods have implementation and doesnot end with semicolon. 
//-------------------------------------------------------------------------------------------------------------------------------------------
//Different absorvation in abstract classes:    
      1.If any abstract method is present in a class it is mandatory to make class also as abstract.
           //EX:
               abstrct class sapmple
               {
                  abstract void main();
               }
               class sapleDriver
               {
                  p.s.v.main(String args[])
                  {

                  }
               }


      2.We can keep any number of abstract mthod in a class.
            //EX:
            abstract class sample
            {
                  abstract void m1();
                  abstract void m2();

            }
            class sampleDriver 
            {
                  p.s.v.main(String args[])
                  {

                  }
            }
      3.We can keep any number of concrete methods also in abstract classes.
            //EX:
             abstract class sample
            {
                  abstract void m1();
                  abstract void m1();

            }
                  abstract void m1();
                  {

                  }
                  abstract void m1();

            }
            }

      4.Abstract classes cannot be instantiated(object creation is not possible).
            //EX:
              abstract class sample
            {
                  abstract void m1();
                  abstract void m2();

            }
            class sampleDriver 
            {
                  p.s.v.main(String args[])
                  {
                   Sample s-new Sample()             //CTE(compile time error)
                  }
            }

      5.If there is no abstract method then also we can keep class as abstract.
            //EX:      

      6. restrict the object creation of a class we go for abstract classes if there is no abstract methods also.

      7.To privide the implementation for abstract method we should create child class and should override the method.

      8.If sub class is not responsible to give implementation for one of the abstract method then it is mandator 
         to make child class also abstract.

      9.If sub class is not responsible to give implementation for abstract method then next level of sub class is respponsible
         to provide the implementation for left out abstract methods.   
      
      10.We can create references for abstract classes.   


//QA:
Constructor are allowed inside abstract classes?
          *It is allowed for constructor chaining purpose
            
      
      
      
      
      
      
      
      
      
      
      */
      //-------------------------------------------------------------------------------------------------------------------------
                                                    /* 
      abstract class Application
      {
            abstract void send();
      }
      class Whatsapp extends Application 
      {
            @Override
            public void send()
            {
                  System.out.println("Sending message in whatsapp");
            }
      }
      class ApplicationDriver
      {
            public static void main(String[] args) {
                  Application w;
                  w=new Whatsapp();
                  w.send();
            }
      }                                           */

//-------------------------------------------------------------------------------------------------------------------------------------      
/* 

      abstract class Shape 
      {
            abstract void area();
            abstract void perimeter();
      }
      class Rectangle extends Shape
      {
        int length;
        int breadth;
        
        Rectangle (int length,int breadth)
        {
            this.length=length;
            this.breadth=breadth;
        }
        @Override 
        public void area()
        {
          System.out.println("Area of Rectangle is:"+(length*breadth));
        }
        @Override 
        public void perimeter()
        {
          System.out.println("perimeter of Rectangle is:"+(2*(length*breadth)));
        }

      }
      class Circle extends Shape
      {
            float radius;
            Circle (float radius)
            {
                  this.radius=radius;
            }
            @Override
            public void area ()
            {
                  System.out.println("The area of Circle :"+(3.14f*radius*radius));
            }
            @Override
            public void perimeter()
            {
             System.out.println("The perimeter of circle :"+(3.14f*radius));
            }
      }
      class ShapeMain
      {
            public static void main(String[] args) {
                  Shape s;
                  s=new Rectangle(20,30);
                  s.area();
                  s.perimeter();
                  System.out.println("---------------------------------------------");
                  s=new Circle(3.4f);
                  s.area();
                  s.perimeter();

            }
      }
       */



abstract class Bank
{
      abstract void withdraw();

      


}







