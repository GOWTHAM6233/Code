/*CONSTUCTOR:
           *Constructor is a special member of a class which have same name as of class name.
           *It is similar to method.
           *Constructor dont have any return type.
           *Constructor dont have modifiers.
           *It may have access specifier.
           *Constructors used to initialize non static variable of a class 

     * //Syntax For constructor:
                [access modifier]   class name(formal aruments)
                {
                    //statements
                }
    
            
          * Constructor will be called at the time of object creation.  
          *Compilor always add a default constructor if programmer has not created any constructor.
          *default constructor is always empty.
          *There are two types of constructors.
                1.Non parameterized
                2.parameterized

    //1.Non parameterized:
                *A constructor which dont have any formal arguments is known as non parametrised constructor .
                           //EX:
                                 public classname()
                                 {
                        
                                  }

    //2.parameterized:                              
                *A constructor which have formal arguments is known as parameterized constructor.
                *Parameterized constructor helps the programmer to accept data to initialize to non static variables.       
                
                           //Syntax for parameterized:
                                class name(datatype var1,datatype var2)
                                {

                                }

//----------------------------------------------------------------------
//CONSTUCTOR OVERLOADING:
                        *Creating multiple constructor with different formal arguments is known as constroctor overloading.


//Rules for constructor overloading:
                          *length of formal argumments can be changed.
                          *positions of arguments can be changed.
                          *Same constructor with same datatype is not allowd.
                  
                //Ex:
                    class sample 
                    {
                        sample()
                        {
                        }
                        sample (int x)
                        {

                         }
                         sample(int x,String y)
                         {
                              
                         }
                        
                    }     
 //CONSTRUCTOR CHAINING:                   
          *A constructor calling to another constructor is known as constructor chaining.
          *Constructor chaining is possible with two ways.
                  1.this() call statement.
                  2.super() call statement.


    //STATIC MEMBERS:
                   *Any member which is prefixed with static keyword is known as static member of a class.
                   *Static member includes static variablle and static method.
                   
    //STATIC VARIABLE:
                  *Any variable which is decalred outside of the method but inside of the class and prefixed with statc keyword
                   is known as static varable.
                  *Static variables are loaded with default values initially at class loading process.
                  *Static variables will get store inside class block which is present inside class static area.
                  *We can call static variables with the help of class name and object reference also.
                  *Any changes done to static variables it impact to hole class.                   


//THIS KEYWORD:
     *This keyword is used to differentiate between local variable and non static variable 
     *This keyword holds the reference of current object.
     *This keyword is not allow inside static method.

              //Rules for this() call statement :
                    1.It should be the first statement.
                    2.If there are n constructors then we can write this() call statement n-1 time only.
                    3.this() call statement is not allowed inside method.
                    4.It is explicit type(only programmer will add).
                    5.Recursive call of cunstructor is not allowed by this() call method.


               /     
 */
import java.util.*;
public class const {
      String name;
      int price;
      String Model;
      public const(int phone,String name)
      {
       
      }
      public static void main(String[] args) {
            const d1=new const();
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the price: ")
            d1.name=sc.nextInt();

      }
    
}
