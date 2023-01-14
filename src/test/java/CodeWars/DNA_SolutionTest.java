package CodeWars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNA_SolutionTest {

    private DNA_Solution testSolution;
    @Test
    @DisplayName("Should true if two strings are equal")
    void testRecombinator() {
        testSolution = new DNA_Solution();
        boolean status = testSolution.recombinator("AAAA").equals("TTTT");
        Assertions.assertTrue(status);
    }
}