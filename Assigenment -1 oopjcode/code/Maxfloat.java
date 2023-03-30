//Q26
import java.util.Scanner;
class Maxfloat{
    public static void main(String[] args){
         Scanner sc = new Scanner( System.in );
         System.out.println("Enter first Float value: ");
         float value = sc.nextFloat();
    
          System.out.println("Enter second Float value: ");
          float value1 = sc.nextFloat();

        float min = Float.min(value,value1);
        float max = Float.max(value,value1);

         System.out.println("MIN value is : "+min);
         System.out.println("MAX value is : "+max);

       float sum =Float.sum(value,value1);
         System.out.println("sum of 2 number is  "+sum);
}
    }