/*public class Main1 {
    public static void m1(byte a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        m1((byte)12334);
        
    }
    
}

*/
import java.util.Scanner;
public class Main1 {
    public static void m1(float a,float b,float c){
        int  add=(int)a+(int)b+(int)c;
    System.out.println("The averrage interms of int: "+add);
    
       
    
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  value a: ");
        float a=sc.nextFloat();
        System.out.println("Enter the  value of B: ");
        float b=sc.nextFloat();
        System.out.println("Enter the  value of c: ");
        float c=sc.nextFloat();
        
        m1(a,b,c);
    
       
    }
    
}
 