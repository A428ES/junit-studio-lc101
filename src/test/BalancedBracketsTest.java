package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.BalancedBrackets;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void emptyString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test public void noBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test public void launchCodeSingleBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test public void codeInsideBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test public void launchCodeRightSide(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test public void slackTestOne(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ [ ] ]"));
    }


    @Test
    public void launchCodeLeftOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test public void launchCodeRightOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(("Launch]Code")));
    }

    @Test public void leftOpenSingle(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test public void improperNest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test public void slackTestTwo(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[ ] ] ["));
    }
}
