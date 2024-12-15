package console.animals.amphibians;

public class Newt extends Amphibian
{
    private static final int maxRunDistance = 1;
    private static final int maxSwimDistance = 10;
    private static int newtCount = 0;

    public Newt(String name, String uniqueness)
    {
        super(name, maxRunDistance, maxSwimDistance, uniqueness);
        newtCount++;
    }

    public static int getNewtCount()
    {
        return newtCount;
    }
}