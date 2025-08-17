import java.util.Scanner;

public class Scannerx {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = sc.nextDouble(); // 42.5

        System.out.print("Enter name: ");
        String name = sc.nextLine(); // ← OOPS! Reads leftover newline, returns ""

        System.out.println("Price = " + price);
        System.out.println("Name = " + name);
        sc.close();

    }

}
