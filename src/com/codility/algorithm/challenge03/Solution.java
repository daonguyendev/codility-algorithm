package com.codility.algorithm.challenge03;

import java.util.Arrays;

class Solution {
//    public int solution(int[] A) {
//        int n = A.length;
//        int minMoves = Integer.MAX_VALUE;
//
//        // Sort the input array
//        Arrays.sort(A);
//
//        // Iterate through all possible values of X
//        for (int x = 1; x <= n; x++) {
//            int count = 0;
//            int i = 0;
//            int j = n-1;
//
//            // Count the number of moves required to achieve an array in which
//            // all values that are present occur exactly X times
//            while (i < j) {
//                if (A[i] + A[j] == 2*x) {
//                    i++;
//                    j--;
//                } else if (A[i] + A[j] < 2*x) {
//                    int k = Arrays.binarySearch(A, i+1, j, x-1);
//                    if (k >= 0) {
//                        i = k+1;
//                    } else {
//                        k = -k-1;
//                        count++;
//                        A = insert(A, k, x-1);
//                        i++;
//                        j++;
//                    }
//                } else {
//                    int k = Arrays.binarySearch(A, i, j-1, x-1);
//                    if (k >= 0) {
//                        j = k-1;
//                    } else {
//                        k = -k-1;
//                        count++;
//                        A = insert(A, k, x-1);
//                        i++;
//                        j++;
//                    }
//                }
//            }
//
//            // Handle the case where i == j
//            if (i == j) {
//                if (A[i] == x-1) {
//                    // Do nothing
//                } else {
//                    count++;
//                    A = insert(A, i, x-1);
//                }
//            }
//
//            // Update the minimum number of moves required
//            minMoves = Math.min(minMoves, count);
//        }
//
//        return minMoves;
//    }
//
//        // Helper method to insert an element into an array at a given index
//    private int[] insert(int[] arr, int index, int value) {
//        int[] result = new int[arr.length+1];
//        System.arraycopy(arr, 0, result, 0, index);
//        result[index] = value;
//        System.arraycopy(arr, index, result, index+1, arr.length-index);
//        return result;
//    }

    public int solution(int[] A) {
        int n = A.length;
        int minMoves = Integer.MAX_VALUE;

        // Sort the input array
        Arrays.sort(A);

        // Iterate through all possible values of X
        for (int x = 1; x <= n; x++) {
            int count = 0;
            int i = 0;
            int j = n-1;

            // Count the number of moves required to achieve an array in which
            // all values that are present occur exactly X times
            while (i < j) {
                if (A[i] + A[j] == 2*x) {
                    i++;
                    j--;
                } else if (A[i] + A[j] < 2*x) {
                    int k = Arrays.binarySearch(A, i+1, j, x-1);
                    if (k >= 0) {
                        i = k+1;
                    } else {
                        k = -k-1;
                        count++;
                        A = insert(A, k, x-1);
                        i++;
                        j++;
                    }
                } else {
                    int k = Arrays.binarySearch(A, i, j-1, x-1);
                    if (k >= 0) {
                        j = k-1;
                    } else {
                        k = -k-1;
                        count++;
                        A = insert(A, k, x-1);
                        i++;
                        j++;
                    }
                }
            }

            // Handle the case where i == j
            if (i == j) {
                if (A[i] == x-1) {
                    // Do nothing
                } else {
                    count++;
                    A = insert(A, i, x-1);
                }
            }

            // Update the minimum number of moves required
            minMoves = Math.min(minMoves, count);
        }

        return minMoves;
    }

    // Helper method to insert an element into an array at a given index
    private int[] insert(int[] arr, int index, int value) {
        int[] result = new int[arr.length+1];
        System.arraycopy(arr, 0, result, 0, index);
        result[index] = value;
        System.arraycopy(arr, index, result, index+1, arr.length-index);
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = new int[]{1,1,3,4,4,4};
        System.out.println(sol.solution(array));
    }

}
