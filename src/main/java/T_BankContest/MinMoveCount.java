package T_BankContest;

import java.util.Scanner;

public class MinMoveCount {

    public static void main(String[] args) {
        System.out.println(minimalMoves(getPeopleNumber()));
    }

    public static int minimalMoves(int peopleCount) {
        return peopleCount / 2;
    }

    public static int getPeopleNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
