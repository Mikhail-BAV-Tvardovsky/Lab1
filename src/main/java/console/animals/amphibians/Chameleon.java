package console.animals.amphibians;

public class Chameleon extends Amphibian
{
    private static final int maxRunDistance = 1;
    private static final int maxSwimDistance = 0;
    private static int chameleonCount = 0;

    public Chameleon(String name, String uniqueness)
    {
        super(name, maxRunDistance, maxSwimDistance, uniqueness);
        chameleonCount++;
    }

    public static int getChameleonCount()
    {
        return chameleonCount;
    }
}