package com.codewithtejas.random;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromStringTest {

    @Test
    public void removeDuplicatesInWordTest() {
        String text = "hello";
        String modifiedTest = RemoveDuplicatesFromString.removeDuplicatesInWord(text);
        Assert.assertEquals("helo", modifiedTest);
    }

    @Test
    public void removeDuplicatesInWordTestAnother() {
        String text = "AAAaaaBBbbCc   ";
        String modifiedTest = RemoveDuplicatesFromString.removeDuplicatesInWord(text);
        Assert.assertEquals("AaBbCc ", modifiedTest);
    }
}
