import java.util.Arrays;
import java.util.Scanner;
//난왜 포문을 두개씩 쓰고 배열에 넣어서 어렵게 생각하나
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            // for (int j = 1; j <= i; j++) {
            // if (n % j == 0) {
            // arr[j - 1] = j;
            // }
            // }
        }
        // int newArr[] = Arrays.stream(arr).distinct().toArray();
        // for (int i = 0; i < newArr.length; i++) {
        // System.out.print(newArr[i] + " ");
        // }
        sc.close();
    }
}
