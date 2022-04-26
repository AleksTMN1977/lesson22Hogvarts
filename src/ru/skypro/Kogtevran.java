package ru.skypro;

public class Kogtevran extends Hogwarts{
    private int um;
    private int mudr;
    private int ostroum;
    private int tvorch;

    public Kogtevran(String name, int powerOfMagic, int teleport, int um, int mudr, int ostroum, int tvorch) {
        super (name, powerOfMagic, teleport);
        this.um = um;
        this.mudr = mudr;
        this.ostroum = ostroum;
        this.tvorch = tvorch;
    }

    public int getUm() {
        return um;
    }

    public int getMudr() {
        return mudr;
    }

    public int getOstroum() {
        return ostroum;
    }

    public int getTvorch() {
        return tvorch;
    }
}
