class Program2{
    public static void main(String[] args){
      // Q15.a The number of bits used to represent a integer value
    int n = Integer.SIZE;
     System.out.println(n);

     //Q15.b The number of bytes used to represent a integer value
    int n1= Integer.BYTES;
     System.out.println(n1);

     //Q15.c  The minimum value a integer
    int n2 = Integer.MAX_VALUE;
     System.out.println(n2);

     //Q15.d The maximum value a integer
    int n3 = Integer.MIN_VALUE;
     System.out.println(n3);

      //Q16.aint value into String
     int a = 10;
      String str= String.valueOf(a);
        System.out.println(str);

        //Q16.b. int value into Integer instance.
        int a1 = 10;
      int st= Integer.valueOf(a1);
        System.out.println(st);

        //Q16.c String instance into Integer instance.
        String value = "80";
      String strNumber =value.toString( );
      int a2 =Integer.parseInt(strNumber);
      int ns= Integer.valueOf(a2);
        System.out.println(ns);

        //Q16.d int value into binary, octal and hexadecimal string.
        int a3=20;
        String s1=Integer.toBinaryString(a3);
        System.out.println(s1);
        String s2=Integer.toHexString(a3);
        System.out.println(s2);
         String s3=Integer.toOctalString(a3);
        System.out.println(s3);


    }
}