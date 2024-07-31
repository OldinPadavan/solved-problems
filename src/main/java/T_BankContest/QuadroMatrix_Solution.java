package T_BankContest;

import java.util.Scanner;

public class QuadroMatrix_Solution {
    public static void main(String[] args) {
        int [][] newMatrix = createMatrix();

    }

    public static int [][] createMatrix() {
        Scanner scanner = new Scanner(System.in);
        int matrixNumber = scanner.nextInt();
        int [] [] matrix = new int[matrixNumber][matrixNumber];
        for (int i = 0; i < matrixNumber; i++) {
            for (int y = 0; y < matrixNumber; y++) {
                matrix[i][y] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int getInterestingPairNumbers(int [][] matrix) {
        int interestingPairNumbers = 0;

        return 0;
    }
}
