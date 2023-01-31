package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InOut_Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int i = Integer.parseInt(reader.readLine());
            double d = Double.parseDouble(reader.readLine());
            String s = reader.readLine();

            System.out.println(i);
            System.out.println(d);
            System.out.println(s);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

}
