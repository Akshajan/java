/* accepting a sequence of characters in a single in a 
space separated format ie[a k s h a j a n] 
and comparing with a i/p char to find it's count in the given sequence  
*/


import java.util.Scanner;

public class CharCount2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the string: ");
        String[] s = sc.nextLine().trim().split(" ");
        System.out.println("enter the char: ");
        String ch = sc.next();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s[i].equals(ch)) {
                count += 1;
            }
        }

        System.out.println("The character " + ch + " occurs in the string " + count + " times");
        sc.close();
    }
}
