package Seminar1;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import com.sun.source.tree.ModuleTree;

/***Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, " +
        "Монах". Для каждого определить 8 полей данных(здоровье, сила итд) 3-4
        поля поведения(методов атаковать, вылечить итд). Создать абстрактный
        класс и иерархию наследников. Расположить классы в пакет так, чтобы в
        основной программе небыло видно их полей. В не абстрактных классах
        переопределить метод toString() так чтобы он возвращал название класса или имя.
        Создать в основной программе по одному обьекту каждого не абстрактного класса и
        вывести в консоль его имя.

        Формат сдачи:
        Ссылка на гитхаб проект
                Подписать фамилию и номер группы***/
public class Main {
    public static void main(String[] args) {
        Crossbowman crossbowman = new Crossbowman("Artur", 80, 20, 20, 1, 3, 20, 40);
        Magician magician = new Magician("Mary", 60, 20, 20, 1, 40, 20, 40);
        Monk monk = new Monk("David", 140, 30, 2, 5, 3, 20, 50);
        Peasant peasant = new Peasant("John", 100, 10, 10, 3, 3, 20, 20);
        Rogue rogue = new Rogue("Martin", 60, 20, 20, 10, 3, 20, 40);
        Sniper sniper = new Sniper("Adolf", 50, 20, 20, 15, 15, 20, 40);
        Spearman spearman = new Spearman("Lancer", 120, 20, 20, 10, 3, 20, 25);
        System.out.println(peasant.getInfo());
        System.out.println(crossbowman.getInfo());
        System.out.println(magician.getInfo());
        System.out.println(monk.getInfo());
        System.out.println(rogue.getInfo());
        System.out.println(sniper.getInfo());
        System.out.println(spearman.getInfo());

    }
    }
