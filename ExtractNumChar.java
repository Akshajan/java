import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class ExtractNumChar {
    public static void main(String args[]) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            String a = b.readLine();
            String numberOnly = a.replaceAll("\\D", "");
            if (!numberOnly.isEmpty()) {
                int c = Integer.parseInt(numberOnly);
                System.out.println("Extracted Numbers are: " + c);
            } else {
                System.out.println("No Digits found!");
            }
            String charOnly = a.replaceAll("\\d", "");
            if (!charOnly.isEmpty()) {
                System.out.println("Extracted Characters are: " + charOnly);
            } else {
                System.out.println("No non-digits Found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
