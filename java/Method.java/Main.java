import java.util.*;
public class Main {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:");
        int row=sc.nextInt();
     for(i=0;i<row;i++)
     {
        for(int j=0;j<=i;j++)
        {
            System.out.print("");
        }
        System.out.println(" * "); 
     }
    }
}

//----------------------------------------------------------------------------------------------------------------

/* import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:");
        int row=sc.nextInt();
        System.out.println("Enter the value of column:");
        int column=sc.nextInt();
     for(int i=row;i>=row;i++)
     {
        for(int j=column;j>=column;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
     }
    }
    
} 
 */