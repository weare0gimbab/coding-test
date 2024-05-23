
// import java.util.Scanner;
import java.util.*;

class Solution {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int sum = 0;
    int n[] = new int[10];

    for (int j = 0; j < m; j++) {
      for (int i = 0; i < 10; i++) {
        n[i] = sc.nextInt();
        if (n[i] % 2 == 1) {
          sum += n[i];
        }
      }
      System.out.println("#" + (j + 1) + " " + sum);
      n = new int[10];
      sum = 0;
    }

    sc.close();
  }
}