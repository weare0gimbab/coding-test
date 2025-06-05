import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            int b = (int) a.charAt(i);
            if (b > 64 & b < 91) {
                System.out.print(Character.toLowerCase(a.charAt(i)));
            } else
                System.out.print(Character.toUpperCase(a.charAt(i)));
        }

    }
}