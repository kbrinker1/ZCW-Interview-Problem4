package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {

    @Test
    public void potentialAnagramTest() {
        //given
        String input = "aaabbbb";

        //when
        String actual = Problem4.anagramCheck(input);
        //then
        String expected = "YES";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void potentialAnagramTestTwo() {
        //given
        String input = "cdefghmnopqrstuvw";

        //when
        String actual = Problem4.anagramCheck(input);
        //then
        String expected = "NO";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void potentialAnagramTestThree() {
        //given
        String input = "cdcdcdcdeeeef";
        //when
        String actual = Problem4.anagramCheck(input);
        //then
        String expected = "YES";
        Assert.assertEquals(actual, expected);
    }

}

