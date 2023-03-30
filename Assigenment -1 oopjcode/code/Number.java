//Q31
class Number{
    public static void main(String[] args){
        String str= new String("112dxc");// this line give error: NumberFormatException.forInputString (Unknown Source)
       //Thrown to indicate that the application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
        int num = Integer.parseInt(str);
        System.out.println("number: "+num);
    }
}