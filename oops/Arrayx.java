public class Arrayx {
    public static void main(String args[]) {
        int[] arr = new int[5]; // default 0s
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 27;
        arr[3] = -13;
        arr[4] = -267;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Array value at %d is %d\n", i, arr[i]);
        }

        System.out.println("Enhanced for-loop");
        for (int x : arr) {
            System.out.println(x);
        }
    }

}
