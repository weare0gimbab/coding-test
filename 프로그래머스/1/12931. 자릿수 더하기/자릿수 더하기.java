import java.util.*;
import java.io.*;

class Solution {
       public int solution(int n) {
        String str = String.valueOf(n);
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
}}