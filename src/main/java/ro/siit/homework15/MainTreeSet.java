package ro.siit.homework15;

import java.util.*;


public class MainTreeSet {

        public static void main(String[] args) {
            Comparator<Persoane> persoaneNameComparator = new Comparator<Persoane>() {
                @Override
                public int compare(Persoane o1, Persoane o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            };

            Comparator<Persoane> persoaneAgeComparator = new Comparator<Persoane>() {
                @Override
                public int compare(Persoane o1, Persoane o2) {
                    return o1.calculateAge() - o2.calculateAge();
                }
            };

            Set<Persoane> persons = new TreeSet<>(persoaneNameComparator);



            persons.add(new Persoane
                    ("Popescu", "Ana", new Date(1999, 8, 6), Gender.f, "student"));
            persons.add(new Persoane
                    ("Anton", "Cristian", new Date(1975, 2, 21), Gender.m, "mecanic auto"));
            persons.add(new Persoane
                    ("Sas", "Ioan", new Date(2007, 5, 18), Gender.m, "elev"));
            persons.add(new Persoane
                    ("Grigore", "Mirela", new Date(1985, 10, 20), Gender.f, "profesor"));
            persons.add(new Persoane
                    ("Anton", "Roxana", new Date(1993, 8, 17), Gender.f, "inginer"));
            persons.add(new Persoane
                    ("Ignat", "Roxana", new Date(1997, 8, 17), Gender.f, "profesor"));
            persons.add(new Persoane
                    ("Ignat", "Roxana", new Date(1997, 8, 17), Gender.f, "profesor"));


            for (Persoane person : persons) {
                System.out.println(person.getName() + " " +person.getSurname() + " = " + person.calculateAge() + ";");
            }
        }
}