import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Testcase = sc.nextInt();
        int sum[] = new int[10];
        for (int j = 0; j < Testcase; j++) {
            int N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                if (i % 2 != 0) {
                    sum[j] = i + sum[j];
                } else {
                    sum[j] = sum[j] - i;
                }
            }
        }
        for (int i = 0; i < Testcase; i++) {
            System.out.println("#" + (i + 1) + " " + sum[i]);
        }

    }
}
