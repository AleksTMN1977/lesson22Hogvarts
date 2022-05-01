package ru.skypro;

import javax.xml.namespace.QName;

public class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int teleport;

    public Hogwarts(String name, int powerOfMagic, int teleport) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.teleport = teleport;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTeleport() {
        return teleport;
    }

    @Override
    public String toString() {
        return "Ученик Хогвартса {" +
                "Имя '" + name + '\'' +
                ", Сила магии (" + powerOfMagic + ") " +
                ", Трансгрессия (" + teleport + ")" + "}";
    }
}
