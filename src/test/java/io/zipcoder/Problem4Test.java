package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {

    @Test
    public void potentialPalindromeTest() {
        //given
        String input = "aaabbbb";

        //when
        String actual = Problem4.palindromeCheck(input);
        //then
        String expected = "YES";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void potentialPalindromeTestTwo() {
        //given
        String input = "cdefghmnopqrstuvw";

        //when
        String actual = Problem4.palindromeCheck(input);
        //then
        String expected = "NO";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void potentialPalindromeTestThree() {
        //given
        String input = "cdcdcdcdeeeef";
        //when
        String actual = Problem4.palindromeCheck(input);
        //then
        String expected = "YES";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void potentialPalindromeTestFour() {
        //given
        String input = "aabbaaaccc";

        //when
        String actual = Problem4.palindromeCheck(input);
        //then
        String expected = "NO";
        Assert.assertEquals(actual, expected);
    }

}

