package ro.siit.homework19;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class SkiRank {
    public static void main(String[] args) throws IOException {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        String source = "Lista CSV.csv";
        String listSource = "lista-input.csv";

        List<String> lista = Files.readAllLines(Paths.get(source), Charset.defaultCharset());
        lista.remove(0);

        List<String> ranking = new ArrayList<>();
        for (String linie : lista) {
            ranking.add(linie.substring(linie.indexOf(",") + 1, linie.length() - 26) +
                    calculateTotalTime(linie) + ",(" + linie.substring(linie.length() - 23, linie.length() - 18) +
                    " + " + calculatePenalties(linie) + ")");

        }

        Files.write(Paths.get(listSource), ranking, Charset.defaultCharset());

        List<String> sortList = Files.readAllLines(Paths.get(listSource), Charset.defaultCharset());
        for(String ls : sortList) {
            String[] column = ls.split(",");

            System.out.println(column[1]);

        }
    }
    public static int countMiss(String rand, char search, int count) {
       for(int i = rand.length()-17; i<rand.length(); i++) {
           if(rand.charAt(i) == search) {
               count++;
           }
       }
        return count;
       }

       public static int calculatePenalties(String rand) {
            int mistake = countMiss(rand, 'o', 0);
            return mistake * 10;
       }

       public static String calculateTotalTime(String rand) {

            int minutes = Integer.parseInt(rand.substring(rand.length()-23, rand.length()-21));
            int seconds = Integer.parseInt(rand.substring(rand.length()-20, rand.length()-18));

            int totalSeconds = seconds + calculatePenalties(rand);
                if(totalSeconds >= 60);
                    int restSeconds = totalSeconds % 60;
                    int totalMinutes = minutes + (totalSeconds / 60);

            return String.valueOf(totalMinutes + ":" + restSeconds);
       }
}