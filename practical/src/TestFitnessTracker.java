public class TestFitnessTracker
{
    public static void main(String args[])
    {
        FitnessTracker fitnessTracker = new FitnessTracker();
        System.out.println("Activity: " + fitnessTracker.getFitnessActivity());
        System.out.println("Duration: " + fitnessTracker.getDuration());
        System.out.println("Date: " + fitnessTracker.getDate());
    }
}
