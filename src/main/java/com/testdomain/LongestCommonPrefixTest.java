package com.testdomain;
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

/*
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
*/

/*
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

import org.junit.Assert;
import org.junit.Test;

// Constraints:
// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters.
public class LongestCommonPrefixTest {

    @Test
    public void PrefixTest() {
        Assert.assertEquals(
                LongestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");
        Assert.assertEquals(
                LongestCommonPrefix(new String[]{"dog","racecar","car"}),"");
    }

    private String LongestCommonPrefix(String[] strings) {
        return "";
    }
}

