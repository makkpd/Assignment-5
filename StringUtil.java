public class StringUtil {
    public boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}