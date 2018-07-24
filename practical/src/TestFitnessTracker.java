import java.time.LocalDate;

public class TestFitnessTracker
{
    public static void main(String args[])
    {
        FitnessTracker fitnessTracker = new FitnessTracker("Crunches", 50, LocalDate.now());
        System.out.println("Activity: " + fitnessTracker.getFitnessActivity());
        System.out.println("Duration: " + fitnessTracker.getDuration());
        System.out.println("Date: " + fitnessTracker.getDate());
    }
}
