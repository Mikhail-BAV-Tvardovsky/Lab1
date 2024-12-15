package console.animals.insects;

public class Dragonfly extends Insect
{
    private static final int lifespan = 5;
    private static int dragonflyCount = 0;

    public Dragonfly(String name)
    {
        super(name, 0, lifespan);
        dragonflyCount++;
    }

    public static int getDragonflyCount()
    {
        return dragonflyCount;
    }
}