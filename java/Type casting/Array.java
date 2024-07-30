/*
//ARRAY:
        *Array is a continuous block of memory which is used homogenius data type(similar type).
        *Arrays are of fixed size that is we cannot change this size of array throughout the program.
        *Every block of array is assigned with index(index always starts from zero).
        *Initally array will store default value of data type.
     
        
   //Syntax to create array:
          
          datatype[] var_name = new datatype[size];
                         OR
         datatype var_name = new datatype[size];           
     
 //Alternative way to create array:
            
                datatype[] var_name={v1,v2,v3,....};
                              OR
                datatype var_name[]={v1,v2,v3,....};               
         
//Ex:
     class Array {
        public static void main(String args[])
        {
            int[] a = new int[3];
            float[] f = new float[5];
        }
     }     

         *To fetch the length of the array we write varable_name.length.
                            //EX:
                              class Array {
                               public static void main(String args[])
                                {
                                int[] a = new int[3];
                                   System.out.println(a.length);
                                 }
                                } 

          *TO feth the value in array at spesific index in array.   
                         //EX:
                               System.out.println(a[2]);                           

          *TO modify the value at specific index we write varable_name[index] =value;
           
                              //EX:
                                   int a[2]=10;
                       
         *If programmer is trying to access the index which is not present then we get "arrayindexoutofbounds" exception.     
         
         


        


        */

        //write a program to create integer array of size 5 store the values from user and print all the values.




                             /*
 import java.util.*;       
public class Array {
    public static void main(String args[]){
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
    
    }
    
}
                                          */
/* 


//To print arrays elements using inbuild method.


*Arrays are inbuld class which is present in java.util.class.
*To use the this class programers should import this package.


   
                      */
//write a program to print array elements in reverse direction. 



public class Array{
    public static void main(String args[])
{
    int a[]={10,100,20,30};
    for(int i=a.length-1;i<=0;i--){
        System.out.println(a[i]);
    }
}
}




/*
     //write a program to print only even numbers from array:



 */                   











                                         //IMPORTANT QUESTIONS IN ARRAY:
                      
  //write a program to find second largest element in a array
  //write a program to find second Smalllest element in a array
 // write a program to find frequency of each element in array.
 //write a program to find duplicates in array.
 //write a program to reverse an array
                   











