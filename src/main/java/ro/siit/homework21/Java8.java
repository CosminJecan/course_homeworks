package ro.siit.homework21;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Java8 {

    public static void main(String[] args) throws IOException {

        String source = "InputFileNameHW21";
        String destination = "OutFile";

        System.out.println("Inserati luna dorita pentru filtrare:");
        Scanner scan = new Scanner(System.in);
        String targetMounth = scan.nextLine();


        List<String> sourceList = Files.readAllLines(Paths.get(source), Charset.defaultCharset());

        List<String> mounthBirth = new ArrayList<>();
        for (String line : sourceList) {
             mounthBirth.add(line.replace(line.substring(line.lastIndexOf(" ")),
                    line.substring(line.indexOf("."), line.lastIndexOf("."))));
        }

        List<String> aaa = mounthBirth.stream()
                .filter(mounth->mounth.contains(targetMounth))
                .sorted()
                .map(mounth->mounth.substring(0, mounth.lastIndexOf(".")))
                .collect(Collectors.toList());

        aaa.forEach(System.out::println);

        Files.delete(Paths.get(destination));
        Files.write(Paths.get(destination), aaa, Charset.defaultCharset());

    }
}