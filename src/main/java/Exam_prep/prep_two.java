package Exam_prep;

public class prep_two {
    public static void main(String[] args) {
        for (int i = 80; i <= 100; i++) {
            System.out.print("значение при x = " + i + " ");
            getNum(i);
        }

    }
    public static void getNum(int num) {
        double r = 0;
        int n = num;

        while (n > 0) {
            r = n % 2 + 2 * r;
            n = n / 2;
        }
        System.out.println(r);

    }
}
