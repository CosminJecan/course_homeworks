package ro.siit.homework15;
import java.util.*;


public class MainHashMap {
    public static void main(String[] args) {
        List<Adresa> swimHobby = new ArrayList<>();
            swimHobby.add(new Adresa("Romania"));
            swimHobby.add(new Adresa("Italia"));



        List<Adresa> skiingHobby = new ArrayList<>();
            skiingHobby.add(new Adresa("Romania"));
            skiingHobby.add(new Adresa("Austria"));
            skiingHobby.add(new Adresa("Franta"));

            


        List<Hobby> swim = new ArrayList<>();
             swim.add(new Hobby("swim", 2, swimHobby));

        List<Hobby> skiing = new ArrayList<>();  
             skiing.add(new Hobby("skiing", 5, skiingHobby));

        List<Hobby> climbing = new ArrayList<>();
        climbing.add(new Hobby("climbing", 1, skiingHobby.subList(0, 2)));



        Map<Persoane, List<Hobby>> mapHobby = new HashMap<>();
        mapHobby.put(new Persoane("Anton"), swim);
        mapHobby.put(new Persoane("Ignat"), climbing);
        mapHobby.put(new Persoane("Popescu"), skiing);
        mapHobby.put(new Persoane("Sas"), swim);


        System.out.print(mapHobby.get(new Persoane("Sas")));
        }




    }

