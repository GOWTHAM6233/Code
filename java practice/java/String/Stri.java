// THE  PROGRAM FOR CHANGE THE CHARECTER 'a' TO '1':

/* package String;
import java.util.*;
public class Stri {
    public static void main(String[] args) {
    String S1="abcadaaddaesasAA";
    String s3="";
    for(int i=0;i<S1.length();i++)
    {
        if(S1.charAt(i)=='a' || S1.charAt(i)=='A')
        {
            s3+='1';
        }
        else
        {
            s3+=S1.charAt(i);
        }
    }
    System.out.println(s3);
}
}  */

//------------------------------------------------------------------------------------------------------------------------------------
//COUNT OF THE ELEMENT IN AN STRING:
/* 
package String;

public class Stri {
    public static void main(String[] args) {
        String s1="ahasihdbfajudfaalvAAA";
        int count=0;
        int count2=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a')
            {
                count++;
            }
                if(s1.charAt(i)=='A')
                {
                count2++;
                }
        }
        System.out.println("The 'a' count is:"+count);
        System.out.println("The 'A' count is:"+count2);
        
    }   
}  */
    
//--------------------------------------------------------------------------------------------------------------------------------------
//THE COUNT OF THE STRING :

/* package String;
public class Stri {
    public static void main(String[] args) 
    {
        String s1="abc";
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            count++;
        }
    System.out.println("The String count is:"+count);
    }
}
 */

 //----------------------------------------------------------------------------------------------------------------------------------
//REVERSE A STRING AND CHECK WHETHER GIVEN NUMBER IS PALINDROME (OR) NOT:
/*  package String;
 public class Stri {
    public static void main(String[] args) {
        String s1="madam";
        String s2=new String();
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2+=s1.charAt(i);
        }
        if(s2.equals(s1))
        {
            System.out.println("The number is palindrome!");
        }
        else
        {
            System.out.println("The number is not palindrome!");
        }
        System.out.print("The String reverse is:"+s2);
    }
 }
 */
//---------------------------------------------------------------------------------------------------------------------

 //EVERY WORD FIRST LETTER SHPULD BE IN UPPERCASE:
/* package String;
 public class Stri {
    public static void main(String[] args) {
    String s1=" my name Gowtham";
    String s2=" ";
    int x=0;
  for(int i=0;i<s1.length();i++)
    {
        if(s1.charAt(i)==' ')
        {
            char c=s1.charAt(i+1);
            char d=s1.charAt(i+1);
            if(d>='A' && d<='Z')
            {
                x=s1.charAt(i+1);
                c=(char)x;
            }
            x=(int)c;
            x=x-32;
            char ch=(char)x;
            s2=s2+" "+ch;
            i=i+1;
        }
        else
        {
            s2+=s1.charAt(i);
        }
    } 
    System.out.println(s2); 
 }
} 
  */
//------------------------------------------------------------------------------------------------------------------------------


//VOWELS AND CONSTATS IN STRING:

/* public class Stri {
public static void main(String[] args) {
    String s1="dsuidsfetcvbawionnfahulkmbkgrwoiAEIOU";
    String s2=new String();
    String s3=new String();
    for(int i=0;i<s1.length();i++)
    {
        char c=s1.charAt(i);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' && c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            s2+=c;
        }
        else
        {
            s3+=c;
        }
    }
    System.out.println("The Vowels are:"+s2);
    System.out.println("The Constatnts are:"+s3);
}
} */

//--------------------------------------------------------------------------------------------------------------------
/* public class Stri {
    public static void main(String[] args) {
        String str = "hello world";
        int[] frequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        System.out.println("Character Frequency in the given string:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
} 
    */


class Stri
{
    public static void main(String args[])
    {
        String s1="Listen";
        String s2="";
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                s2+=s1.charAt(i);
                if(s2==s1)
                {
                    System.out.println("The "+s1 +"and "+s2+"is Anagram");
                }
                else{
                    System.out.println("The "+s1 +"and "+s2+"is not Anagram");
                }
            }
        }
    }
}





