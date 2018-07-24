public class Bread
{
    private String breadType;
    private int calories;
    public static final String MOTTO = "The staff of life.";

    public Bread(String breadType, int calories)
    {
        this.breadType = breadType;
        this.calories = calories;
    }

    public String getBreadType()
    {
        return breadType;
    }

    public int getCalories()
    {
        return calories;
    }
}
