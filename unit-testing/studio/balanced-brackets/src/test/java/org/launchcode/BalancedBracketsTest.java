package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //TODO: Test empty string
    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }
    //TODO: Test string without brackets
    @Test
    public void stringWithoutBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
    //TODO: Test balanced brackets in front of other characters - "[]LaunchCode"
    @Test
    public void balancedBracketsInFrontReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    //TODO: Test balanced brackets around other characters - "[Launchcode]"
    @Test
    public void balancedBracketsAroundOtherCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    //TODO: Test balanced brackets within other characters - "Launch[code]"
    @Test
    public void balancedBracketsWithinCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
    }
    //TODO: Test multiple consecutive pairs of balanced brackets - "[][]"
    @Test
    public void consecutiveBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    //TODO: Test multiple nested balanced brackets - "[[[]]]"
    @Test
    public void multipleNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    //TODO: Test single opening bracket - "["
    @Test
    public void singleOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    //TODO: Test single closing bracket - "]"
    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    //TODO: Test reversed bracket - "]["
    @Test
    public void reversedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //TODO: Test single bracket with other characters - "[LaunchCode"
    @Test
    public void singleBracketWithOtherCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    //TODO: Test unbalanced brackets among other characters - "Launch]Code["
    @Test
    public void unbalancedBracketsAmongOtherCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    //TODO: Test a series of mixed, unbalanced brackets - "[[]][]["
    @Test
    public void mixedUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]][]["));
    }
}