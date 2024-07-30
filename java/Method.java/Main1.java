/*METHODS:
      *methods are the bloock of statements which is used to perform some spesific task.
       
method syntax:
               
        (access specifiers 
                  or           [modifiers]      return type        method name(formal arguments)
          access modifiers)                                      |______________________________|    
                                                                        method signature
       |___________________________________________________________________________________________| 
                                     method declaration
        {
          
          //method block
       
        }
 

        
       // access modifiers:
       1.public                  
       2.protected           
       3.default                
       4.private                 

       1.Method signature:
          *method signature includes method name and formal arguments.
      2.Method declaration:
      3.method defenition: 
           it includes method declaration  and method block (or) body


        //Access specifiers:
           *access specifieres used to change the visibility and or access ability of a member  or block.
         access modifiers types:
            1.public                  
            2.protected            
            3.default                
            4.private 

     

      // MODIFIERS:
         *it is uded to modify the charasteristics of the member.
        we have different types of modifiers:
          1.static 
          2.final 
          3.abstract 
          4.Transient
            

      // CALLING METHOD:   
        *The method which is trying to call another method is known as calling method.

      //CALLED METHOD:
        *The method which is being called by the caller method is known as called method.   


      //Method call statement:
          * The method  which is used to call the statement  is known as method call statement.


          *A method will be executed only when it is called .
          *we can call the method with the help of method call statement.
          *we can call the method n number of times.
          *Method inside a method is not possible.


     // METHOD CALL STATEMENT FLOW:
        1.Execution always starts from main method.AS any method call statement occurs execution of calling method is paused.
        2.Controll is transfered  to the called method.
        3.execution of called method begins .
        4.once execution of called method is compeleted the controll is transfered back to the calling method.
        5.Execution of resumes.
        
        
     //MAIN METHOD:
          * The execution of java program will always starts at main method and ends with also this main method.    


     //Syntax of main method:
                  
                      public static void main(String args[]) 
                      {
                        //statements 
                      }     


         *A method when we only exexcuted when it is called.    
         
         

        // Types of method:
              Based on number of arguments methods are classified into two types :
                 1.No arument method//Non paramaterised
                 2.Yes arument method//paramaterised
        
        //1.No arument method//Non paramaterised:
                   *The method whis does not have formal argument is known as Noarument method (Or)Non paramaterised.     


                 Ex:
                 public static void demo()--------->no aruments inside the bracket.
                 {                       

                 }  
                   
        //2.Yes arument method//paramaterised :    
               *The method which have formal arguments is known as Yes arument method (or) paramaterised.

                   //syntax for paramaterised method:  
                              methodName(datatype var1, datatype var2,datatype var3,...)
                              {

                               } 


           //RULES to call parameterised method:
                 1.The no.of actual argument is same as of no.of formal arguments.  
                 2.We should pass the actual argument in the same sequence  as formal arguments declared.                  



          //FORMAL ARGUMENT :
               *The variables declared in method declarartion is known as formal arguments.  
             
               
               
          //ACTUAL ARGUMENTS:
               The value is passed in method call statement is known as actual arguments.

 */










public class Main1 {
  
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("Program starts");
        a();
        b();
        c();
        d();
        System.out.println("program ends:");
    }
    public static void a() 
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(+c);
        
    }
    public static void b() 
    {
        int a=10;
        int b=20;
        int d=b-a;
        System.out.println(d);
        
    }
    public static void c() 
    {
        int a=10;
        int b=20;
        int e=a*b;
        System.out.println(e);
        
    }
    public static void d() 
    {
        int a=10;
        int b=20;
        int f=a/b;
        System.out.println(f);
        
    }

}
