package CodeWars;

import java.util.Arrays;

public class LostSheep_Solution {
    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {
        return Math.abs(Arrays.stream(fridayNightCounting).sum() + Arrays.stream(saturdayNightCounting).sum() - sheepTotal);
    }
}
