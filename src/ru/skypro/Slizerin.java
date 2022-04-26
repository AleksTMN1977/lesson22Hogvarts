package ru.skypro;


public class Slizerin extends Hogwarts {
    private int hitr;
    private int resch;
    private int ambiz;
    private int nahodh;
    private int vlast;

    public Slizerin(String name, int powerOfMagic, int teleport, int hitr, int resch, int ambiz, int nahodh, int vlast) {
        super(name, powerOfMagic, teleport);
        this.hitr = hitr;
        this.resch = resch;
        this.ambiz = ambiz;
        this.nahodh = nahodh;
        this.vlast = vlast;

    }

    public int getHitr() {
        return hitr;
    }

    public int getResch() {
        return resch;
    }

    public int getAmbiz() {
        return ambiz;
    }

    public int getNahodh() {
        return nahodh;
    }

    public int getVlast() {
        return vlast;
    }
}
