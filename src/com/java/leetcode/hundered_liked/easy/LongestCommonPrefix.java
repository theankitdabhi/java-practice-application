package com.java.leetcode.hundered_liked.easy;


public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] value = {"sdcv", "sd", "sdf", "sdc"};
        String s = longestCommonPrefix(value);
        System.out.println(s);
    }

    private static String longestCommonPrefix(String[] strs) {
        String st = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(st) != 0) {
                st = st.substring(0, st.length() - 1);
            }
        }
        return st;
    }
}

/*
Return Longest common prefix from array of String
e.g : {"flower","flow","flight}
output : "fl"
explanation : In Below example we can see the output is "fl" because "flow" prefix occurred two times
and "flo" prefix occurred and "fl" occurred three times which is the highest occurrence.
 */
