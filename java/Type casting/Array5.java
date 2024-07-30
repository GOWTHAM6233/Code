                        

                                               /*
//FOR EACH LOOP:
                *This also known as enhanced loop/Advanced loop.
               *This loop is faster than normal loop.
               *Using this loop we can only iterate in forward direction but not in Backward direction.
               *This  loop is doesnot have indexing concept.

    //Syntax:
              for(datatype var_name:array_reference)
              {

              }           

                                       */








                                       /*
                                        
                                      //2D ARRAY:

            *In 2D array we can store the data in the form of rows and columns .
            *2D array is array inside another array.
            *To store Matrix data we use 2D array.                          

        //Syntax:
        datatype[][] var_name=new datatype [row_size][column_size];
        

        //Ex:
        int[][] a=new int[3][4];





             *To find length of row we write var_name.length

             public class Array5{
                public static void main(String args[])
                {
                int[][] a=new int[3][2];
                System.out.println(a.length);     //It prints the row
                System.out.println(a[1].length)      //It prints the column of the selected Row.

                 }
             }
            










                                        */
                                    
                                    













                                               /*

                                    
                                    
   import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Create an array of the specified size
        int[] array = new int[size];
        
        // Call a method to fill the array with user input
        fillArray(array, scanner);
        
        // Display the contents of the array
        System.out.println("The array you entered is:");
        for (int i = 1; i <array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
        
        scanner.close();
    }
    
    // Method to fill the array with user input
    public static void fillArray(int[] array, Scanner scanner) {
        System.out.println("Enter " + array.length + " integers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }
}

                       
                                                    */
                                   /* 

 public class Array5{
public static void main(String args[])
{
int[][] a=new int[3][2];
System.out.println(a.length);     //It prints the row
System.out.println(a[1].length);      //It prints the column of the selected Row.
  }
             }                                                    
                                                    
                                                   



                                                */
                                                /*
                                                
 public class Array5{
    public static void main(String args[])
    {
    int[][] a={{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<a.length;i++){
    
        for(int j=0;j<a[i].length;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }


      }
                 }                  

                                                                             */



                                                 /*
//write a program to print sum of all elements in array:
import java.util.*;
public class Array5{
    public static void m1(int[][] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
}
public static void main(String args[]){
    int b=0;
    int a[][]={ {1,2,3},
                 {4,5,6},
                {6,7,8}};
                System.out.println(b);

              m1(a);  

}

}

                                          */



                                               /*
//Write a program to print sum of primary diagnal:

public class Array5{
    public static void m1(int[][] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j)
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
}
public static void main(String args[]){
    int b=0;
    int a[][]={ {1,2,2},
                {4,5,6},
                {6,7,8}};                              //output:
                System.out.println(b);                //             14(because 1+5+8=14)             

              m1(a);  

}

}

                                                    */


                                  

//Write a program to print sum of Secondary diagnal:
public class Array5{
    public static void m1(int[][] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
            {
                if(i+j==a.length-1)
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
}
public static void main(String args[]){
    int b=0;
    int a[][]={ {1,2,2},
                {4,5,6},
                {6,7,8}};                              //output:                       
              m1(a);                                    //       13(because add 2+5+6=13)   

}

}
