import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        String al[] = new String[8 * testcase];
        int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int inputYear[] = new int[testcase];
        int inputMonth[] = new int[testcase];
        int inputDays[] = new int[testcase];

        for (int i = 0; i < testcase; i++) {
            al = sc.next().split("", 8);
            inputDays[i] = Integer.valueOf(al[6] + al[7]);
            inputMonth[i] = Integer.valueOf(al[4] + al[5]);
            inputYear[i] = Integer.valueOf(al[0] + al[1] + al[2] + al[3]);
        }

        for (int i = 0; i < testcase; i++) {
            if (inputYear[i] < 1 || inputYear[i] > 9999) {
                System.out.println("#" + (i + 1) + " -1");
            } else if (inputMonth[i] < 1 || inputMonth[i] > 12) {
                System.out.println("#" + (i + 1) + " -1");
            } else if (inputDays[i] > days[inputMonth[i] - 1]) {
                System.out.println("#" + (i + 1) + " -1");
            } else {
                System.out.println("#" + (i + 1) + " " + String.format("%04d", inputYear[i]) + "/"
                        + String.format("%02d", inputMonth[i]) + "/"
                        + String.format("%02d", inputDays[i]));

            }
        }
        sc.close();
    }
}
