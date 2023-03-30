//Q30
import java.util.Scanner;
class Maxandmin{
    public static void main(String[] args){
         Scanner sc = new Scanner( System.in );
         System.out.println("Enter first Double value: ");
         double value = sc.nextDouble();
    
          System.out.println("Enter second Double value: ");
          double value1 = sc.nextDouble();

         double min = Double.min(value,value1);
         double max = Double.max(value,value1);

         System.out.println("MIN value is : "+min);
         System.out.println("MAX value is : "+max);

        double sum = Double.sum(value,value1);
         System.out.println("sum of 2 number is >> "+sum);
}
    }
