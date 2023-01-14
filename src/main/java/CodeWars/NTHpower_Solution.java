package CodeWars;

public class NTHpower_Solution {
    /*
    * You are provided with an array of positive integers and an additional integer n (n > 1).
    * Calculate the sum of each value in the array to the nth power. Then subtract the sum of the original array.*/
    public static int modifiedSum(int[] array, int power) {
        int firstNum = 0, secondNum = 0;
        for (int n : array) {
            firstNum += Math.pow(n, power);
        }
        for (int n : array) {
            secondNum += n;
        }
        return firstNum - secondNum;
    }
}
