package console.animals.insects;

public class Butterfly extends Insect
{
    private static final int lifespan = 9;
    private static int butterflyCount = 0;

    public Butterfly(String name)
    {
        super(name, 0, lifespan);
        butterflyCount++;
    }

    public static int getButterflyCount()
    {
        return butterflyCount;
    }
}