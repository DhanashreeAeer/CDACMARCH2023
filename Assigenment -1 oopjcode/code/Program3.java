//Q17
class  Program3{
    public static void main(String[]args){
         int value = 123;
      Integer i= new Integer(value);
      byte num = i.byteValue();
       System.out.println("Byte value :" +num);
      short num1 = i.shortValue();
      System.out.println("Short value :" +num1);
      int num2 = i.intValue();
      System.out.println("Int value :" +num2);
      long num3 = i.longValue();
      System.out.println("Long value :" +num3);
      float num4 = i.floatValue();
      System.out.println("Float value :" +num4);
      double num5 = i.doubleValue();
      System.out.println("Double value :" +num5);
        
    }
}