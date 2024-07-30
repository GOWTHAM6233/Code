/*Java Runtime memory(JRM):
             *(check note)*






        //Method area:
                *In method area all method instructions are stored with method signature.    

        //Class static area:
                *All class blocks are stored inside this area.

        //Stack area:
                *This is used for execution purpose.
                *Any method which is currently exucuting a frame(memory block)is created.
                
        //Heap area:
                *All non static member of a class is stored inside of this area.        



//CLASS LOADING PROCESS:
     Step 1: Initially class block is created inside class static area.
     step 2: All methods of a class are stored inside method area.
     step 3: If any static member is present in a class that will get store inside class static area.For static variables 
              initially it will load with default value.
     step 4: Here class loading process is completed,now JVM calls main method of initially loaded class.A frame is created 
              inside stack area with uinitial name "frame0" and instructions gets copied from method area.
     step 5: Now execution begins with top to bottom order,Once method execution is completed frame is removed from stack area 
              and hole memory gets destriyed.

          
//Static method:
          *Any method wich is prefixed with static keyword is known as static method.
          *Static method can be called with the help of class name or reference variable.
          *Static methods are stored inside class static area.
          
          

 //DIFFERENCE BETWEEN STATIC AND NON_STATIC:
 
            STATIC  
                                                                                        NON_STATIC
1.  Static members are prefixed with static keyword.                 Non static member are non prefixed with static keyword.

2. Static members stores inside class static area.                   Non static are stored inside heap area.

3. Any changes done to static members it will impact                 Any changes done to static members it will impact         
    will happend hole class.                                             will happend only in specific object .

4. static members are having only one copy.                           Non-static members having multiple copies based on 
                                                                        object creation

5. static members can be acess with the help of class
    name and reference variable                                      Non static members can be access only by reference variable.

6. static mebers are loaded at class loaded process                  non-static mebers are loaded at object loading process

//-------------------------------------------------------------------------------------------------------------------------------------
//STATIC CONTEXT:
              *Any block which belongs to static method is known as static context.
              *In static context we can refer static members directly.
              *Inside static context we cannot refer non staticmembers directly.
              *Inside static context we can refer non static members only by creating object.
              *this keyword is not allowed inside static context.


//NON-STATIC:
             *Any block belongs to non static method is known as non static context.
             *In non static context both static and non static member we can refer directly.
             *this() keyword is allowed inside non static context.
                           



//DEFENITION OF RECURSION:
                  *A method calls to itself is known as recursion.
                  *We can perform recursion by keeping the condition so that the recursion  has to stop at specific time.
                  *If we dont provide condition then we get runtime exception as stack overflow exception.



*/
public class java {
    
}
