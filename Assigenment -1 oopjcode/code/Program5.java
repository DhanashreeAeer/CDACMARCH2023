//Q21
class  Program5{
    public static void main(String[]args){
         long value = 12345l;
      Long l= new Long(value);
      byte num = l.byteValue();
       System.out.println("Byte value :" +num);
      short num1 = l.shortValue();
      System.out.println("Short value :" +num1);
      int num2 = l.intValue();
      System.out.println("Int value :" +num2);
      long num3 = l.longValue();
      System.out.println("Long value :" +num3);
      float num4 = l.floatValue();
      System.out.println("Float value :" +num4);
      double num5 = l.doubleValue();
      System.out.println("Double value :" +num5);
        
    }
}