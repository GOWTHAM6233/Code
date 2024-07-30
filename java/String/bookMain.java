/* class Const2 {
    String brand;
    double price;
     Const2(String brand,double price)
    {
this.brand=brand;
this.price=price;
    }
public void display()
{
    System.out.println("The brand is: "+brand);
    System.out.println(":The price is: "+price);

}

}
class BikeMain{
public static void main(String[] args) {
    System.out.println("Hello");
    Const2 b1=new Const2("Tvs",2392457d);
    b1.display();
System.err.println("-------------------------------------------------------------------------------");
    Const2 b2=new Const2("BMW",23457393);
    b2.display();

}
    
}
 */
//-------------------------------------------------------------------------------------------------------------------------------

                            /* 
class book
{
    String name;
    int id;
    String author;

    book()
    {

    }
   book(String name)
    {
        this.name=name;
    }
    book(String name,int id)
    {
        this.name=name;
        this.id=id;

    }
    book(String name,int id,String author)
    {
        this.name=name;
        this.id=id;
        this.author=author;
    }
    public void display()
    {
        System.out.println("The Book name is: "+name);
        System.out.println("The book id is: "+id);
        System.out.println("The author is: "+author);

        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
public class bookMain
{
public static void main(String args[])
{
book d1=new book();
d1.display();

book d2=new book("Rich dad poor dad");
d2.display();

book d3=new book("Rich dad poor dad",23);
d3.display();

book d4=new book("Rich dad poor dad",23,"jamesclear");
d4.display();

}
}
                                                          */
//--------------------------------------------------------------------------------------------------------------------------------
                                  /*      
class book
{
    String name;
    int id;
    String author;

    book()
    {

    }
   book(String name)
    {
        this.name=name;
    }
    book(String name,int id)
    {
        this(name);
        this.id=id;

    }
    book(String name,int id,String author)
    {
        this(name,id);
        this.author=author;
    }
    public void display()
    {
        System.out.println("The Book name is: "+name);
        System.out.println("The book id is: "+id);
        System.out.println("The author is: "+author);

        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
public class bookMain
{
public static void main(String args[])
{
book d1=new book();
d1.display();

book d2=new book("Rich dad poor dad");
d2.display();

book d3=new book("Rich dad poor dad",23);
d3.display();

book d4=new book("Rich dad poor dad",23,"jamesclear");
d4.display();

}
}
                                                 */
import java.util.*;
class Faculty
{
    String name;
    String dep;
    String sub;
    double salary;
    Faculty()
    {

    }
    Faculty(String name)
    {
        this.name=name;
    }
    Faculty(String name,String dep)
    {
       this(name);
       this.dep=dep;

    }
    Faculty(String name,String dep,double salary)
    {
        this(name,dep);
        this.salary=salary;

    }
    Faculty(String name,String dep,double salary,String sub)
    {
         this(name,dep,salary);
         this.sub=sub;
    }
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name: ");
        name=sc.next();
        System.out.println("Enter the Department: ");
        dep=sc.next();
        System.out.println("Enter the subject: ");
        sub=sc.next();
        System.out.println("Enter the salary: ");
        salary=sc.nextDouble();

        System.out.println("The Faculty name is: "+name);
        System.out.println("The department is: "+dep);
        System.out.println("The subject is: "+sub);
        System.out.println("The salary of Faculty is: "+salary);

        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
class FacultyMain
{
    public static void main(String[] args) {
        
        Faculty d1=new Faculty();
d1.display();

Faculty d2=new Faculty("Ragu");
d2.display();

Faculty d3=new Faculty("Amal","EEE");
d3.display();

Faculty d4=new Faculty("Bala","MECH",1211344d);
d4.display();

Faculty d5=new Faculty("ARUN","CSE",1256744d,"TAMIL");
d5.display();

        
    }
}
