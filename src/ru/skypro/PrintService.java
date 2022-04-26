package ru.skypro;

public class PrintService {
    public void print(Griffindor[] griffindors) {
        System.out.println("Griffindor");
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println((i + 1) + ". '" + griffindor.getName() +
                    "' Сила магии (" + griffindor.getPowerOfMagic() + ") " +
                    "Трансгрессия (" + griffindor.getTeleport() + ") " +
                    "Благородство (" + griffindor.getNobility() + ") " +
                    "Честь (" + griffindor.getHonor() + ") " +
                    "Мужество (" + griffindor.getCourage() + ")");
        }
    }

    public void print(Hogwarts[] hogwarts) {
        for (int i = 0; i < hogwarts.length; i++) {
            Hogwarts hogwart = hogwarts[i];
            System.out.println((i + 1) + ". " + hogwart.toString());
        }
    }

    public void print(Puffenduy[] puffenduys) {
        System.out.println("Puffenduy");

        for (int i = 0; i < puffenduys.length; i++) {
            Puffenduy puffenduy = puffenduys[i];
            System.out.println((i + 1) + ". '" + puffenduy.getName() +
                    "' Сила магии (" + puffenduy.getPowerOfMagic() + ") " +
                    "Трансгрессия (" + puffenduy.getTeleport() + ") " +
                    "Работоспособность (" + puffenduy.getWork() + ") " +
                    "Вера (" + puffenduy.getFaith() + ") " +
                    "Честность (" + puffenduy.getHonesty() + ")");
        }
    }

    public void print(Kogtevran[] kogtevrans) {
        System.out.println("Kogtevran");

        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println((i + 1) + ". '" + kogtevran.getName() +
                    "' Сила магии (" + kogtevran.getPowerOfMagic() + ") " +
                    "Трансгрессия (" + kogtevran.getTeleport() + ") " +
                    "Ум (" + kogtevran.getUm() + ") " +
                    "Мудрость (" + kogtevran.getMudr() + ") " +
                    "Остроумие (" + kogtevran.getOstroum() + ") " +
                    "Творчество (" + kogtevran.getTvorch() + ")");
        }
    }

    public void print(Slizerin[] slizerins) {
        System.out.println("Slizerin");

        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println((i + 1) + ". '" + slizerin.getName() +
                    "' Сила магии (" + slizerin.getPowerOfMagic() + ") " +
                    "Трансгрессия (" + slizerin.getTeleport() + ") " +
                    "Хитрость (" + slizerin.getHitr() + ") " +
                    "Решительность (" + slizerin.getResch() + ") " +
                    "Амбициозность (" + slizerin.getAmbiz() + ") " +
                    "Находчивость (" + slizerin.getNahodh() + ") " +
                    "Жажда власти (" + slizerin.getVlast() + ")");
        }
    }
}
