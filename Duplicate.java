import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  String: ");
        String s = sc.nextLine().trim();
        int n = s.length();

        Map<Character, Integer> matches = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (matches.containsKey(ch)) {
                matches.put(ch, matches.get(ch) + 1);
            } else {
                matches.put(ch, 1);
            }
        }

        System.out.print("Duplicate characters are: ");
        for (char ch : matches.keySet()) {
            int count = matches.get(ch);
            if (count > 1) {
                System.out.println("character " + ch + " matched " + count + " times");
            }
        }

    }

}
