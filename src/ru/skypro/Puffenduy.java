package ru.skypro;

public class Puffenduy extends Hogwarts {
    private int work;
    private int faith;
    private int honesty;

    public Puffenduy(String name, int powerOfMagic, int work, int faith, int honesty) {
        super(name, powerOfMagic);
        this.work = work;
        this.faith = faith;
        this.honesty = honesty;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}

