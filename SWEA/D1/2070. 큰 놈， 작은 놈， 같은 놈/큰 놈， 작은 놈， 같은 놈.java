
// import java.util.Scanner;
import java.util.*;

class Solution {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);

    int Testcases = sc.nextInt();

    for (int i = 0; i < Testcases; i++) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      String res = "";

      if (n > m)
        res = ">";
      else if (n < m)
        res = "<";
      else
        res = "=";

      System.out.println("#" + (i + 1) + " " + res);
    }
    sc.close();
  }
}