//finding count of a specific character in a string
import java.util.Scanner;

public class CharCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ch) {
                count += 1;
            }
        }
        System.out.println(count);

    }

}
