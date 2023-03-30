class Charop {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        if (Character.isDigit(ch)) {
            System.out.println("Value: " + ch);
            System.out.println("Code point: " + (int) ch);
        } else if (Character.isLetter(ch)) 
        {

            if (Character.isLowerCase(ch)) 
            {
                char lower = Character.toUpperCase(ch);
                System.out.println("The entered character is in uppercase");
                System.out.println("Value: " + lower);
                System.out.println("Code point: " + (int) lower);
            } else if (Character.isUpperCase(ch))
             {
                char upper = Character.toLowerCase(ch);
                System.out.println("The entered character is in lowercase");
                System.out.println("Value: " + upper);
                System.out.println("Code point: " + (int) upper);
            }
        } 
    }
}
