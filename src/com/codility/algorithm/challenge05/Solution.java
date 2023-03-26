package com.codility.algorithm.challenge05;

import java.util.Arrays;
import java.util.Objects;

public class Solution {

    public int solution(String s) {
        int n = s.length();
        String[] sArr = s.split("");
        boolean[] a = new boolean[n+2];
        Arrays.fill(a, false);
        a[0] = true;
        a[n+1] = true;
        int count = 0;

        for(int i = 0 ; i < n; i++) {
            if (Objects.equals(sArr[i], "^")
                    || Objects.equals(sArr[i], "v")) {
                a[i+1]=true;
                count++;
            } else if (Objects.equals(sArr[i], "<") && a[i]) {
                a[i+1]=true;
                count++;
            } else if (Objects.equals(sArr[i], ">") && a[i + 2]) {
                a[i+2]=true;
                a[i+1]=true;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
//        String s = "><^v";//s1
//        String s = "<<^<v>>";//s2
        String s = "><><";//s3
        System.out.println(sol.solution(s));
    }
}
