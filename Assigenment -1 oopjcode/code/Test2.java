//Q9
class Test2{
    public static void main(String[]args){
         byte value = 12;
      Byte bs= new Byte(value);
      byte num = bs.byteValue();
       System.out.println("Byte value :" +num);
      short num1 = bs.shortValue();
      System.out.println("Short value :" +num1);
      int num2 = bs.intValue();
      System.out.println("Int value :" +num2);
      long num3 = bs.longValue();
      System.out.println("Long value :" +num3);
      float num4 = bs.floatValue();
      System.out.println("Float value :" +num4);
      double num5 = bs.doubleValue();
      System.out.println("Double value :" +num5);
        
    }
}