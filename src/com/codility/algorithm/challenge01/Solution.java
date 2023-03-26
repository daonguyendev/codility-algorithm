package com.codility.algorithm.challenge01;

import java.util.Arrays;

//Find the smallest integer number in array
public class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);

        int smallest = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) {
                smallest++;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -1, 0, 1, 3, 5, 6};
        int smallestNumber = new Solution().solution(arr);
        System.out.println(smallestNumber);
    }
}