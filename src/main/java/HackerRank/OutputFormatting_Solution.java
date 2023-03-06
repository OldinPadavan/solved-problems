package HackerRank;
import java.io.*;
import java.util.*;

public class OutputFormatting_Solution {

    public static void main(String[] args) {

    }

    public static String stringFormatting (String str) {
        System.out.printf("");
    }

    public static String outputReader() {
        StringBuilder outputStr = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            outputStr.append(bufferedReader.readLine());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return outputStr.toString();
    }
}
