package eu.epfc.c4119.lesson11.palindrome;

public class PalindromeLoop implements IPalindrome {
    private final String value;

    public PalindromeLoop(String value) {
        this.value = value;
    }

    @Override
    public boolean isValid() {
        for (int i = 0; i < value.length() / 2; ++i) {
            if (value.charAt(i) != value.charAt(value.length() - 1 -i)) return false;
        }
        return true;
    }
}
