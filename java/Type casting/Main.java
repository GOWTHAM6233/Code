
    /*
    //TYPE CASTING:
         *Converting one type of data to another type of data is known as type casting .
         *there are two types of type casting.
            1.primitive type casting
            2.Non primitive type casting

//1.primitive type casting:
                       *converting one type of data type to another primitive data type is known as primitive type casting.
                       *There are two types if primitive type casting.
                                  1.Widening (or)implicit
                                  2.narrowing (or) explicit 
                 EX:
                   byte->short-> int-> long-> float-> double
      

         //1.Widening (or)implicit:
                        *converting lower range of data type to higher range of data type is known as widening.
                        *It is also known as implicit type casting (or) auto type casting.
                        *In widening process there is no possibility of data loss.
                        *We can do widening with the help of type casting operator also.

          //Example program:
          class widening{
              public static void main(String args[]){
                byte b=30;

                int i=b;          //implicity compilor will convert
                System.out.println(i); //30

                int x=50;
                float f=(float)x;
                System.out.println(x);
              }        
            }       

    2.Narrowing (or) explicit :
                * converting higher range of data type to lower range of data type is known as narrowing.
                *It is also known as explicit type casting.
                *In narrowing process there is a possibility of data loss. So it is mandatory to use type cast operator.

               */
              
/*
public class Main {
    public static void main(String args[])
    {
        long l=12334l;
        int x=(int)l;
        System.out.println(x);

        double j=2334353d;
        int i=(int)j;
        System.out.println(i);
    }

    
}
 */



class primitiveTypeCasting{
    public static Double areOfCircle(int radius){
        double d=(3.14*radius*radius);

    
    return d;
    }
    public static void main(String args[]){
        int radius=6;
        System.out.println("The area of circle is: "+areOfCircle(radius));
    }
} 

 
 
