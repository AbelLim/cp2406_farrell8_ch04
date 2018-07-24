import java.time.LocalDate;

public class FitnessTracker2
{
    private String fitnessActivity;
    private int duration;
    private LocalDate date;


    public FitnessTracker2()
    {
        this("running", 0, LocalDate.of(LocalDate.now().getYear(), 1, 1));
    }

    public FitnessTracker2(String fitnessActivity, int duration, LocalDate date)
    {
        this.fitnessActivity = fitnessActivity;
        this.duration = duration;
        this.date = date;
    }

    public String getFitnessActivity()
    {
        return fitnessActivity;
    }

    public int getDuration()
    {
        return duration;
    }

    public LocalDate getDate()
    {
        return date;
    }
}
