package src;

import org.junit.Test;
import org.junit.Assert;
import org.openjdk.jmh.annotations.Benchmark;

import java.util.ArrayList;
import java.util.List;


public class Palindrome {
    public boolean isPalindrome(int x) {

        String Input = String.valueOf(x);
        int n = Input.length();
        for (int i = 0; i < n / 2; i++) {
            if (Input.charAt(i) != Input.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int findNofDigits(int x) {
        if (x == 0) {
            return 0;
        } else if (x < 0) {
            return (int) (Math.log10(x * -1)) + 1;
        } else {
            return (int) (Math.log10(x)) + 1;
        }
    }

    public boolean isPalindromeNoStr(int x) {
        if (x <= 0) {
            return false;
        }
        int Ndigits = findNofDigits(x);
        if (Ndigits == 1) {
            return true;
        } else {
            int[] ilist = new int[Ndigits];
            for (int dIndex = 0; dIndex < Ndigits; dIndex++) {
                ilist[dIndex] = x % 10;
                x = x / 10;
            }
            for (int i = 0; i < Ndigits / 2; i++) {
                if (ilist[i] != ilist[Ndigits - 1 - i]) {
                    return false;
                }
            }
        }
        return true;
    }


    @Test
    public void PalindromeTest() {

//        Assert.assertEquals(isPalindrome(-121),false);
        Assert.assertEquals(isPalindromeNoStr(-121), false);
        Assert.assertEquals(isPalindromeNoStr(123321), true);
        Assert.assertEquals(isPalindromeNoStr(102), false);
        Assert.assertEquals(isPalindromeNoStr(9), true);

    }
}
