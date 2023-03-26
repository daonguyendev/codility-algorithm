package com.codility.algorithm.challenge08;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        int result = 0;
        Arrays.sort(A);

        int B[] = new int[A.length];
        int idx = 0;
        B[0] = A[0];
        int tempB = 1;

        for (int i = 1; i < N; i++) {
            if (A[i] == B[idx]) {
                tempB++;
            } else {
                result = Math.max(result, tempB);
                tempB = 1;
                idx++;
                B[idx] = A[i];
            }
        }

        result = Math.max(result, tempB);
        N = idx+1;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int jump = B[j] - B[i];
                int count = 1;

                for (int k = j+1; k < N; k++) {
                    int temp = B[k] - B[i];
                    if ((temp % jump == 0) && (temp / jump == (count+1))) {
                        count++;
                    }
                }
                result = Math.max(result, count+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
//        int[] arr = new int[]{4,7,1,5,3};
//        int[] arr = new int[]{12,12,12,15,10};
//        int[] arr = new int[]{18,26,18,24,24,20,22};
        int[] arr = new int[]{10,10};

//        int[] arr = new int[2];
//        for (int i = 0; i < 2; i++) {
//            int rand = (int)(Math.random() * 50) + 1;
//            arr[i] = rand;
//            System.out.println(arr[i]);
//        }
//        arr[1]=arr[0];
        System.out.println(sol.solution(arr));
    }
}
