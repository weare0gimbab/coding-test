import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String N = "";
        while (true) {// 0이 입력되면
            N = sc.nextLine();
            if (N.equals("0")) {
                break;
            }
            checkpalindrop(N);
        }

    }

    public static void checkpalindrop(String N) {
        int check = 0;

        for (int i = 0; i < N.length() / 2; i++) {
            if (N.charAt(i) == N.charAt(N.length() - 1 - i)) {
                check++;
            } else {
                check = 0;
            }
        }
        if (N.charAt(0) == '0') {
            System.out.println("no");
        }
        else if (check == N.length() / 2) {
            System.out.println("yes");
        } else
            System.out.println("no");

    }

    public static void saveArray(int arr[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

}
