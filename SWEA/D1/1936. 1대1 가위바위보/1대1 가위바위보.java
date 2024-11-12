import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (Math.abs(A - B) == 1) {
            if (A > B) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else if (Math.abs(A - B) == 2) {
            if (A > B) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
