                                 /*

//write a program to count no.of uppercase character in a string
public class Main1{
    public static void main(String[] args)
    {
     String s1="Java Is Programming Language";
     int count=0;
     for(int i=0;i<s1.length();i++)
     {
      char c=s1.charAt(i);
      if(c>='A' && c<='Z')
      count++;
  
     }
     System.out.println("No of UpperCaSE Are: "+count);
    }
  }

                              */
//-----------------------------------------------------------------------------------------------------------------------------
                              /*
  //Write a program to convert String to uppercase 
  public class Main1{
    public static void main(String[] args)
    {
   String s="This the code";
   String res="";
   for(int i=0;i<s.length();i++)
   {
   char c=s.charAt(i);
   if(c>='a' && c<='z')
   {
int x=(int)c;
x=x-32;
char ch =(char)x;
res=res+ch;
   }

else
  {
    res=res+c;
  }
    }
    System.out.println(res);
  }
}

                              */
//--------------------------------------------------------------------------------------------------------------------                              
                                            /*
                                            
//Write a program to convert String to Lowerercase 
public class Main1{
  public static void main(String[] args)
  {
 String s="This the Code";
 String res="";
 for(int i=0;i<s.length();i++)
 {
 char c=s.charAt(i);
 if(c>='A' && c<='Z')
 {
int x=(int)c;
x=x+32;
char ch =(char)x;
res=res+ch;
 }

else
{
  res=res+c;
}
  }
  System.out.println(res);
}
}
    
                    */
//-----------------------------------------------------------------------------------------------------------------------                    
                                   /*
                                   
//write a program to find length of the string .
public class Main1 {
  public static void main(String[] args) {
      String str = "this is the java program";
      int length = 0;
      
      // Iterate over each character of the string
      for (char c : str.toCharArray()) {
          // Increment the length counter for each character
          length++;
      }
      
      System.out.println("Length of the string: " + length);
  }
}
                                                  */
//----------------------------------------------------------------------------------------------------------------------                                  
                                     /*             
//Write a program to reverse a string    

public class Main1 {
  public static void main(String[] args) {   
    String s="my name is khan";
    String res="";
    for(int i=s.length()-1;i>=0;i--)
    {
      res=res+s.charAt(i);
    }
System.out.println("Reverse of String is: "+res );

  }
}

                          */
//---------------------------------------------------------------------------------------------------------------------------------------------
                                                                 /*
//Write a program to check whether given string is a pallindrome

public class Main1 {
  public static void main(String[] args) {   
    String s="radar";
    String res="";
    for(int i=s.length()-1;i>=0;i--)
    {
      res=res+s.charAt(i);
    }
    if(s.equalsIgnoreCase(res))
    {

System.out.println("This is a palindrome: ");
  }
  else 
  {
    System.out.println("This is not a pallindrome: ");
  }

  }
}

                                                                 */
//-----------------------------------------------------------------------------------------------------------------------------
/* 
//write a program to string to character array without using inbuild method:

import java.util.Arrays;
public class Main1 {
  public static char[] m1(String s)
  {
    char[] c= new char[s.length()];
    for (int i=0;i<s.length();i++)
    {
      c[i] = s.charAt(i);
    }
     return c;
  }
  public static void main(String[] args) {   
    String s="java";

    char[] c=m1(s);
    System.out.println(Arrays.toString(c));
  }
}

              */    
//-----------------------------------------------------------------------------------------------------------------------------------
                             /* 
//write a program to arrange character of string in ascending order:

class Main1{
  public static char[] stringtochar(String s)
  {
      char[]c=new char[s.length()];

      for (int i=0;i<s.length();i++){
          c[i]=s.charAt(i);
      }
      return c;
  }
  public static void sort(char[]c)
  {

      for (int i=0;i<c.length;i++){
          for (int j=i+1;j<c.length;j++){
              if (c[i]>c[j]) {
                  char temp = c[i];
                  c[i] = c[j];
                  c[j] = temp;
              }
          }
      }
  }
  public static void main(String[] args)
  {
      String s="programming";
      char[]c=stringtochar(s);
      sort(c);

      System.out.println("Before : "+s);

      String s1=new String(c);
      System.out.println("After : "+s1);

//        using inbuilt method

      // String s="programming";
      // char c=s.toCharArray();
      // Arrays.sort(c);
      // String s1=new String(c);
      // System.out.println(s1);
 }
}
                                       */




//---------------------------------------------------------------------------------------------------------------------------------------
                       /* 

//Write a program to check whether the given string is anagram or not?

/*eg
cat---> act
care--->race,acer
silent---->listen*/
/*
import java.util.*;
class Main1{
  public static char[] m1(String s) {
      char[]c=new char[s.length()];
      for (int i=0;i<s.length();i++){
          c[i]=s.charAt(i);
      }
      return c;
  }

  public static void sort(char c[]) {
      for (int i=0;i<c.length;i++){
          for (int j=i+1;j<c.length;j++){
              if (c[i]>c[j]){
                  char temp=c[i];
                  c[i]=c[j];
                  c[j]=temp;
              }
          }
      }

  }

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first String : ");
      String s1=sc.next();

      System.out.println("Enter the Second String : ");
      String s2=sc.next();

      if (s1.length()!=s2.length()){
          System.out.println("It is not a anagram");
      }
      else {
          char [] c1=m1(s1);
          char []c2=m1(s2);

          sort(c1);
          sort(c2);

          String s3=new String(c1);
          String s4=new String(c2);

          if (s3.equals(s4)){
              System.out.println("It is Anagram");
          }
          else {
              System.out.println("It is not a Anagram");
          }




      }
  }
}

 */

 //-----------------------------------------------------------------------------------------------------------------------------
                                 /*                            
 //Write a program to count number of words in a string:

 import java.util.*;
class Main1{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String s=sc.nextLine();
    int count=0;
    for(int i=0;i<s.length();i++)
    {
        if((i==0 && s.charAt(i)!=' ') || (s.charAt(i)!=' ' && s.charAt(i)==' '));
        count++;

    }
   System.out.println(count);
  }
  }                                   */
//----------------------------------------------------------------------------------------------------------------------------------

//Write a program to find minimum and maximum occuring character in string.
//Write a program to find sum of numbers in alpha numeric String. (a1h2j4 here 1+2+4=7)
//Write a program to find duplicate word in a string.
//Write a program to find duplicate characters in string.
//Write a program to find frequency of character in a string.
//Write a program to find largest and smalllest word in a string.
//Write a program to find biggest and smallest pallindrome in a string.
//Write a program to reverse a string word by word.(java python=>avaj nohtyp)



import java.util.*;
public class Main1 {
  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);  
    System.out.println("Enter the String: ");
    String s=sc.nextLine();
    String res="";
    
    for(int i=s.length()-1;i>=0;i--)
    {
      res=res+s.charAt(i);
      if(res == " ")
      {
        
      }
    }
System.out.println("Reverse of String is: "+res );

  }
}








                                    














