package com.codility.algorithm.challenge04;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] a) {
        int n = a.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int count = 0;

        for (int i = 0 ; i < n; i++) {
            if(mp.containsKey(a[i])) {
                mp.put(a[i], mp.get(a[i])+1);
            } else {
                mp.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            count = count + Math.min(Math.abs(value - key), value);
        }
        return count;
    }

//    public static void main(String[] args) {
//        Solution sol = new Solution();
////        int[] array = new int[]{1,1,3,4,4,4};
////        int[] array = new int[]{1,2,2,2,5,5,5,8};
//        int[] array = new int[]{1,1,1,1,3,3,4,4,4,4,4};
//        System.out.println(sol.solution(array));
//    }
}
