public class Interface {
    
}
/*//INTERFACE:
      *Interface is another component in java.
      *It is used to achieve 100% of abstraction.
      *


//SYNTX:
       interface InterfaceName
       {
        interface body;
       }

    //Charasteristics of Interface:
              1.We can achieve 100% abstraction.
              2.Constructors are not allowed in interfaces.
              3.variables are by default public,static and final.
              4.methods are by default public and abstract.
              5.Instantiation of interface is not possible.
              

//INTERNAL ADDITIONS BY THE COMPILOR:
                                   ______                                 
    interface I1                         |                                             interface I1
    {                                    |  THE COMPILOR UNDERSTAND->                  {
        int x=10;                        |------------------------------------------>  public static void x=10;
        void m1();                       |                                             public abstract void m1();
    }                               _____|                                             }



//OBSERVATION:
           1.class is can only implment the interface using implements keyword.
           2.A child class can implement two OR more interfaces at the same time.
           3.A class can implement two OR more interfaces and can inherit one class with the help of extends keyword.
           4.interface cannot inherit OR implement the classes.
           5.A interface can inherit two Or more interfaces with the help of extends keyword.
           6.We can create references for interfaces.(I1a;)


//JAVA EIGHT EDITION:
        *Public static concrete method is allowed.
            //EX:
                 public static void m1()
                 {

                 }

        *Default non static concrete method is allowed.
             //EX:
                  default void m1()
                  {

                  }
        
        *Static method in interface are not inherited to child class.
        *When we compile interface we will get class file only.
       
//--------------------------------------------------------------------------------------------------------------------------------------------------------        
             ABSTRACT                                                            INTERFACE

1.We write abstract keyword for abstract classes                 We write interface keyword in interface classes

2.Constructors are allowed                                       Constructors are not allowed.

3.Non-static varibles are allowed                                Non-static varibles are not allowed.

4.variables and methods are by default default access            variables and methods are by default public access           
   specifier                                                      specifier     
              
6.Blank final variable is allowed                                Blank final variable is not allowed.

7.Multiple inheritance is not possible                           Multiple inheritance are possible

8.We use extends keyword to inherite another class               We use implement keyword to inherite another class to implement an interface.

9.Any type of concrete method allowed in abstract                Only "public static","default" non static concrete methed is allowed(Java Eight version)
  classes.

10.Static methods are inherited abstract class                   Static methods are not inherited.

//---------------------------------------------------------------------------------------------------------------------------------
COMMON between Abstract and Interface:
                  *Instantation is not possible.

 */


