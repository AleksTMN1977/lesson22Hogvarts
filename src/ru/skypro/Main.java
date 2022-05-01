package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", 95, 81),
                new Hogwarts("Гермиона Грейнджер", 97, 88),
                new Hogwarts("Рон Уизли", 70, 69),
                new Hogwarts("Драко Малфой", 93, 90),
                new Hogwarts("Грэхэм Монтегю", 44, 82),
                new Hogwarts("Грегори Гойл", 58, 55),
                new Hogwarts("Захария Смит", 76, 61),
                new Hogwarts("Седрик Диггори", 82, 72),
                new Hogwarts("Джастин Финч-Флетчли", 50, 33),
                new Hogwarts("Чжоу Чанг", 56, 44),
                new Hogwarts("Падма Патил", 28, 60),
                new Hogwarts("Маркус Белби", 61, 29),
        };
        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер", 95, 81, 58, 59, 66),
                new Griffindor("Гермиона Грейнджер", 97, 88, 39, 80, 69),
                new Griffindor("Рон Уизли", 70, 69, 54, 61, 49),
        };
        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", 93, 90, 33, 24, 85, 77, 47),
                new Slizerin("Грэхэм Монтегю", 44, 82, 28, 60, 91, 78, 69),
                new Slizerin("Грегори Гойл", 58, 55, 89, 28, 81, 79, 74),
        };
        Puffenduy[] puffenduys = {
                new Puffenduy("Захария Смит", 76, 61, 33, 24, 22),
                new Puffenduy("Седрик Диггори", 82, 72, 28, 60, 8),
                new Puffenduy("Джастин Финч-Флетчли", 50, 33, 89, 28, 66),
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу Чанг", 56, 44, 52, 5, 40, 65),
                new Kogtevran("Падма Патил", 28, 60, 55, 22, 64, 56),
                new Kogtevran("Маркус Белби", 61, 29, 47, 78, 18, 85),
        };

        PrintService printService = new PrintService();
        printService.print(hogwarts);
        printService.print(griffindors);
        printService.print(puffenduys);
        printService.print(kogtevrans);
        printService.print(slizerins);

        Method.bestStudentGriffindor(griffindors[0], griffindors[2]);
        Method.bestStudentKogtevran(kogtevrans[0], kogtevrans[2]);
        Method.bestStudentPuffenduy(puffenduys[0], puffenduys[1]);
        Method.bestStudentSlizerin(slizerins[0], slizerins[1]);
        Method.bestStudentHogwarts(hogwarts[0], hogwarts[0]);
   }
}


