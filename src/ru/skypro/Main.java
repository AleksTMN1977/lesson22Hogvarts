package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Hogwarts[] student = {
                new Hogwarts("Гарри Поттер", 100),
                new Hogwarts("Гермиона Грейнджер", 95),
                new Hogwarts("Рон Уизли", 90),
                new Hogwarts("Драко Малфой", 93),
                new Hogwarts("Грэхэм Монтегю", 44),
                new Hogwarts("Грегори Гойл", 58),
                new Hogwarts("Захария Смит", 76),
                new Hogwarts("Седрик Диггори", 82),
                new Hogwarts("Джастин Финч-Флетчли", 50),
                new Hogwarts("Чжоу Чанг", 56),
                new Hogwarts("Падма Патил", 28),
                new Hogwarts("Маркус Белби", 61),
        };
        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер", 100, 82, 58,5),
                new Griffindor("Гермиона Грейнджер", 95, 85, 39,8),
                new Griffindor("Рон Уизли", 90, 66, 54,6),
        };
        Puffenduy[] puffenduys = {
                new Puffenduy("Драко Малфой", 93,22,33,24),
                new Puffenduy("Грэхэм Монтегю", 44,33,28,60),
                new Puffenduy("Грегори Гойл", 58,56,89,28),
        };
    }

}


