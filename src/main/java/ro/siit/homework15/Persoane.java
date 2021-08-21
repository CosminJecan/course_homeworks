package ro.siit.homework15;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;


public class Persoane {
    private String name;
    private String surname;
    private Date dateBirth;
    private Gender gender;
    private String profession;

    public int calculateAge(){
        int age = Calendar.getInstance().get(Calendar.YEAR) - dateBirth.getYear();
        return age;
    }

    public Persoane(String name, String surname, Date dateBirth, Gender gender, String profession) {
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.profession = profession;
    }

    public Persoane(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Persoane{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + calculateAge() +
                ", gender=" + gender +
                ", profession='" + profession + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoane persoane = (Persoane) o;
        return name.equals(persoane.name) && Objects.equals(surname, persoane.surname) && Objects.equals(dateBirth, persoane.dateBirth) && gender == persoane.gender && Objects.equals(profession, persoane.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateBirth, gender, profession);
    }
}