//Q14
class Program1{
    public static void main(String [] args)
    {
      short s = 85;// intiliaze 
     Short sh= new Short(s);// instance
       byte n1 = sh.byteValue();
       System.out.println("Byte value :" +n1);
      double n2 = sh.doubleValue();
      System.out.println("Double value :" +n2);
      int n3 = sh.intValue();
      System.out.println("Int value :" +n3);
      long n4 = sh.longValue();
      System.out.println("Long value :" +n4);
      float n5= sh.floatValue();
      System.out.println("Float value :" +n5);
      short n6 = sh.shortValue();
      System.out.println("Short value :" +n6);
    }
}
