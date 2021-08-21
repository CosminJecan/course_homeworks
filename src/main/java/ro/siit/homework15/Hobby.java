package ro.siit.homework15;
import java.util.List;
import java.util.Objects;


public class Hobby {
    private String nameOfHobby;
    private int freqvencyPerWeek;
    private List<Adresa> listOfAdresses;

    public Hobby(String nameOfHobby, int freqvencyPerWeek, List<Adresa> listOfAdresses) {
        this.nameOfHobby = nameOfHobby;
        this.freqvencyPerWeek = freqvencyPerWeek;
        this.listOfAdresses = listOfAdresses;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "nameOfHobby='" + nameOfHobby + '\'' +
                ", freqvencyPerWeek=" + freqvencyPerWeek +
                ", listOfAdresses=" + listOfAdresses +
                '}';
    }
}