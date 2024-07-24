package Hyperskill;

import java.util.Scanner;

// link to task https://hyperskill.org/learn/step/10577
public class FullNameCreator_Solution {
    public static void main(String[] args) {
        System.out.println(getFullName());
    }

    public static String getFullName() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder createdFullName = new StringBuilder();
        createdFullName.append(scanner.nextLine());
        createdFullName.append(" ");
        createdFullName.append(scanner.nextLine());
        return createdFullName.toString();
    }
}
