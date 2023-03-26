package com.codility.algorithm.challenge02;

import java.lang.Math;

class Solution {

    public int calculate_alternating_mask(int value) {
        int binary_index = (int) Math.ceil(Math.log(value) / Math.log(2));
        int alternating_mask = (int) Math.pow(2, binary_index) - 1;
        int zero_bit = 1;

        while (binary_index >= 0) {
            if (zero_bit == 1) {
                alternating_mask -= Math.pow(2, binary_index);
            }

            zero_bit ^= 1;
            binary_index -= 1;
        }

        return alternating_mask;
    }

    public int solution(int N) {
        if (N <= 2) {
            return N;
        }

        return N & calculate_alternating_mask(N);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(26);
        System.out.println(result);
    }
}

