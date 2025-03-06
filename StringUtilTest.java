import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();
    
    @Test
    void testPalindrome() {
        assertTrue(stringUtil.isPalindrome("racecar"));
        assertTrue(stringUtil.isPalindrome("Madam"));
        assertFalse(stringUtil.isPalindrome("hello"));
    }
    
    @Test
    void testEdgeCases() {
        assertTrue(stringUtil.isPalindrome(""));
        assertTrue(stringUtil.isPalindrome("a"));
        assertFalse(stringUtil.isPalindrome(null));
    }
}