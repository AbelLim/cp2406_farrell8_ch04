public class TestPatient
{
    public static void main(String args[])
    {
        Patient patientDefault = new Patient();
        System.out.println("ID: " + patientDefault.getID());
        System.out.println("Age: " + patientDefault.getAge());
        System.out.println("Blood type: " + patientDefault.getBloodData().getBloodType() + patientDefault.getBloodData().getRhFactor());

        Patient patient = new Patient("108F", 24, new BloodData("AB", "-"));
        System.out.println("ID: " + patient.getID());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood type: " + patient.getBloodData().getBloodType() + patient.getBloodData().getRhFactor());
    }
}
