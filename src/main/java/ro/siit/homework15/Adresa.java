package ro.siit.homework15;


import java.util.ArrayList;
import java.util.List;

public class Adresa {
    private String country;
    private String town;
    private String streat;
    private String no;


    public Adresa(String country) {
        this.country = country;

    }

    @Override
    public String toString() {
        return "Adresa{" +
                "country='" + country + '\'' +
                '}';
    }
}