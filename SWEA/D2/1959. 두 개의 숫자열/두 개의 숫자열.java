import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        // java.lang.ArrayIndexOutOfBoundsException

        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int a[] = new int[N];
            int b[] = new int[K];
            saveArray(sc, a, N);
            saveArray(sc, b, K);
            System.out.println("#" + (i + 1) + " " + check(a, b, N, K));
        }
    }

    public static void saveArray(Scanner sc, int arr[], int N) {
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int check(int a[], int b[], int N, int K) {
        int max = 0;
        int lLen = 0;
        if (N < K) {
            lLen = K - N + 1;
            for (int i = 0; i < lLen; i++) {
                int sum = 0;
                for (int j = 0; j < N; j++) {
                    int mul = a[j] * b[j + i];
                    sum += mul;
                }
                if (sum > max) {
                    max = sum;
                }
            }
        } else {
            lLen = N - K + 1;
            for (int i = 0; i < lLen; i++) {
                int sum = 0;
                for (int j = 0; j < K; j++) {
                    int mul = a[j + i] * b[j];
                    sum += mul;
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }
}
