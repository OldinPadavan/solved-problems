package T_BankContest;

import java.util.Scanner;

public class DiseaseOccupation_Solution {

    public static void main(String[] args) {
        System.out.println(diseaseCount(getNumber()));
    }

    public static int getNumber () {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 0;
        }
    }

    public static int diseaseCount (int past_minutes) {
        int diseaseNumbers = 0;
        if (past_minutes < 2) {
            diseaseNumbers = 1;
            return diseaseNumbers;
        } else {
            for (int i = 2; i <=past_minutes; i++) {
                diseaseNumbers += 4;
            }
            return diseaseNumbers;
        }
    }
}
