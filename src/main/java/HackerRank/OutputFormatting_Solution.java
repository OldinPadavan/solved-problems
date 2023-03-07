package HackerRank;
import java.io.*;
import java.util.*;

public class OutputFormatting_Solution {

    public static void main(String[] args) {
        System.out.println("================================");
        stringFormatting();
        System.out.println("================================");

    }

    public static void stringFormatting () {

        System.out.printf("",outputReader());
    }

    public static String outputReader() {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            builder.append(bufferedReader.readLine());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return builder.toString();
    }
}
