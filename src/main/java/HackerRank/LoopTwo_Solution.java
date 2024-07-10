package HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Basic information about task taken from here
// https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
public class LoopTwo_Solution {
    public static void main(String[] args) {
        int q = numScanner();
        Integer[] numbers = null;
        if (q >=0 & q <= 500) {
            for (int i = 0; i < q; i++) {
                 numbers = num_seq_Scanner().toArray(new Integer[0]);
            }
            for (Integer integer : numbers) {
                System.out.print(integer + " ");
            }

        }
    }

    public static List<Integer> num_seq_Scanner() {
        Scanner scanner = new Scanner(System.in);
        List<Integer>inputNumbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            inputNumbers.add(scanner.nextInt());
        }
        scanner.close();
        return inputNumbers;
    }

    public static int numScanner() {
        return new Scanner(System.in).nextInt();
    }
}
