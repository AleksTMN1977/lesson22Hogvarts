package ru.skypro;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int powerOfMagic, int teleport, int nobility, int honor, int courage) {
        super(name, powerOfMagic,teleport);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }


    public int getNobility() {
        return nobility;
    }


    public int getHonor() {
        return honor;
    }


    public int getCourage() {
        return courage;
    }


    }



