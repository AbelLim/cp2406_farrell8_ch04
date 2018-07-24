public class FormLetterWriter
{
    public void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Mrs. " + lastName + ",\nThank you for your business order.");
    }

    public void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName + ",\nThank you for your business order.");
    }
}
