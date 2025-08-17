import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Use HashSet to store unique characters
        Set<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ') { // skip spaces
                uniqueChars.add(ch);
            }
        }

        System.out.println("Unique characters are: ");

        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}
