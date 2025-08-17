public class PrefixPostfixLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 7;) {
            System.out.println("Before: i = " + i);

            int val = i++ + ++i; // postfix + prefix in one line
            System.out.println("val = " + val + ", i = " + i);

            // no separate increment in loop header, so i changes here only
        }
    }
}
