public class NthPrime {

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

    // Function to return the nth prime number
    public static Integer nthPrime(int n) {
        if (n < 1) {
            return null;  // No prime for invalid input
        }
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            num++;
        }
        return num - 1;
    }

    // Main method to test
    public static void main(String[] args) {
        int n = 10;  // example: find the 10th prime
        Integer result = nthPrime(n);
        System.out.println(n + "th prime = " + result);
    }
}
