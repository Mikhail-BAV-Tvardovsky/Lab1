package console.animals.amphibians;

public class Frog extends Amphibian
{
    private static final int maxRunDistance = 1;
    private static final int maxSwimDistance = 10;
    private static int frogCount = 0;

    public Frog(String name, String uniqueness)
    {
        super(name, maxRunDistance, maxSwimDistance, uniqueness);
        frogCount++;
    }

    public static int getFrogCount()
    {
        return frogCount;
    }


    // Метод для вывода сообщения о прыжке
/*    public void jumpDistance(int distance)
    {
        System.out.println(super.getName() + " пролетела " + distance + " метров!");
    }*/
}