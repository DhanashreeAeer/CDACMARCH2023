//Q29
class Test3{
    public static void main(String [] args)
    {
      double d = 12.5;// intiliaze 
      Double ds= new Double(d);//double instance
       byte n1 = ds.byteValue();
       System.out.println("Byte value :" +n1);
      short n2 = ds.shortValue();
      System.out.println("Short value :" +n2);
      int n3 = ds.intValue();
      System.out.println("Int value :" +n3);
      long n4 = ds.longValue();
      System.out.println("Long value :" +n4);
      float n5= ds.floatValue();
      System.out.println("Float value :" +n5);
      double n6 = ds.doubleValue();
      System.out.println("Double value :" +n6);

     

    }

}