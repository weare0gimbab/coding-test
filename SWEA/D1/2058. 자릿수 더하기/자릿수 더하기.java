import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s[] = sc.next().split("");
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum = sum + Integer.parseInt(s[i]);
        }
        System.out.println(sum);
    }

}
