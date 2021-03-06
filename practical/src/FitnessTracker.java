import java.time.*;
public class FitnessTracker
{
    private String fitnessActivity;
    private int duration;
    private LocalDate date;


    public FitnessTracker()
    {
        this.fitnessActivity = "running";
        this.duration = 0;
        this.date = LocalDate.of(LocalDate.now().getYear(), 1,1);
    }

    public FitnessTracker(String fitnessActivity,int duration, LocalDate date)
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
