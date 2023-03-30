class Program6{
    public static void main(String[] args){
      // Q23.a The number of bits used to represent a float value
   float n = Float.SIZE;
     System.out.println(n);

     //Q23.b The number of bytes used to represent a float value
    float n1= Float.BYTES;
     System.out.println(n1);

     //Q23.c  The minimum value a float
    float n2 = Float.MAX_VALUE;
     System.out.println(n2);

     //Q23.d The maximum value a float
    float n3 = Float.MIN_VALUE;
     System.out.println(n3);

      //Q24.a float value into String
     float a = 10.5f;
      String str= String.valueOf(a);
        System.out.println(str);

        //Q24.b. float value into Float instance.
        float a1 = 12.9f;
      float st= Float.valueOf(a1);
        System.out.println(st);

        //Q24.c String instance into Float instance.
        String value = "80";
      String strNumber =value.toString( );
      float a2 =Float.parseFloat(strNumber);
    float ns= Float.valueOf(a2);
        System.out.println(ns);

        //Q24.d float value into hexadecimal string.
        float a3=20.96f;
        String s1=Float.toHexString(a3);
        System.out.println(s1);
        


    }
}