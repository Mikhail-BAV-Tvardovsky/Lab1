package console.animals.insects;

public class Ant extends Insect
{
    private static final int maxRunDistance = 10;
    private static final int lifespan = 1;
    private static int antCount = 0;

    public Ant(String name)
    {
        super(name, maxRunDistance, lifespan);
        antCount++;
    }

    public static int getAntCount()
    {
        return antCount;
    }
}