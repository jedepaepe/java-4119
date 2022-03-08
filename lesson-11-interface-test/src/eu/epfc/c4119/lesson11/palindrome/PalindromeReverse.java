package eu.epfc.c4119.lesson11.palindrome;

public class PalindromeReverse implements IPalindrome {
    private final String value;

    public PalindromeReverse(String value) {
        this.value = value;
    }

    @Override
    public boolean isValid() {
        String reverse = new StringBuilder(value).reverse().toString();
        return value.equals(reverse);
    }

    public String getValue() {
        return value;
    }
}
