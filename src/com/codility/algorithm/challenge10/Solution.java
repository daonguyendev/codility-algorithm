package com.codility.algorithm.challenge10;

class Solution {
    public int solution(String P, String Q) {
        int[] countP = countChars(P);
        int[] countQ = countChars(Q);
        int common = 0;
        int distinct = 0;
        for (int i = 0; i < 26; i++) {
            if (countP[i] > 0 && countQ[i] > 0) {
                common++;
            }
            if (countP[i] > 0 || countQ[i] > 0) {
                distinct++;
            }
        }
        return distinct - common;
    }

    private int[] countChars(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String p = "abc";
        String q = "bcd";
//        =>2
//        String p = "axxz";
//        String q = "yzwy";
        //=>2 wrong
//        String p = "bacad";
//        String q = "abada";
        //=>1
//        String p = "amz";
//        String q = "amz";
//        //=>3 wrong
        System.out.println(sol.solution(p, q));
    }
}

