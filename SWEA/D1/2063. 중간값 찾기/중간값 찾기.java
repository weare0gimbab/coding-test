import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Testcase = sc.nextInt();
        sc.nextLine();
        int n[] = new int[Testcase];

        for (int i = 0; i < Testcase; i++) {
            n[i] = sc.nextInt();

        }
        Arrays.sort(n);
        System.out.println(n[Testcase / 2]);
    }
}