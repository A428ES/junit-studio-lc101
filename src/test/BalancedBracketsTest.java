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

    @Test public void LaunchCodeSingleBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test public void CodeInsideBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test public void LaunchCodeRightSide(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test public void slackTestOne(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ [ ] ]"));
    }


    @Test
    public void LaunchCodeLeftOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test public void LaunchCodeRightOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(("Launch]Code")));
    }

    @Test public void LeftOpenSingle(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test public void ImproperNest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test public void slackTestTwo(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[ ] ] ["));
    }
}
