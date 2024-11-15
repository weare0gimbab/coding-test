import java.util.Scanner;

//s[i] == s[s.length - i - 1] 스트링 주소를 비교
//s[i].equals(s[s.length - i - 1]) 스트링 값 비교
//문자열 길이는 length() 배열 수는 length
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        String s[] = new String[testcase];

        for (int i = 0; i < testcase; i++) {
            s[i] = sc.nextLine().trim();
        }
        for (int i = 0; i < testcase; i++) {
            System.out.println("#" + (i + 1) + " " + ispa(s[i]));

        }
        sc.close();
    }

    public static int ispa(String s) {
        // Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s.length() / 2; i++) {
            // s = sc.nextLine().split("");
            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                return 1;
            }
        }
        return 0;
    }
}