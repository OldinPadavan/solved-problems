package CodeWars;

import java.util.HashMap;

public class DNA_Solution {
    public static void main(String[] args) {
        System.out.println(recombinator("AAAA"));
        System.out.println(recombinator("TTTT"));
        System.out.println(recombinator("TAACG"));
        System.out.println(recombinator("CATA"));
    }
    public static String recombinator(String inputDNA) {
        StringBuilder alteredDNA = new StringBuilder();
        HashMap<Character, Character>dnaPairs = new HashMap<>();
        dnaPairs.put('A','T');
        dnaPairs.put('T','A');
        dnaPairs.put('C','G');
        dnaPairs.put('G','C');
        for (char ch :inputDNA.toCharArray()) {
            alteredDNA.append(dnaPairs.get(ch));
        }
        return  alteredDNA.toString();
    }
}
