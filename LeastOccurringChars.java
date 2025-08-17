import java.util.*;

public class LeastOccurringChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Step 1: Count frequency of each character
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') { // ignore spaces (optional)
                if (freq.containsKey(ch)) {
                    freq.put(ch, freq.get(ch) + 1);
                } else {
                    freq.put(ch, 1);
                }
            }
        }

        // Step 2: Find minimum frequency
        int minFreq = Collections.min(freq.values());

        // Step 3: Collect characters with that min frequency
        System.out.println("Least occurring character(s):");
        for (char ch : freq.keySet()) {
            if (freq.get(ch) == minFreq) {
                System.out.println(ch + " -> " + freq.get(ch) + " time(s)");
            }
        }
    }
}
