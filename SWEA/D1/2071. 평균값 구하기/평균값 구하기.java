import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Testcase = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < Testcase; i++) {
            int[] num = new int[10];
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                num[j] = sc.nextInt();
                sum += num[j];
            }
            System.out.println("#" + (i + 1) + " " + Math.round(sum / 10.0));
        }

    }
}