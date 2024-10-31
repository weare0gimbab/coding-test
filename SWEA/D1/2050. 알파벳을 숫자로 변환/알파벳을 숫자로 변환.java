import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s[] = sc.next().split("");

        for (int i = 0; i < s.length; i++) {
            int num = (int) s[i].charAt(0) - 64;
            System.out.print(num + " ");

        }
    }

}
