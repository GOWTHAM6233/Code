/* package com.collection_framework;                                                    
import java.util.ArrayList;

public class practice{
public static void main(String args[])
{
  ArrayList a1=new ArrayList();

  a1.add("laptop");
  a1.add("silver");
  a1.add("machan");
  a1.add(30);
  a1.add(48);
  a1.add(20.03f);


  //to iterate using normal for loop
  for(int i=0;i<=a1.size()-1;i++)
  {
    if(a1.get(i) instanceof Integer)
    System.out.println(a1.get(i));
  }
}
}
 */


//Write a program to print even numbers from a non genaric ArrayList class
package com.collection_framework;                                                    
import java.util.ArrayList;

public class practice{
public static void main(String args[])
{
  ArrayList a1=new ArrayList();

  a1.add("laptop");
  a1.add("silver");
  a1.add("machan");
  a1.add(30);
  a1.add(48);
  a1.add(20.03f);


  //to iterate using normal for loop
  for(int i=0;i<=a1.size()-1;i++)
  {
   
    Object o= a1.get(i);
    if(a1.get(i) instanceof Integer)
    {
      Integer x=(Integer) o;           //Downcasting
    if(x%2 == 0)
    {
System.out.println("Even number");
    }
    else
    {
System.out.println("odd number");
    }
    System.out.println(a1.get(i));
{

}
    
  }
}
}
}

//write a program to store multiple values in ArrayList and perform the below operations
//Print only String objects which starts from a,
//Print only String objects which ends with s.
//Print only integer objects from 10-50.