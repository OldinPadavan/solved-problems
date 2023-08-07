package HackerRank;
import java.io.*;
import java.util.*;

public class OutputFormatting_Solution {

    public static void main(String[] args) {
        System.out.println("================================");
        stringFormatting(outputReader());
        System.out.println("================================");
    }

    public static void stringFormatting (String[] strings) {
        for (String str : strings) {
            String chars = str.replaceAll("\\d", "");
            int numbers = Integer.parseInt(str.replaceAll("\\D", ""));
            System.out.printf("%-15s" + "%03d" + "%n", chars, numbers);
        }

    }

    public static String[] outputReader() {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (true) {
                line = reader.readLine();
                if (line.equals("")) {
                    break;
                }
                strings.add(line);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return strings.toArray(new String[strings.size()]);
    }
}
