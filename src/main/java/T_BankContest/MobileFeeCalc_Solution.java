package T_BankContest;

import java.util.List;
import java.util.Scanner;

public class MobileFeeCalc_Solution {
    public static void main(String[] args) {
        System.out.println(calculateMobileLink(getNumberArray()));
    }

    public static int calculateMobileLink(int[] mobileParams) {

        if (mobileParams[1] > mobileParams[3]) {
            return mobileParams[0];
        } else {
            return mobileParams[0] + mobileParams[2] * (mobileParams[3] - mobileParams[1]);
        }
    }

    public static int [] getNumberArray() {
        Scanner scanner = new Scanner(System.in);
        int [] inputNumbers = new int[4];
        for (int i=0; i<inputNumbers.length; i++) {
            if (scanner.hasNextInt()) {
                inputNumbers[i] = scanner.nextInt();
            }
        }
        return inputNumbers;
    }
}
