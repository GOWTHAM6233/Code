/* //LINKEDLIST:
   



//LinkedList class:
       *Linkedlist is a concrete implementing class of list interface.
       *In this all abstract methods of list interface is overridden.
       

//CHARASTERISTIC OF LIST INTERFACE:
        *It allows duplicates.
        *Allowes multiple null values.
        *Insertion order is maintained.
        *Efficiency is better than arrayList.
        *Internally linkedlist uses doubly linkedlist.
    
//CONSTRUCTORS OF LINKEDLIST:
    1.LinkedList():
          *It creates empty linkedlist.

    2.LinnkedList(collection):
           *It is used to convert any collection type to linkedList.

//INBUILD METHODS OF LINKEDLIST:
           
        1.addFirst(E e)
               *This method is used to add object at beginning of the list.
               //EX:
               public static void (String args[])
               {
                LinkedList a1=new LinkedList();
                a1.add("pineapple");
                a1.add(150);
                s.o.pl(a1);

                s.o.pl("---------------------------");
                a1.addFirst("Apple");                 
                s.o.pl(a1);                         //[Apple,pineapple,150]
               }
               
        
        2.remove()   ---------------returntype  is(Object)
                *Retrivs and removes the head(first element) of the list.
                      //EX:
               public static void (String args[])
               {
                LinkedList a1=new LinkedList();
                a1.add("pineapple");
                a1.add(150);
                s.o.pl(a1);

                s.o.pl("---------------------------");
                a1.addFirst("Apple");                 
                s.o.pl(a1);                         //[Apple,pineapple,150]

                s.o.pl("--------------------------------------");
                a1.remove();
                S.o.pl(a1);                       //[pineapple,150]
               }

   
       3.DescendingIterator():
                 *It returns an iterator over the elements in reverse direction.
                 
            */      
//Q/A:
//1.Write a program to add only integer objects in arrayList and convert it into linkedlist and sort the elements in ascending order.

/* 

package com.collection_framework;
import java.util.ArrayList;
import java.util.LinkedList;
public class Linkedlist {
public static void main(String args[])
    {
     ArrayList <Integer>  a=new ArrayList<Integer>();
     a.add(734837);
     a.add(140);
     a.add(27);
     a.add(1224);
     a.add(6336);
     a.add(1);
    LinkedList<Integer> b=new  LinkedList<Integer>(a);
    for(int i=0;i<b.size();i++)
    { 
       for(int j=i+1;j<b.size();j++)
       {           
              if(b.get(i)>b.get(j))
              {
                   int temp =b.get(i);
                   b.set(i,b.get(j));
                   b.set(j,temp);
              }
       }
    }
    System.out.println(b);
    }
} 

*/
//---------------------------------------------------------------------------------------------------------


/*
//ITERATOR:
       *Iterator is an interface which is present in java.util package.
       *It is also known as cursor in java.
       *It is used to iterate over any coolection type classes.
       *It provides two methods 
            1.hasnext()
            2.next() methods.

//1.hasnext():
      *This method checks whether next element is present OR not.
      *This method prints the next value and moves the cursor to next position.
            //EX:
       public static void main(String args[])
       {
       
            
     ArrayList a=new ArrayList();
     a.add(734837);
     a.add(140);
     a.add(27);
     a.add(1224);
     a.add(6336);
     a.add(1);

     Iterator i=a.iterator();
     while(i.hasNext())
     {
       s.o.pl(i.next());
     }
     }        


           
//DISADVANTAGE OF ITERATOR:
     *Using iterator we can only forward direction but cannot move backward direction .to overcome this this disadvantage 

//ListIterator:
           *ListIterator is interface present in java.util package.
           *It is also known as cursor in java.
           *It is used to iterate over list interface classes only.
           *Using this iterator we can move forward and backward direction also.
           *It contains four methods 
                  1.hasNext()
                  2.next()
                  3.hasPrevious()
                  4.previous()
                  
                  
//hasPrevious():
       *This method checks whether previous element is present OR not by returning boolean value.

//previous():
      *It prints the previous and moves the cursor to previous position
               //EX:
                 ArrayList a=new ArrayList();
              a.add(50);
              a.add(14);
              a.add(11);
              Iterator i=a.iterator();
              while(i.hasNext())
              {
                System.out.println(i.next());
              }
              s.o.pl("______________________________");
              while(a.hasprevious())
              {
                     s.o.pl(a.previous());
              }


                     


       */
      //------------------------------------------------------------------------------------------------------------------------------

/* package com.collection_framework;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
class Linkedlist{
       public static void main(String[] args) {
              ArrayList a=new ArrayList();
              a.add(734837);
              a.add(140);
              a.add(27);
              a.add(1224);
              a.add(6336);
              a.add(1);
         
              Iterator i=a.iterator();
              while(i.hasNext())
              {
                System.out.println(i.next());
              }
                     
                 
              
       }
} 

*/
//-------------------------------------------------------------------------------------------------------------------------


/*
//SET INTERFACE:
        *Set interface is present in java.util package.
        *It is a child interface of collection interface.
        *It does not provide inexing and does not allow duplicates.
        

//hashset class:
      *It is a concrete implementing class of set  interface.
      *It overrides all obstract methods of set interface.

//CHARASTERISTICS OF HASHSET CLASS:
       1.It does not allow duplicates 
       2.It allowes only one null value.
       3.Does not maintained insertion order.
       4.Methods are non-synchronized.
       5.Internally it uses has table.



//Linked HashSet charasteristics:
         *It will not allow duplicates.
         *Only one null value is allow.
         *It maintains insertion order.
         *Methods are non-synchronized.
         *Internally it uses Doubly Linkedlist.

Difference between arrayList and Linkedlist
arrayList and HashSet
Linkedlist and LinkedHashSet
HashSet and LinkedHashSet
Collection and Collections
Array and ArrayList
Iterator and ListIterator

Why do we prefer collection over array?



      *Hashset provides almost all methods of arrayList axcept the method which returns the index and takes input as
*/
/* package com.HashSet;
import java.util.HashSet;
import java.util.Iterator;
class Linkedlist{
       public static void main(String args[])
       {
              HashSet a=new HashSet();
              a.add("Raja");
              a.add(120);
              a.add("Tamil");
              a.add('b');
              System.out.println(a);

              //for each loop
              for(Object o: a)
              {
                     System.out.println(o);

              }
              //Iterator
              Iterator i=a.iterator();
              while(i.hasNext())
              {
                     System.out.println(i.next());

              }

       }
}
 */


//write a program to store only integer objects in  and sort in ascending order
/* package com.collection_framework;
import java.util.*;
public class Linkedlist {
public static void main(String args[])
    {
    HashSet <Integer> a=new HashSet<Integer>();
     a.add(734837);
     a.add(140);
     a.add(27);
     a.add(1224);
     a.add(6336);
     a.add(1);
     ArrayList b=new ArrayList(a);
       Collections.sort(b);
    System.out.println(b);
    }
} 

 */
//-------------------------------------------------------------------------------------------------------------------------

//Write a program to remove duplicates in String
package com.collection_framework;
import java.util.*;
public class Linkedlist {
public static void main(String args[]){
    String s="big black bug is sitting on big black noise of big black dog";
    String str[]=s.split(" ");
    System.out.println(Arrays.toString(str));
    LinkedHashSet <String> a=new LinkedHashSet<String>();
    for(int i=0;i<str.length;i++)
    {
       a.add(str[i]);
    }
    System.out.println(a);
    }
}


