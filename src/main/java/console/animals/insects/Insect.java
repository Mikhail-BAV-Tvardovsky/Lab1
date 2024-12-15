package console.animals.insects;

import console.animals.Animal;

public abstract class Insect extends Animal
{
    private final int lifespan;
    private static int insectCount;

    public Insect(String name, int maxRunDistance, int lifespan)
    {
        super(name, maxRunDistance, 0);
        this.lifespan = lifespan;
        insectCount++;
    }

    public static int getInsectCount()
    {
        return insectCount;
    }

    public void showLifespan() {
        System.out.println("Продолжительность жизни у " + getName() + " " + lifespan + " лет");
    }
}