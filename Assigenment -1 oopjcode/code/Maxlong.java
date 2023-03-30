//Q22
import java.util.Scanner;
class Maxlong{
    public static void main(String[] args){
         Scanner sc = new Scanner( System.in );
         System.out.println("Enter first Long value: ");
         long value = sc.nextLong();
    
          System.out.println("Enter second Long value: ");
          long value1 = sc.nextLong();

         long min = Long.min(value,value1);
         long max = Long.max(value,value1);

         System.out.println("MIN value is : "+min);
         System.out.println("MAX value is : "+max);

        long sum = Long.sum(value,value1);
         System.out.println("sum of 2 number is >> "+sum);
}
    }