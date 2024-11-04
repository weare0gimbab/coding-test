import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int K = sc.nextInt();
        int num = 0;
        for (int i = K; i <= P; i++) {
            num++;
        }
        System.out.println(num);
    }
}
