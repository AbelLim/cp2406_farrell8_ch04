public class Patient
{
    private String ID;
    private int age;
    private BloodData bloodData;
    public Patient()
    {
        this.ID = "0";
        this.age = 0;
        this.bloodData = new BloodData();
    }

    public Patient(String ID, int age, BloodData bloodData)
    {
        this.ID = ID;
        this.age = age;
        this.bloodData = bloodData;
    }

    public String getID()
    {
        return ID;
    }

    public int getAge()
    {
        return age;
    }

    public BloodData getBloodData()
    {
        return bloodData;
    }
}
