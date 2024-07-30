
/*  
//COLLECTION FRAMEWORKS:
        *Collection framework is a group of java inbuild classes and interfaces.
        *Which provides the maachanism to store multiple objects.
        *Using collection framework programmer can insert,renove,and sort the data easily.
        *Collection framework allowed multiple object of hetrogeniuos datatype and it is not fixed(Dynamic).


  //COLLECTION INTERFACE:
        *Collection interface is present in java.util package  

        *Colllection interface provides inbuild method to add,remove,update and sort the objects.

//LIST INTERFACE:
          *List interface is the child interface of collection interface.
          *List interface is provides indexing and allowes us to store duplicate values.

//ArrayList:
           *ArrayList is a concrete implementing class in List Interface.
           *In this all the methods of list interface is overridden.
           
   //CHARASTERISTIC OF ArrayList:
            1.Duplicates are allowed.
            2.Multiple null values are allowed.
            3.Insertion order is preserved OR Maintained.
            4.methods are non synchronized.
            5.ArrayList internally uses growable array(Dyanamic array).
            
 //CONSTRUCTORS OF ArrayList class:
           *ArrayList() constructor creates a new empty list with initial capacity 10.
      
  //ArrayList(collecetion):         
           *ArrayList(collection) this constructor helps to convert specified collection to this ArrayList.

ArrayList(Initial capacity)
           *It creates new array list of specified initial capacity.

//INBUILD METHOD OF ArrayList() CLASS:
_________________________________________________________________________________________________________________________________________
     PURPOSE OF METHOD                   RETURN TYPE                                              METHOD NAME
______________________________________________________________________________________________________________________________________
1.To add a object

                                            Boolean              --------------                    addd(object)
                                            void             -----------------                     add(index,object) 
                                            Boolean          -------------------                   addAll(Collection)  
                                            Boolean            ------------------                  addAll(index,collection)
------------------------------------------------------------------------------------------------------------------------------
  Description:  
1.addd(object):
  *This method helps to add object in ArrayList(). 

 2. add(index,object):   
  *This method is helps to add specified object at specified index.

3.addAll(Collection):  
  *This method copy all the elements of specified collection to this ArrayList.

4.addAll(index,collection):  
             *This method helps to add specified collection at specified index.
     

//________________________________________________________________________________________________________________________________
2.To remove object                          boolean             --------------------               remove(object)
                                            object          ----------------------                 remove(index)
                                            boolean          ---------------------------           removeAll(index)

5.remove(object):
           *This method removes the specified object in the ArrayList.

6.remove(index):           
           *This method removes the object at specified index.

 7.removeAll(index):
           *This method removes all the elements of specified collections from this array list.
//____________________________________________________________________________________________________________________________________
3.To check the presence of element
                                            int                   -------------------------        indexOf(object)
                                            boolean                -----------------------         contains(object)

8.indexOf(object):
     *This method returns the index of specified object.
     *If not present it will giive -1.
 
9.contains(object):
        *This method checks whether specified object is present OR not.
//_________________________________________________________________________________________________________________________________________       
4.To modify object
                                                                                                  
                                            object          -- ------------------                 set(index,object)
                                                                                                
                ---------------------------------------------------------------------------------------------------                              
11.set(index,object):
          *This method is helps to modify the  specified object and specified index.                                             

//_________________________________________________________________________________________________________________________________________     

5. To iterate                                
                                            ListIterator        --------------------------          listiterator()
                                            iterator             ---------------------------        iterator()




//___________________________________________________________________________________________________________________________________
6. Miscellaneous

                                             object          --------------------------                    get(index)
                                             boolean         ----------------------------                  isEmpty()
                                             int               -----------------------                     Size()
               ---------------------------------------------------------------------                              

12. get(index):
      *This method returns the object at specified index.

14.size();
*This method returns no.of elements in ArrayList() OR it returns length of ArrayList().



 */
//______________________________________________________________________________________________________________________________________
                                       /*
 import java.util.*;
public class Collect {
   
    public static void  main(String args[])
    {
        ArrayList a1= new ArrayList();
     // -------------------------- to add the object---------------------

    //1. add(object)
    a1.add(10);
    a1.add('c');
    a1.add("mango");
    System.out.println(a1);             //[10, c, mango]


    //2. add(index,object)
    a1.add(1,56.25d);
    System.out.println(a1);          //[10,56.23,c,mango]

// 3. addAll(index)      
    a1.add(4,"Apple");
    System.out.println(a1);          //[10,56.23,c,Apple]

    a1.add("mango");
    a1.add(300);
    System.out.println(a1);           //[10,56.23,c,Apple,mango,300]

    // 4.  addAll(index,collection)
    a1.addAll(1,a1);
    System.out.println(a1);           //[10,apple,300,56.23,c,Apple,mango,300]
System.out.println("-----------------------------------------------------------------------");

//5. remove(object)
a1.remove("mango");                 //[10, 10, 56.25, c, Apple, mango, 300, 56.25, c, mango, Apple, mango, 300]
System.out.println(a1);        //[10, 10, 56.25, c, Apple, 300, 56.25, c, mango, Apple, mango, 300]

// 6. remove(index)
a1.remove(5);
System.out.println(a1);               //[10, 56.25, c, Apple, 300, 56.25, c, mango, Apple, mango, 300] 

Integer a=10;
a1.remove(a);
System.out.println(a1);
//8. clear()
//a1.clear();
System.out.println(a1);              //[10, 56.25, c, Apple, 300, 56.25, c, mango, Apple, mango, 300]
System.out.println("---------------------------------------------------------------------------");

//   ---------------To check presence of an object----------------
//9. indexOf(object)
System.out.println(a1.indexOf("Apple"));    //3
System.out.println(a1.indexOf("pineapple"));    //-1

//10. Contains(object)
System.out.println(a1.contains("Apple"));                   //true
System.out.println(a1.contains("20"));                   //false

//11.set(index,object)
a1.set(2,"Raja");
System.out.println(a1);                                    //[10, 56.25, Raja, Apple, 300, 56.25, c, mango, Apple, mango, 300]

//12.get(index)
System.out.println(a1.get(2));                       //Raja

// 15. isEmpty()
System.out.println(a1.isEmpty());                       //false

// 16.size() 
System.out.println(a1.size());      //11


    }
    
}
                                                    */
package com.collection_framework;                                                    
import java.util.ArrayList;

public class Collect{
public static void main(String args[])
{
  ArrayList a1=new ArrayList();

  a1.add("laptop");
  a1.add("silver");
  a1.add("machan");
  a1.add(29);


  //to iterate using normal for loop
  for(int i=0;i<=a1.size()-1;i++)
  {
    System.out.println(a1.get(i));
  }
  System.out.println("----------------------------------------------------");
  for(Object x:a1)
  {
    System.out.println(x);
  }
}
}

