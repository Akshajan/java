import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter the String: ");
        // String [] s = sc.nextLine().trim().split("");
        // int n = s.length;

        // Map<Character, Integer> matches = new HashMap<>();

        // for(int i=0; i<n/2;i++){
        // if(s[n-1-i].equals(s[i])){
        // Character ch = s[i].charAt(0);
        // if (matches.containsKey(ch)) {
        // matches.put(ch, matches.get(ch) + 1);
        // } else {
        // matches.put(ch, 1);
        // }
        // }
        // }

        // without using array
        System.out.print("enter the  String: ");
        String s = sc.nextLine().trim();
        int n = s.length();

        Map<Character, Integer> matches = new HashMap<>();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) == s.charAt(n - 1 - i)) {
                char ch = s.charAt(i);
                if (matches.containsKey(ch)) {
                    matches.put(ch, matches.get(ch) + 1);
                } else {
                    matches.put(ch, 1);
                }
            }
        }

        for (char ch : matches.keySet()) {
            int count = matches.get(ch);
            System.out.println("character " + ch + " matched " + count + " times");
        }

    }

}
