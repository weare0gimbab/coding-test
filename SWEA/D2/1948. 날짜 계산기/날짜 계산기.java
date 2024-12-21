import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i = 0; i < testcase; i++) {
            int month1 = sc.nextInt();
            int day1 = sc.nextInt();
            int month2 = sc.nextInt();
            int day2 = sc.nextInt();

            System.out.println("#" + (i + 1) + " " + check(month1, day1, month2, day2, days));
        }
        sc.close();
    }

    public static int check(int month1, int day1, int month2, int day2, int days[]) {
        int count = 0;
        int sum = 0;
        if (month1 == month2) {
            count = day2 - day1 + 1;
        } else {
            count = days[month1 - 1] - day1 + 1;
            for (int i = month1; i < month2 - 1; i++) {
                sum += days[i];
            }
            count = sum + count + day2;
        }
        return count;
    }
}
