public class Prime {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Only need to check up to num/2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print prime numbers in a range
    public static void printPrimesInRange(int low, int high) {
        System.out.println("Prime numbers between " + low + " and " + high + ":");
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.print(i + (i <= high ? " " : ""));
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int low = 10;
        int high = 50;
        printPrimesInRange(low, high);
    }
}