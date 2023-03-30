class Test1{
    public static void main(String [] args){
/*
    //Q28.a
      double d = 12.5;// intiliaze 
      String str= String.valueOf(d);//Returns the string representation of the double argument.
        System.out.println(str);// printing 

        //Q28.b
      double d = 12.5;// intiliaze 
      double D= Double.valueOf(d);//Returns a Double instance representing the specified double value.
        System.out.println(D);// printing 

        //Q28.c
      double d = 12.5;// intiliaze 
      Double ds= new Double(d);//double instance
      double num = ds.doubleValue();//instance method call obhect refrence
        System.out.println(num);// printing */

         //Q28.d
         double d = 12.5;// intiliaze 
          String ls=Long.toBinaryString(Double.doubleToRawLongBits(d));
        System.out.println(ls);// printing
        String lo= Long.toOctalString(Double.doubleToRawLongBits(d));
         System.out.println(lo);// printing
         String str2 =Double.toHexString(d);
          System.out.println(str2);

      




}
}