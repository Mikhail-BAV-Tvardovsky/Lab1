package console;

import console.animals.Animal;
import console.animals.Cat;
import console.animals.Dog;
import console.animals.Tiger;
import console.animals.amphibians.Amphibian;
import console.animals.amphibians.Chameleon;
import console.animals.amphibians.Frog;
import console.animals.amphibians.Newt;
import console.animals.insects.Ant;
import console.animals.insects.Butterfly;
import console.animals.insects.Dragonfly;
import console.animals.insects.Insect;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int runDistance = 300;
        int swimDistance = 10;

        Animal[] animals = {
                new Cat("Барсик"),
                new Cat("Баюн"),
                new Cat("Кузя"),
                new Dog("Шарик"),
                new Tiger("Ураган"),
                new Tiger("Шерхан"),
                new Ant("Муравец"),
                new Butterfly("Летучка"),
                new Dragonfly("Жужжало"),
                new Frog("Кваки", "умеет далеко прыгать"),
                new Newt("Трит", "умеет отращивать конечности"),
                new Chameleon("Хамелька", "умеет менять цвет"),
        };


        for (Animal animal : animals) {
            animal.run(runDistance);
            animal.swim(swimDistance);

        }
//        Insect insect1 = new Ant("Мура");
//        Insect insect2 = new Butterfly("бутер");
//        Insect insect3 = new Dragonfly("дракоха");
//        List<Insect> insectList = List.of(insect1, insect2, insect3);
//        for (Insect insect : insectList) {
//            insect.showLifespan();
//        }
        Frog frog = new Frog("lyaguha", "Прыгает минимум на 5м");
        frog.showUniqueness();
        System.out.println("Животные: " + Animal.getCount() +
                "\nКошки: " + Cat.getCount() +
                "\nСобаки: " + Dog.getCount() +
                "\nТигры: " + Tiger.getCount() +
                "\nНасекомые: " + Insect.getInsectCount() +
                "\nМуравьи: " + Ant.getAntCount() +
                "\nБабочки: " + Butterfly.getButterflyCount() +
                "\nСтрекозы: " + Dragonfly.getDragonflyCount() +
                "\nЗемноводные: " + Amphibian.getAmphibianCount() +
                "\nЛягушки: " + Frog.getFrogCount() +
                "\nТритоны: " + Newt.getNewtCount() +
                "\nХамелеоны: " + Chameleon.getChameleonCount() + "\n");

        ((Insect) animals[6]).showLifespan();
        ((Insect) animals[7]).showLifespan();
        ((Insect) animals[8]).showLifespan();
        System.out.println("\n");
        ((Amphibian) animals[9]).showUniqueness();
        ((Amphibian) animals[10]).showUniqueness();
        ((Amphibian) animals[11]).showUniqueness();
    }
}