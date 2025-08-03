package Exam_prep;

public class Algos {
    public static void main(String[] args) {
        System.out.println(getNum());
    }

    public static int getNum() {
        int s = 500;
        int n = 200;
        while (s / n >= 2) {
            s = s + 5;
            n = n + 5;
        }
        return s;
    }
}
