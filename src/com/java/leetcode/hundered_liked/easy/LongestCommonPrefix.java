package com.java.leetcode.hundered_liked.easy;

/**
 * Return Longest common prefix from array of String
 * e.g : {"flower","flow","flight}
 * Output : "fl"
 * Explanation : In Below example we can see the output is "fl" because "flow" prefix occurred two times
 * and "flo" prefix occurred and "fl" occurred three times which is the highest occurrence.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        //TODO: Not Working for  different input
        String[] listOfNames = {"ankit", "aniket", "ankur", "akshay"};
        String longestCommonPrefix = longestCommonPrefix(listOfNames);
        System.out.println(longestCommonPrefix);
    }

    private static String longestCommonPrefix(String[] listOfNames) {
        String name = listOfNames[0];
        for (int counter = 1; counter < listOfNames.length; counter++) {
            while (listOfNames[counter].indexOf(name) != 0) {
                name = name.substring(0, name.length() - 1);
            }
        }
        return name;
    }
}
