import java.util.*;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] count = new int[10];
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count[ch - '0']++;
            }
        }
        for (int d = 0; d <= 9; d++) {
            System.out.print(count[d] + (d < 9 ? " " : ""));
        }
    }
}
