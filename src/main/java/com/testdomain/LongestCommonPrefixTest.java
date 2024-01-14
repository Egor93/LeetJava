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
                LongestCommonPrefix(new String[]{"flower", "flow", "floght"}), "flo");
        Assert.assertEquals(
                LongestCommonPrefix(new String[]{"dog", "racecar", "car"}), "");
    }

    private String LongestCommonPrefix(String[] strings) {
        String prefix = "";
        //iterate over all words in array
        for (int charIndex = 0; charIndex < 200; charIndex++) {
            String prefixTemp = ""+strings[0].charAt(charIndex);
            System.out.println(prefix);
            for (int wordIndex = 1;wordIndex<strings.length;wordIndex++){
                try {
                    char NthChar = strings[wordIndex].charAt(charIndex);
                    char NthCharPrev = strings[wordIndex-1].charAt(charIndex);
                    if (NthChar!=NthCharPrev){
                        return prefix;
                    }
                    System.out.println(NthChar);
                } catch (Exception e){
                    System.out.println("Exception"+e);
                    return prefix;
                }
            }
            prefix+=prefixTemp;
        }
        //in each array iterate over characters
        //set tempPrefix to the array[0][0]
        //if tempPrefix is constant append it to the prefix
        //if not return
        return "";
    }
}

