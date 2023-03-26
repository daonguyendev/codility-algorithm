package com.codility.algorithm.challenge07;

class Solution {
    public int solution(int[] D, int X) {
        int N = D.length;
        int minD = D[0];
        int maxD = D[0];
        int count = 1;

        for (int i = 1; i < N; i++) {
            if (Math.abs(D[i]-minD) <= X && Math.abs(D[i]-maxD) <= X) {
                if (D[i] > maxD) {
                    maxD = D[i];
                } else if(D[i] < minD) {
                    minD = D[i];
                }
            } else {
                minD = D[i];
                maxD = D[i];
                count++;
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] arr = new int[]{5,8,2,7};
//        int X = 3;
//
////        int[] arr = new int[]{2,5,9,2,1,4};
////        int X = 4;
//
////        int[] arr = new int[]{1,12,10,4,5,2};
////        int X = 2;
//        System.out.println(sol.solution(arr, X));
//    }
}
