package CodeWars;
/*This task about:
* 1) separate input array to two different arrays: odd and even values
* 2) after that should sort values (odd in asc, even in desc)
* 3) delete all duplicates
* 4) concat two arrays, odds should be first part*/
import java.util.Arrays;
import java.util.stream.IntStream;

public class SortMemBoy {
    public static void main(String[] args) {

        System.out.println(menFromBoys(new int[] {7, 3, 14, 17}).toString() + "....." + new int[] {14, 17, 7, 3}.toString());
    }

    public static int[] menFromBoys(final int[] values) {
        int[] oddNumbers =Arrays.stream(Arrays.stream(values).filter(x-> x % 2 != 0).toArray()).distinct().toArray();
        Arrays.sort(oddNumbers);
        int[] evenNumbers = Arrays.stream(Arrays.stream(values).filter(x-> x % 2 == 0).toArray()).distinct().toArray();
        Arrays.sort(evenNumbers);
        int[] evenNumbersDescSort = new int[evenNumbers.length];
        for (int i = evenNumbersDescSort.length-1, y = 0; i >= 0; i--, y++) {
            evenNumbersDescSort[y] = evenNumbersDescSort[i];
        }
        return IntStream.concat(Arrays.stream(evenNumbers), Arrays.stream(reversArray(oddNumbers))).toArray();
    }

    public static int[] reversArray(int[] inputArray) {
        int[] returnedArray = new int[inputArray.length];
        for (int i = returnedArray.length - 1, y = 0; i >= 0; i--, y++) {
            returnedArray[y] = inputArray[i];
        }
        return returnedArray;
    }
}
