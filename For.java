public class For {
    public static void main(String a[]) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Day " + i);
            for (int j = 0; j <= 3; j++) {
                System.out.println("    " + (j + 9) + "  -  " + (j + 10));
            }
        }
    }

}
