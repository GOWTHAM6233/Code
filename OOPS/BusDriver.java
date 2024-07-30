/* //ENCAPSULATION:
               *The process of rapping data members and function members together in a class is known as encapsulation.
               *We can achieve encapsulation with the help of class as class have both data member and function member.

  //DATA HIDING:
           *The process of restricting the direct access of data member and providing the indirect access through getters and setters is 
            known as data hiding.
           *Data hiding helps to verify and validate the data before modifying it.

      //Ex: without encapsulation :
               


  //STEPS TO ACHIEVE DATA HIDING:
          step 1: create a or use existing class.
          step 2: prefixed data member of a class as private access specifier
          step 3: Design getters and setters.



    //PRIVATE ACCESS SPECIFIER:
                     * It is accass level acces specifier.
                     * When any member of a class is prefixed with private access specifier then we can access that member only within 
                        the class.

        //Getters:
               *The getter method is used to fetch the data.
               *Return type of getter method is the type of hidden value.

               *If a data member only readable then create only getters.
               * If a data member only writeable then create only setters.
               *If a data member both readable and writable  then create only getters and setters.
               *The data member is neihther readable nor writable then dont create getters and setters.

        //Setter:
               *The setter method is used to modify the data.
               *Return type of setter method is always void.


               //EX for getter and setter:
                          
                        class encapsulation
                        {
                            private int max;   //hidden member as it is kept as private
                            
                        public int getMax()    //getter method to fetch the value
                          {
                            return max;
                          }
                        public void setMax(int max)  
                            {
                            this.max=max;
                             }
                        }

                        public static void main(String args[])
                        {
                            Encapsulation e=new Encapsulation();
                            System.out.println(e.getMax());         //0
                            e.setMax(30);
                            System.out.println(e.getMax());        //30
                        }

    */

//-------------------------------------------------------------------------------------------------------------------------------


/* 

    class Encapsulation
    {
        private int max;   //hidden member as it is kept as private
        
    public int getMax()    //getter method to fetch the value
      {
        return max;
      }
    public void setMax(int max)  
        {
        this.max=max;
         }
    }
class EncapsulationMain{
    public static void main(String args[])
    {
        Encapsulation e=new Encapsulation();
        System.out.println(e.getMax());         //0
        e.setMax(30);
        System.out.println(e.getMax());        //30
    }
  }



   */
  //-------------------------------------------------------------------------------------------------------------------------------
/* 

   class Book
   {
    private String book_name;
    private int book_id;
    private double book_price;
    public String getBook()
    {
    return book_name;
    }
    public int getBookId()
    {
    return book_id;
    }
    public double getBookPrice()
    {
      return book_price;
    }
    public void setBook(String book_name)
    {
      this.book_name=book_name;
    }
    public void setBookId(int book_id)
    {
      this.book_id=book_id;
    }
    public void setBookPrice(double book_price)
    {
      this.book_price=book_price;
    }
 
 
   }
   class BookMain
   {
    public static void main(String[] args) {
      Book d1=new Book();
      System.out.println("The book name is: "+d1.getBook());
       d1.setBook("Rich dad poor dad");
      
    
      Book d2=new Book();
      System.out.println("The book price is: "+d2.getBookId());
      d2.setBookId(162);
    

      Book d3=new Book();
      System.out.println("The book price is: "+d3.getBookPrice());
      d3.setBookPrice(20000d);
     

      System.out.println("------------------------------------------------------------------------------");
      System.out.println("The book name is: "+d1.getBook());
      System.out.println("The book id is: "+d2.getBookId());
      System.out.println("The book price is: "+d3.getBookPrice());

    
      
    }
   } 
                 */

//-------------------------------------------------------------------------------------------------------------------------------
/* 
class EngineOil
{
  String name="Castrol";
  int model=2005;
}
class Engine
{
  EngineOil eo=new EngineOil();
}
class Car
{
  Engine e=new Engine();
} 
class driver 
{
  public static void main(String args[])
  {
    Car c=new Car();
    System.out.println("The nae is:"+c.e.eo.name);
    System.out.println("The model number is:"+c.e.eo.model);
  }
} */


/*
   //COMPOSITION STEPS:
step 1: create a non dependent class.
step 2: Now create dependent class and place the object of non dependent class inside dependent class.
step 3: Now create the object of dependent class and access the members of non dependent class from dependent class reference variable.


 */



/* 
class Account 
{
  long acc_number=17139535;
double acc_bal=122334D;
}
class Person
{
  Account s1=new Account();
  String name="Raja";
  String address="Mahendra College";
  String status="unmaried";
}
class display
{
  public static void main(String[] args) {
    Person s2=new Person();
    System.out.println("The account number is :"+s2.s1.acc_number);
    System.out.println("The account balance is :"+s2.s1.acc_bal);
    System.out.println("The Person name is :"+s2.name);
    System.out.println("The address is :"+s2.address);
    System.out.println("the status is :"+s2.status);
  }
} */

//---------------------------------------------------------------------------------------------------------------
/* 

//Steps to acieve aggregation: 
step 1: create a non dependent class
step 2: create dependent class and place the reference of non dependent class in dependent class.
step 3: Now create the object of dependent class and call the helper method by passing object of non dependent class.
step 4: Now with the help of reference variable of dependent class call the members of non dependent class.



*/


class Bus
{
  Passenger p;
  public void addPassenger(Passenger p)
  {
    this.p=p;
  }
}

class Passenger{
  String name="Ragul";
}
public class BusDriver
{
  public static void main(String args[])
  {
    Bus b=new Bus();
    b.addPassenger(new Passenger());
    System.out.println(b.p.name);
  }
}