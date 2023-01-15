package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LostSheep_SolutionTest {
    private LostSheep_Solution testSolution;
    @Test
    void testLostSheep() {
         testSolution = new LostSheep_Solution();
         assertEquals(2,testSolution.lostSheep(new int[]{4, 5, 6}, new int[] {6, 8, 5}, 36));
         assertEquals(0,testSolution.lostSheep(new int[]{4, 5, 6}, new int[] {10, 2, 3}, 30));

    }
}