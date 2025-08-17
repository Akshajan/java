import java.util.Scanner;

public class Stringr {
    public static void main(String arg[]) {
        String rev = "";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        System.out.println(n);
        for (int i = n - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);
        sc.close();
    }

}
