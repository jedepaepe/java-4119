package eu.epfc.c4119.lesson11.palindrome;

public class PalindromeOptimized implements IPalindrome {
    private final boolean isValid;

    public PalindromeOptimized(String value) {
        String reverse = new StringBuilder(value).reverse().toString();
        this.isValid = value.equals(reverse);
    }

    @Override
    public boolean isValid() {
        return isValid;
    }
}
