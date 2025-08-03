package Exam_prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ReadLinesAlgos {
    public static void main(String[] args) {
        System.out.println(getNum(getLinesFromFile("C:\\Users\\shiro\\OneDrive\\Рабочий стол\\test_text.txt")));
    }

   public static int getNum(ArrayList<Float> inputArray) {
        float sum = 0;
       System.out.println(inputArray.size());
        for (Float f : inputArray) {

            sum = sum + f;
        }

        return (int) (sum / inputArray.size());
   }

   public static ArrayList<Float> getLinesFromFile(String filePath) {
       ArrayList<String> inputLines = new ArrayList<>();
        ArrayList<Float> numbers = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                inputLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       System.out.println(inputLines.size());
        for (int i = 1; i <= Integer.parseInt(inputLines.get(0)); i++) {
            System.out.println(Float.valueOf(inputLines.get(i)));
            numbers.add(Float.valueOf(inputLines.get(i)));
        }

        return  numbers;
   }
}
