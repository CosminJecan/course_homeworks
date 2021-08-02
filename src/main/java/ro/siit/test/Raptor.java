package ro.siit.test;

public class Raptor extends  Bird{
    static {
        System.out.print("r1 ");
    }
    public Raptor(){
        System.out.print("r2 ");
    }
    {
        System.out.print("r3 ");
    }
    static {
        System.out.print("r4 ");
    }
}
