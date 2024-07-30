
/*     Q&A:
      1.When finally block will not Excecuted?
      2.What is the between final,finally,finalized?    




//EXCEPTION:
      *Dictionary memory of exception is problem.
      *In java Exception is a problem that occurs during Runtime/While executing of a program.
      *When exception occurs program stops unexpectedly.

      //EX:
           statement 1; 
           statement 2;    //Exception occured
           statement 3;      
                                  //Output:
                                        statement 1
                                        Exception Occured
           * The above example exception occured statement 2.so all the statements before statement 2 will executed and 
             all statement after statement 2 will never executed.
           * 
             
1.Arithematic Exception:
       *This Exception getting when programmer trying to divide any number by 0.
       //EX:
           Sys.out.pl("statement 1");
           Sys.out.pl(50%2);     //Arithmetic Exception Occured
           Sys.out.pl("statement 3");

2.ArrayIndexOutOfBoundsException:
          //EX:
            s.o.pl("Statement 1");
            int[] a={5,6,3};
            s.o.pl(a[10]);     //ArrayIndexOutOfBoundException
            s.o.pl("statement 3")

3.StringIndexOutOfBoundsException:
         *This Exception occurs when programmer is trying to access the index which is not present in array. 
        //EX:
            s.o.pl("Statement 1");
            String s="java";
           s.o.pl(s.char(20))     //StringIndexOutOfBoundException
            s.o.pl("statement 3");
            
4.ClassCastException:
      *This Exception occurs when programmer do downcasting without upcasting 
            //EX:
                s.o.pl("statement")
                Exception e=(Exception); new object();    //ClassCastException
                s.o.pl("statement 3");

5.NullPointerException:            
        *we get this Exception when programmer tries to access somethhing null reference.
         //EX:
           s.o.pl("Statement 1");
            String s="java";
           s.o.pl(s.length)     //NullPointerException
           s=null;
            s.o.pl(s.length());





            *All Exceptions in java are inbuild classes 
            *These Exceptions are of thowable time.
            *In java We can handle the Exception using try- catch block.
        //try:    
            *try-try is a keyword in java.
            *try-try block is used to keep statements resposible for Exception.
            *We cannot use try block alone it must be proceeded by catch block OR finally block.
        //catch:
            *catch is a keyword in java.
            *catch block is used to handle the Exception thrown by try block.
            *We cannot write catch block alone,it must be followed by try block.
         
    //SYntax for try catch:
             try
             {
                //statement whick is responsible for exception
             }
                catch(Exception ref_var)
                {
                    //statement
                 }    
            
Q/A;
    catch block only excecute when?
          *Any exception occured in try block.

 //DIFFERENT CASES IN EXCEPTION HANDLING:
     case 1:
           *When Exception occuerd it is handled by try catch block.
                  //EX:
                       int a=10;
                       int b=0;
                       s.o.pl("statement 1")
                       try
                       {
                        int c=a/b;              //Exception is occured
                       }
                       catch(ArithmeticException e)
                       {
                        System.out.println("Exception handled");
                       }
                       s.o.pl("statement 2")       /* output: 
                                                            statement 1
                                                            Exception handled
                                                            statement 2                
                                                      
           
     case 2:
          When Exception not occured but it is handled by try catch block
                   //EX:
                   int a=10;
                       int b=5;
                       s.o.pl("statement 1")
                       try
                       {
                        int c=a/b;         //here Exception is not occured
                       }
                       catch(ArithmeticException e)
                       {
                        System.out.println("Exception handled");
                       }
                       s.o.pl("statement 2")       /* output: 
                                                            statement 1
                                                            statement 2

    case 3:
         *When Exception occured and it is handled by try catch block but the Exception is not handled.
               //Ex:
                int a=10;
                       int b=0;
                       s.o.pl("statement 1")
                       try
                       {
                        int c=a/b;              //Exception has not occured
                       }
                       catch(ArithmeticException e)
                       {
                        System.out.println("Exception handled");
                       }
                       s.o.pl("statement 2")       /* output: 
                                                            ArithmeticException Error
     case 4:
         *We 

         //EX:
                       int a=10;
                       int b=0;
                       s.o.pl("statement 1")
                       try
                       {
                        int c=a/b;              //Exception has not occured
                       }
                       catch(Exception e)
                       {
                        System.out.println(" Arithmetic Exception handled");
                       }
                       s.o.pl("statement 2")       /* output: 
                                                            statement 1
                                                            Arithematic Exception handled
                                                            statement 2



  //finally:
            *finally is a keyword.
            *finally block always excecute irrespective of exception occured or not occured.  
            *It is used to keep important lines of the code. 
            *finally block can be followed by try block OR catch block.   
            
            //EX:
                       int a=10;
                       int b=0;
                       s.o.pl("statement 1")
                       try
                       {
                        int c=a/b;              //Exception has not occured
                       }
                       catch(StringIndexOutOfBoundsException e)
                       {
                        System.out.println(" Arithmetic Exception handled");
                       }
                       finally
                       {
                        s.o.pl("finally block will always excecute")
                       }
                       s.o.pl("statement 2")       /* output: 
                                                            statement 1
                                                            finally block will always excecute
                                                            statement 2
                
//try with multiple catch:
                 *In try with multiple catch only one catch block will be executed depends on Exception occured.
                 *It always execute from top to bottom order.

      //Syntax:
           try
           {
           }
           catch(Exception 1)
           {
           }
           catch(Exception 2)
           {
           }
           .
           .
           .

  //RLES FOR try with Multiple catch: 
        1.We cannot mention same exception in two catch blocks.
        2.You cannot mention any parent type before sub type.

         //EX:
                       int a=10;
                       int b=0;
                       s.o.pl("statement 1")
                       try
                       {
                        int c=a/b;              //Exception has not occured
                       }
                       catch(StringIndexOutOfBoundsException e)
                       {
                        System.out.println("StringIndexOutOfBoundsOException handled");
                       }
                       catch(ArithmeticException e)
                       {
                        s.o.pl("ArithmeticException handled")
                       }
                       s.o.pl("statement 2")       /* output: 
                                                            statement 1
                                                            Arithmetic Exception handled
                                                            statement 2


//DIFFERENT SCENARIOS OF try catch BLOCK:
       1.try
       {                         //its not possible
       }

      2.catch
      {
                                   //It is not possible 
      } 

      3.try
      {
      }
      catch()                     //It is possible 
      {
      }

      4.try{}
         finally{}                  //It is possible
      
     5.catch{}
         finally{}                    //It is possible    

      6.finally{}
        try{}                         //It is not possible
        
      7.try{}
        pl("Not possible");
        catch()
        {                                  //It is not possible
        }  

      8.try{}
        catch(){}
        finally{}                            //It is not possible 
        catch{}

      9.try{}
        catch{}                            //It is possible  //because compilor understand first 2 lines are different another 2 are different  
        try{}
        finally{}


                 
        *Ther are two types of Exception
              1.Unchecked Exception
              2.Checked Exception
 
    //1.Unchecked Exception:
             *Compilor unawared Exceptions are known as unchecked Exceptions.
             *here compilor does not know about the exception statements.
             *These UExceptions are checked at runtime by JVM.so compilor doesnot forces programmer to handle OR declare the Exception.
                EX:
                  arithmetic Exception
                  clascast exception
      
    //Checked Exception:
             *Compilor aware exception are known as checked exception.
             *These exceptions statements are checked at compile time only
             *So, compilor forces the programmer to handle OR declare the exception.  
                 EX:
                    Interrupted  Exception
                    FileNotFound Exception  

                    
  //Throws:                  
         * throws is a keyword.
         * It should be used method declaration only.
         * Throws keyword helps to prpogate the exception from one method to another method.
         
         //Syntax: for throws
                     
                   access-modifier modifier returnType methodName(formal arguments)throws Exception1,Exception2,....


//EXCEPTION PROPOGATION:
           *If one Exception propogates from one method to another method and that method propogates throws another method is known as exception propogation.
           *Exception propogetion is only possible with the helo of throws keyword.
      EX:
        public static void m1() throws interruptedException
        {
          thread.sleep(2000);
        }
        public static void m2() throws interruptedException
        {
          m1();
        }
        public static void m3() throws interruptedException
        {
          m2
        }
        public static void main(String args[])
        {
          s.o.pl("statement 1");
        }
        try
        {
        }
        catch(InterruptedException e)
        {
          s.o.pl("InterruptedException handled")
        }
        s.o.pl("statement 2");
      }
        
              Here Exception occured m1() method and 
              *In m2() method Exception is not handled so it propogates to m3() method.
              *In m3() metod also Exception is not handled so again Exception propogates to main method where Exception is 
                 handled with the help of try catch block. 
              *Exception can be handled in any of the method.

//throw:
      *throw is a keyword.
      *throw keyword is used to generate Exception Explicitly.
      *It must be used inside of the method.
      *It should be the last statement.

  //Syntax: for throw
            throw new ExceptionName()    
         
         EX:
            public static void main(String args[]) 
            {
              try
              {
                throw new interruptedException();
              }
              catch(InterruptedException e)
              {
                s.o.pl("EXception handled");
              }
            }
     
 */
public class Exception {
  public static void Check(int num)throws InterruptedException,ArithmeticException
  {
    if(num<=20)
    {
      throw new InterruptedException();

    }
    else
    {
      throw new ArithmeticException();
    }
  }
    public static void main(String[] args) {
      int num;
      Exception ex=new Exception();
      try
      {
        ex.Check(10);
      }
      catch(InterruptedException e)
      {
        System.out.println("InterrptedException handled");
      }
      catch(ArithmeticException e)
      {
        System.out.println("ArithmeticException handled");
      }                                                                      //output:   InterruptedException handled
    }
}

