import java.util.Scanner;

class Fib {
    public int series(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return series(n - 1) + series(n - 2);
        }
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        Fib f = new Fib();

        for (int i = 0; i <= n; i++) {
            System.out.println(f.series(i) + " ");
        }
        sc.close();
    }
}
