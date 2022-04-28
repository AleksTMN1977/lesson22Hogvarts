package ru.skypro;

public class Method {

    public static void bestStudentGriffindor(Griffindor griffindor, Griffindor griffindor1) {
        int result = 0;
        int result1 = 0;
        result = griffindor.getNobility() + griffindor.getHonor() + griffindor.getCourage();
        result1 = griffindor1.getNobility() + griffindor1.getHonor() + griffindor1.getCourage();
        if (griffindor == griffindor1) {
            System.out.println("Для сравнения выберете разных учеников !");
        } else if (result > result1) {
            System.out.println("'" + griffindor.getName() + "'" + " лучший Гриффендорец чем '" + griffindor1.getName() + "'");
        } else {
            System.out.println("'" + griffindor1.getName() + "'" + " лучший Гриффендорец чем '" + griffindor.getName() + "'");
        }
        System.out.println();
    }

    public static void bestStudentKogtevran(Kogtevran kogtevran, Kogtevran kogtevran1) {
        int result = 0;
        int result1 = 0;
        result = kogtevran.getUm() + kogtevran.getMudr() + kogtevran.getOstroum() + kogtevran.getTvorch();
        result1 = kogtevran1.getUm() + kogtevran1.getMudr() + kogtevran1.getOstroum() + kogtevran.getTvorch();
        if (kogtevran == kogtevran1) {
            System.out.println("Для сравнения выберете разных учеников !");
        } else if (result > result1) {
            System.out.println("'" + kogtevran.getName() + "'" + " лучший Когтевранец чем '" + kogtevran1.getName() + "'");
        } else {
            System.out.println("'" + kogtevran1.getName() + "'" + " лучший Когтевранец чем '" + kogtevran.getName() + "'");
        }
        System.out.println();
    }

    public static void bestStudentPuffenduy(Puffenduy puffenduy, Puffenduy puffenduy1) {
        int result = 0;
        int result1 = 0;
        result = puffenduy.getWork() + puffenduy.getFaith() + puffenduy.getHonesty();
        result1 = puffenduy1.getWork() + puffenduy1.getFaith() + puffenduy1.getHonesty();
        if (puffenduy == puffenduy1) {
            System.out.println("Для сравнения выберете разных учеников !");
        } else if (result > result1) {
            System.out.println("'" + puffenduy.getName() + "'" + " лучший Пуффендуец чем '"
                    + puffenduy1.getName() + "'");
        } else {
            System.out.println("'" + puffenduy1.getName() + "'" + " лучший Пуффендуец чем '"
                    + puffenduy.getName() + "'");
        }
        System.out.println();
    }

    public static void bestStudentSlizerin(Slizerin slizerin, Slizerin slizerin1) {
        int result = 0;
        int result1 = 0;
        result = slizerin.getHitr() + slizerin.getResch() + slizerin.getNahodh() +
                slizerin.getAmbiz() + slizerin.getVlast();
        result1 = slizerin1.getHitr() + slizerin1.getResch() + slizerin1.getNahodh() +
                slizerin1.getAmbiz() + slizerin1.getVlast();
        if (slizerin == slizerin1) {
            System.out.println("Для сравнения выберете разных учеников !");
        } else if (result > result1) {
            System.out.println("'" + slizerin.getName() + "'" + " лучший Слизеринец чем '" +
                    slizerin1.getName() + "'");
        } else {
            System.out.println("'" + slizerin1.getName() + "'" + " лучший Слизринец чем '" +
                    slizerin.getName() + "'");
        }
        System.out.println();
    }

    public static void bestStudentHogwarts(Hogwarts hogwart, Hogwarts hogwart1) {
        int result = 0;
        int result1 = 0;
        result = hogwart.getPowerOfMagic() + hogwart.getTeleport();
        result1 = hogwart1.getPowerOfMagic() + hogwart1.getTeleport();
        if (hogwart == hogwart1) {
            System.out.println("Для сравнения выберете разных учеников !");
        } else if (result > result1) {
            System.out.println("'" + hogwart.getName() + "'" + " сильнее по  магии и трансгрессии чем '" +
                    hogwart1.getName() + "'");
        } else {
            System.out.println("'" + hogwart1.getName() + "'" + " сильнее по  магии и трансгрессии чем '" +
                    hogwart.getName() + "'");
        }
        System.out.println();
    }
}

