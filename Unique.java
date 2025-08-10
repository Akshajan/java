import java.util.Scanner;
import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!arr.contains(nums[i])) {
                arr.add(nums[i]);
            }
        }
        System.out.println("Unique elements are:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
