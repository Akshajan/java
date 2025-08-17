public class Testx {
    public static void main(String[] args) {

        // Outer block
        {
            int x = 10; // local variable inside this block
            System.out.println("Inside block: x = " + x);

        }
        // x is not accessible here
        // System.out.println(x); // ❌ Error: cannot find symbol
        System.out.println("outside block");
        System.out.printf("The value is: %-4.3f, That was obtained by: %s,"+
        " His prediction was %b with an accuracy of 89%% %n",
         3.145678192, "Abhay",true);

         /* multi-line string literals */
         String message = """   
        This is line one 
        This is line two
        This is line three
        """;
        System.out.println(message);

    }
}
