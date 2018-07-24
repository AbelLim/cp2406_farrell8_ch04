public class TestBread
{
    public static void main(String args[])
    {
        Bread bread1 = new Bread("Rye", 100);
        Bread bread2 = new Bread("French", 500);
        Bread bread3 = new Bread("White", 70);

        showBread(bread1);
        showBread(bread2);
        showBread(bread3);
    }

    public static void showBread(Bread bread)
    {
        System.out.println(bread.MOTTO + " A loaf of " + bread.getBreadType() + " has " + bread.getCalories() + "calories.");
    }
}
