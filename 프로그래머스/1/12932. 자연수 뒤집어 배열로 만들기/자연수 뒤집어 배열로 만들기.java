import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - i - 1) - '0';
        }
        return answer;
    }
}
