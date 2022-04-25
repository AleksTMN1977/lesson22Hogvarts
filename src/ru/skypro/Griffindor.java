package ru.skypro;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int powerOfMagic, int nobility, int honor, int courage) {
        super(name, powerOfMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}


