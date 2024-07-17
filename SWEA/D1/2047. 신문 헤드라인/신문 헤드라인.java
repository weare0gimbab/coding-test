import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int Testcase = sc.nextInt();

        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char uppercaseChar = Character.toUpperCase(s.charAt(i));
            result.append(uppercaseChar);
        }
        s = result.toString();
        System.out.print(s);
    }
}