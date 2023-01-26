package CodeWars;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class SortMemBoy {
    public static void main(String[] args) {

    }

    public static int[] menFromBoys(final int[] values) {
        int[] oddNumbers = Arrays.stream(values).filter(x-> x % 2 != 0).toArray();
        Arrays.sort(oddNumbers);
        int[] evenNumbers = Arrays.stream(values).filter(x-> x % 2 == 0).toArray();
        Arrays.sort(evenNumbers);
        return null;// mock
    }
}
