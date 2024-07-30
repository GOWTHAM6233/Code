/* import java.util.*;

class Sample {
    public static long CountDig(long num) {
        int count = 0;
        if (num < 0) {
            num = -num;  // Convert negative number to positive
        }
        if (num == 0) {
            return 1;  // Special case for 0
        }
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;  // Return the count of digits
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit:");
        long num = sc.nextLong();
/*      sc.close();  
        // Close the scanner to avoid resource leak   

        long res = CountDig(num);  // Call the method once
        System.out.println("The count of digits in " + num + " is: " + res);
    }
}
 */

 