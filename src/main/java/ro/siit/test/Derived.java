package ro.siit.test;

public class Derived extends Base{
    public Derived(){
        System.out.print("D1");
    }
    public Derived(String d) {
        this();
        System.out.print("D2");
    }
}

