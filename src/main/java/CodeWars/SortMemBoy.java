package CodeWars;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class SortMemBoy {
    public static void main(String[] args) {

        System.out.println(menFromBoys(new int[] {7, 3, 14, 17}).toString() + "....." + new int[] {14, 17, 7, 3}.toString());
    }

    public static int[] menFromBoys(final int[] values) {
        int[] oddNumbers = Arrays.stream(values).filter(x-> x % 2 != 0).toArray();
        Arrays.sort(oddNumbers);
        int[] evenNumbers = Arrays.stream(values).filter(x-> x % 2 == 0).toArray();
        Arrays.sort(evenNumbers);
        int[] evenNumbersDescSort = new int[evenNumbers.length];
        for (int i = evenNumbersDescSort.length-1, y = 0; i >= 0; i--, y++) {
            evenNumbersDescSort[y] = evenNumbersDescSort[i];
        }
        return IntStream.concat(Arrays.stream(oddNumbers), Arrays.stream(evenNumbersDescSort)).toArray();
    }
}
