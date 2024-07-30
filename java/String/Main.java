/*
//STRING:
        *String is a inbuild class present in java.lang
        *It is a final class.
        *It is Immutable in natuer.(It cannot be change)
        *we can create String object using Two ways.
                  1.Using String literal
                  2.using new keyword

    // 1.Using String literal:
                   *Anything which is enclosed within " " is known as String litral.
                   *If we are creating object using String litral then the object gets created inside String constant pool.Which 
                    is present inside heap area. 
                   *If already object is present inside string constant pool then new object is not created. 


        //Ex:
              String s1="siva";
              String s2="mohan";
              String s3="Siva";
              String s4="siva";
              String.out.println(s1==s2); //false
              String.out.println(s1==s3); //false
              String.out.println(s1==s4); //true






    //2.USing new keyword:
                     *When we create an object using new keyword then object is crerated inside heap area.As well as inside 
                       string constatnt pool also (If already is not present.)     
                     *in String constant pool duplicate is not allowed.In heap area duplicates are allowed.       



  //STRING METHODS:
   ___________________________________________________________________________________________________________________________________                    
       Method Name       |       Return Type               |                             Description
   ____________________________________________________________________________________________________________________________________    
  1.  CharAt(index)      |         Char                    |                 *This method retuns the charecter at specified index.   

                              -------------                                          
      //EX:{
          String s="java";
          System.out.println(s.charAt(2)); //v 
          System.out.println(s.charAt(j)); //j
           }
       
   ------------------------------------------------------------------------------------------------------------------------------------    
                         |                                 |
       
  2.  length()           |        int                      |                  *Returns the length of the string.
    
                                      --------------------------
       //Ex:
       {
        String s="java";
        System.out.println(s.length());
       }
----------------------------------------------------------------------------------------------------------------------------------
  3. toLowerCase         |            String               |                   *This method converts string to lower case.  
       
      //EX:
          String s="JAva";
          String s2
          System.out.println(s.toLowerCase());      //java
-----------------------------------------------------------------------------------------------------------------------------------
 4.  toUpperCase         |            String               |                   *This method converts String to Upper case.

     //EX:String s="JAva";
          String s2
          System.out.println(s.toUpperCase());      //JAVA
----------------------------------------------------------------------------------------------------------------------------------------         
 5.   trim               |            String               |           *This method removes space from begining and end of the String.

      //EX:
          String s="     java is difficult.     ";
          System.out.println(s.trim());      //java is difficult.
 ---------------------------------------------------------------------------------------------------------------------------------------         
 6.  startsWith(String)      |       Boolean               |    *The method checks whether this string starts with specified String Or not.

       //EX:{
           String s="sheela";
           string s1="manorajan";
           System.out.println(s.startWith(sh));     //true
           }
            
----------------------------------------------------------------------------------------------------------------------------------------
  7. endsWith(String)      |        Boolean              |   *This method checks whether this string ends with Specified string Or not. 


      //EX:
      {
        String s="sheela";
        System.out.println(s.endsWith(a));           //true
      }     
--------------------------------------------------------------------------------------------------------------------------------------------
 8. equals(String)        |       Boolean                 |     *This method checks whether thiss string is equals to specified 
                                                                  string Or not.

       //EX:
           {
            String s1="ragul";
            String s2="ragul";
            System.out.println(s1==s2);         //true
            System.out.println(s1.equals(s2));      //true
           }
-------------------------------------------------------------------------------------------------------------------------------------------------------
  9.  IndexOf(char)      |          Char               |       *this method returns the index of specified character.
                                                               *This method returns first occurence of specified method of 
                                                                character otherwise -1.

         //Ex;
            String s1="java";
            System.out.println(s1.indexOf('j'));   //0
            System.out.println(s1.indexOf('a'));   //1
 ----------------------------------------------------------------------------------------------------------------------------------
 10.indexOf(String)    |        String                 |    *This method returns the index of first occurence of specufied 
                                                              string.If not then returns -1.           
           
        //EX:
        {
          String s1="java is progam";
          System.out.println(s1.indexOf(is));     //5
          System.out.println(s1.indexOf(pr));     //8
        }
-----------------------------------------------------------------------------------------------------------------------------------------
11. equalsIgnoreCase(String)    |       Boolean         |    *This method checks whether this string and specified string is equal
                                                               Or not by ignoring the cases
  
        //Ex:
             {
              String s1="mango";
              String s2="Mango";
              System.out.println(s1.equalsIgnoreCase(s2));    //true
             }
----------------------------------------------------------------------------------------------------------------------------------
12. contains(String)          |       Boolean           |     *This method checks whether this string contains specified string 
                                                                Or not.

        //EX:
        {
          String s1="my=mynameisakshay";
          System.out.println(s1.contains("akshay"));   //true
          System.out.println(s1.contains("name"));     //true
          System.out.println(s1.contains("akh"));      //false
        }
----------------------------------------------------------------------------------------------------------------------------------------        
13. lastIndexOf(char)        |        Int               |   *This method returns the index of specified character(last Occurence) 
                                                              if not return -1.
 
      //EX:
           {
            String s1="mynameisakshay";
            System.out.println(s1.lastIndexOf('a'));    //12
            System.out.println(s1.lastIndexOf('y'));    //13
            
           }
----------------------------------------------------------------------------------------------------------------------------------------
14. lastIndexOf(String)       |          Int             |     *This method returns the last occurence of specified string from this
                                                                 string if not retuns -1.

      //EX:
           {
            String s1="java is easy to learn";
            System.out.println(s1.lastIndexOf("to"));    //13
           }
--------------------------------------------------------------------------------------------------------------------------------------------------          
15. isEmpty()                |        Boolean            |     *This method returns true if length of the string is 0.otherwise false.            
  
      //EX:
          {
            String s1="";
            System.out.println(s1.isEmpty());    //true
          }
---------------------------------------------------------------------------------------------------------------------------------------
16. subString(Int)            |       String              |    *This method returns this substring from specified index.

      //EX:
           {
            string s1="hellomynamemohan";
            System.out.println(s1.substring(5));    //mynamemohan
            System.out.println(s1.substring(10));    //emohan
           }
-------------------------------------------------------------------------------------------------------------------------------
17. toCharArray()            |      Char[]                |     *This method helps to convert String to character array.
  
      //EX:
          {
             string s1="hellomynamemohan";
             System.out.println(s1);                   // hellomynamemohan 
             char[] c=s1.toCharArray();
             System.out.println(Arrays.toString(c));   //[h,e,l,l,o,m,y,n,a,m,e,i,s,m,o,h,a,n]
          }
---------------------------------------------------------------------------------------------------------------------------------
18. split(String)            |       String[]            |      *This method converts string to string array on the basis of specified
                                                                  string.
      //EX:
           {
            String s1="grass is greener on other side";
            String[] s=s1.split(" ");
            System.out.println(Arrays.toString(s));     //[grass, is, greener, on, other, side]
           }

 */



 
  

//Write a program to count character except spaces
                                      /*
public class Main{
  public static void main(String[] args)
  {
   String s1="java is programming language";
   int count = 0;
   for(int i=0;i<s1.length();i++)
   {
    if(s1.charAt(i)==' ')
    count++;
  
   }
   System.out.println("No.of characters are present except space: "+(s1.length()-count));
  }
}


                                    */

                /*
                                                
//Write a program to count number of vowels in a string.

public class Main{
  public static void main(String[] args)
  {
   String s1="java is programming language";
   s1=s1.toLowerCase();
   int count=0;
   for(int i=0;i<s1.length();i++)
   {
    char c=s1.charAt(i);
    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
    count++;

   }
   System.out.println("No of vowels are: "+count);
  }
}


                                                     */



//Write a program to reverse a string                                                      