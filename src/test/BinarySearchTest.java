package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;
import main.BalancedBrackets;

public class BinarySearchTest {
    @Test
    public void firstArr(){
        assertEquals(BonusBinarySearch.binarySearch(new int[]{0,5,9,15,64}, 15), 3);
    }

    @Test
    public void secondArr(){
        assertFalse(BonusBinarySearch.binarySearch(new int[]{2, 3, 6, 7}, 6) == 1);
    }

    @Test
    public void notFound(){
        assertEquals(BonusBinarySearch.binarySearch(new int[]{2, 3, 6, 7, 10}, 100), -1);
    }

    @Test
    public void notFoundAgain(){
        assertEquals(BonusBinarySearch.binarySearch(new int[]{2, 3, 6, 7, 10, 12}, 11), -1);
    }

    @Test
    public void thirdArr(){
        assertFalse(BonusBinarySearch.binarySearch(new int[]{24, 36, 66, 77}, 66) == 0);
    }

    @Test
    public void fourthArr(){
        assertTrue(BonusBinarySearch.binarySearch(new int[]{24, 36, 66, 77}, 66) == 2);
    }

}
