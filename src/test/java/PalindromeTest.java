import org.junit.Assert;
import org.junit.Test;
import static com.testdomain.Palindrome.isPalindromeNoStr;
public class PalindromeTest {
    @Test
    public void PalindromeTest() {

//        Assert.assertEquals(isPalindrome(-121),false);
        Assert.assertEquals(isPalindromeNoStr(-121), false);
        Assert.assertEquals(isPalindromeNoStr(123321), true);
        Assert.assertEquals(isPalindromeNoStr(102), false);
        Assert.assertEquals(isPalindromeNoStr(9), true);

    }
}
