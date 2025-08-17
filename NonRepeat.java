import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  String: ");
        String s = sc.nextLine().trim();
        int n = s.length();

        Map<Character, Integer> matches = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            if (matches.containsKey(ch)) {
                matches.put(ch, matches.get(ch) + 1);
            } else {
                matches.put(ch, 1);
            }
        }

        System.out.print("Non repeating characters are: ");
        for (char ch : matches.keySet()) {
            int count = matches.get(ch);
            if (count == 1) {
                System.out.print(ch + " ");
            }
        }

    }

}
