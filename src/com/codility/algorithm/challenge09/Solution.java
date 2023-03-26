package com.codility.algorithm.challenge09;

public class Solution {

    public int solution(int[] A) {
        int N = A.length;
        int res = 0;
        for (int i = 0; i < N; i++) A[i] %= 2;
        int[] B = new int[A.length];
        B[0] = 1;
        int idx = 0;
        for (int i = 1; i < N; i++) {
            if (A[i] == A[i - 1]) {
                B[idx]++;
            } else {
                idx++;
                B[idx]=1;
            }
        }
        for (int i = 0; i <= idx; i++) {
            res += B[i] / 2;
            B[i] %= 2;
        }
        if (A[0] == A[N - 1] && B[0] == 1 && B[idx] == 1) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
//        int[] A = {14, 21, 16, 35, 22};//return 1
        int[] A = {4,2,5,8,7,3,7};//return 2
        System.out.println(sol.solution(A));
    }
}
