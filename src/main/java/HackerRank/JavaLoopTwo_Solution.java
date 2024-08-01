package HackerRank;

//Task link: https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaLoopTwo_Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loopCount = scanner.nextInt();
        for (int i = 0; i < loopCount; i++) {
            int [] numberSeq = getNumberSeq();
            calcNumberSeq(numberSeq);
        }
    }

    public static int [] getNumberSeq() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> newSeq = new ArrayList<>();
        while (scanner.hasNextInt()) {
            newSeq.add(scanner.nextInt());
        }
        scanner.close();
        return newSeq.stream().mapToInt(i -> i).toArray();
    }

    public static void calcNumberSeq(int[] numberSeq) {
        int startValue = (numberSeq[0] + 1) * numberSeq[1];
        for (int i = 1; i <= numberSeq.length; i++) {
            System.out.print(startValue + " ");
            startValue += Math.pow(numberSeq[i], i);
        }
        System.out.print(startValue);
        System.out.println();
    }



}
