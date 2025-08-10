import java.util.Scanner;

class Pandc1 {
    public void fact(int n1, int n2) {
        int pr = 1, cb = 1, dif_fact = 1, fact1 = 1, fact2 = 1, dif_num = 0, i;

        /* factorial of n1 */
        if (n1 == 0) {
            fact1 = 1;
        } else {
            for (i = 1; i <= n1; i++) {
                fact1 *= i;
            }
        }

        /* factorial of difference in numbers */
        dif_num = n1 - n2;
        if (dif_num == 0) {
            dif_fact = 1;
        } else {
            for (i = 1; i <= dif_num; i++) {
                dif_fact *= i;
            }
        }

        /* factorial of n2 */
        if (n2 == 0) {
            fact2 = 1;
        } else {
            for (i = 1; i <= n2; i++) {
                fact2 *= i;
            }
        }

        pr = fact1 / dif_fact;

        cb = pr / fact2;

        System.out.print("Permutation of Given 2 numbers is n1Pn2= " + pr);

        System.out.print("\nCombination of Given 2 numbers is n1Cn2= " + cb);

    }
}

public class Pandc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Number 2: ");
        int n2 = sc.nextInt();
        Pandc1 r = new Pandc1();
        r.fact(n1, n2);
        sc.close();
        ;
    }
}