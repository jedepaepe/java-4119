package eu.epfc.c4119.lesson11.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeLoopTest {

    @Test
    public void isValid() {
        Assert.assertTrue(new PalindromeLoop("elle").isValid());
        Assert.assertTrue(new PalindromeLoop("1234321").isValid());
        Assert.assertFalse(new PalindromeLoop("12").isValid());
        Assert.assertFalse(new PalindromeLoop("coucou").isValid());
    }
}