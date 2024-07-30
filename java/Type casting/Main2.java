public class Main2 {
    public static int m1(double a,double b,double c,double d,double e){
        int avg =(int)(a+b+c+d+e)/5;
        System.out.println(avg);
        return avg;
    }
    
    public static void main(String args[]){
        int avg=m1((int) 10.0d,20.80d,30.40d,23.8d,46.89d);
        System.out.println("The averrage interms of int: "+avg);
    }
    
}
 