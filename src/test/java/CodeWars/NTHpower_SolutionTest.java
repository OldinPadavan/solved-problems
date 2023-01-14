package CodeWars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NTHpower_SolutionTest {

    @Test
    @DisplayName("should return difference between sum of each array element in pow, and simple sum of each array element")
    void testModifiedSum() {
        assertEquals(38, NTHpower_Solution.modifiedSum(new int[]{3, 4, 5}, 2));
        assertEquals(270, NTHpower_Solution.modifiedSum(new int[]{1, 2, 3}, 5));
    }
}