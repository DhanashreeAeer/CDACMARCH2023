class Program4{
    public static void main(String[] args){
      // Q19.a The number of bits used to represent a long value
    long n =  Long.SIZE;
     System.out.println(n);

     //Q19.b The number of bytes used to represent a long value
    long n1=  Long.BYTES;
     System.out.println(n1);

     //Q19.c The minimum value a long
    long n2 =  Long.MAX_VALUE;
     System.out.println(n2);

     //Q19.d The maximum value a long
    long n3 =  Long.MIN_VALUE;
     System.out.println(n3);

     //Q20.a long value into String
      long a = 658565l;
      String str= String.valueOf(a);
        System.out.println(str);

        //Q20.b. long value into Long instance.
        long a1 = 4586l;
      long st= Long.valueOf(a1);
        System.out.println(st);

        //Q20.c String instance into Long instance.
        String value = "4569";
      String strNumber =value.toString( );
      long a2 =Long.parseLong(strNumber);
      long ns= Long.valueOf(a2);
        System.out.println(ns);

        //Q20.d long value into binary, octal and hexadecimal string.
        long a3=20856l;
        String s1=Long.toBinaryString(a3);
        System.out.println(s1);
        String s2=Long.toHexString(a3);
        System.out.println(s2);
         String s3=Long.toOctalString(a3);
        System.out.println(s3);

    }
}
