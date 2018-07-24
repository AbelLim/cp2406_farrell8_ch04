public class TestBloodData
{
    public static void main(String args[])
    {
        BloodData bloodDataDefault = new BloodData();
        System.out.println(bloodDataDefault.getBloodType() + bloodDataDefault.getRhFactor());
        BloodData bloodData = new BloodData("B", "-");
        System.out.println(bloodData.getBloodType() + bloodData.getRhFactor());
        bloodData.setBloodType("AB");
        bloodData.setRhFactor("+");
        System.out.println(bloodData.getBloodType() + bloodData.getRhFactor());
    }
}
