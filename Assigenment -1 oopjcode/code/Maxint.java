//Q18
import java.util.Scanner;
class Maxint{
    public static void main(String[] args){
         Scanner sc = new Scanner( System.in );
         System.out.println("Enter first Integer value: ");
         int value = sc.nextInt();
    
          System.out.println("Enter second Integer value: ");
          int value1 = sc.nextInt();

        int min = Integer.min(value,value1);
        int max = Integer.max(value,value1);

         System.out.println("MIN value is : "+min);
         System.out.println("MAX value is : "+max);

       int sum = Integer.sum(value,value1);
         System.out.println("sum of 2 number is  "+sum);
}
    }