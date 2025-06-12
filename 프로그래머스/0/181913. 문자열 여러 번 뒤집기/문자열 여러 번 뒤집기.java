import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        // queries의 크기는 my_string의 길이보다 작거나 같아야 함
        int[][] queries = new int[my_string.length()][2];
        for (int i = 0; i < my_string.length(); i++) {
            String[] input = br.readLine().split(" ");
            queries[i] = new int[] { Integer.parseInt(input[0]), Integer.parseInt(input[1]) };
        }
        String result = sol.solution(my_string, queries);
        System.out.println(result);
    }

    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] a = new char[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            a[i] = my_string.charAt(i);
        }
        for (int i = 0; i < queries.length; i++) {
            // queries[i][0]와 queries[i][1]의 값을 바꿔서 a배열에서 해당 범위의 문자를 뒤집는다.
            int start = queries[i][0];
            int end = queries[i][1];
            while (start < end) {
                char temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            answer += a[i];
        }
        return answer;
    }
}