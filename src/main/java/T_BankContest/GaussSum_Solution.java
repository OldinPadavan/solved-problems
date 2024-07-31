package T_BankContest;

import java.util.Scanner;

public class GaussSum_Solution {
    static final int progStart = 100;
    public static void main(String[] args) {
        System.out.println(getSum(getNumber()));
    }

    public static int getNumber () {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 0;
        }
    }

    public static long getSum (int progEnd) {
        int progSt_progEn = progStart + progEnd;
        int progNumbers = progEnd - progStart + 1;
        return (long )progSt_progEn * progNumbers / 2;
    }
}
