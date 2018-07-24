import java.time.LocalDate;

public class TestFitnessTracker2
{
    public static void main(String args[])
    {
        FitnessTracker2 fitnessTracker = new FitnessTracker2();
        System.out.println("Activity: " + fitnessTracker.getFitnessActivity());
        System.out.println("Duration: " + fitnessTracker.getDuration());
        System.out.println("Date: " + fitnessTracker.getDate());
    }
}
