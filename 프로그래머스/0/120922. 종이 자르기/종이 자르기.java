import java.util.*;
import java.io.*;

class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        answer = M * N - 1;
        return answer;
    }



    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(5, 2));
    }
}
