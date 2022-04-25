package ru.skypro;

import javax.xml.namespace.QName;

public class Hogwarts {
    private String name;
    private int powerOfMagic;

    public Hogwarts(String name, int powerOfMagic) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                '}';
    }

    private String getName() {
        return name;
    }
}
