import java.util.*;

public class Balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input colors
        String[] colors = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the color " + (i + 1) + ": ");
            colors[i] = sc.nextLine().trim();
        }

        // Frequency map
        Map<String, Integer> freq = new HashMap<>();
        for (String color : colors) {
            if (freq.containsKey(color)) {
                freq.put(color, freq.get(color) + 1);
            } else {
                freq.put(color, 1);
            }
            
        }

        // Print map (like Python dict)
        System.out.println(freq);

        // Find first odd frequency
        boolean found = false;
        for (String key : freq.keySet()) {
            if (freq.get(key) % 2 != 0) {
                System.out.println(key + " count is " + freq.get(key));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("All are even");
        }
    }
}
