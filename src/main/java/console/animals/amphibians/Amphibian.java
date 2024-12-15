package console.animals.amphibians;

import console.animals.Animal;

public abstract class Amphibian extends Animal
{
    private final String uniqueness;
    private static int amphibianCount = 0;

    public Amphibian(String name, int maxRunDistance, int maxSwimDistance, String uniqueness)
    {
        super(name, maxRunDistance, maxSwimDistance);
        this.uniqueness = uniqueness;
        amphibianCount++;
    }

    public static int getAmphibianCount()
    {
        return amphibianCount;
    }

    public void showUniqueness()
    {
        System.out.println(super.getName() + " уникален(на) тем, что " + uniqueness);
    }
}