package eu.epfc.c4119.lesson11.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeReverseTest {

    @Test
    public void isValid() {
        Assert.assertTrue(new PalindromeReverse("elle").isValid());
        Assert.assertTrue(new PalindromeReverse("1234321").isValid());
        Assert.assertFalse(new PalindromeReverse("12").isValid());
        Assert.assertFalse(new PalindromeReverse("coucou").isValid());
    }
}