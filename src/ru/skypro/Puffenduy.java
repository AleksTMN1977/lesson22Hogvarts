package ru.skypro;

public class Puffenduy extends Hogwarts {
    private int work;
    private int faith;
    private int honesty;

    public Puffenduy(String name, int powerOfMagic, int teleport, int work, int faith, int honesty) {
        super(name, powerOfMagic, teleport);
        this.work = work;
        this.faith = faith;
        this.honesty = honesty;
    }

    public int getWork() {
        return work;
    }


    public int getFaith() {
        return faith;
    }


    public int getHonesty() {
        return honesty;
    }


}

