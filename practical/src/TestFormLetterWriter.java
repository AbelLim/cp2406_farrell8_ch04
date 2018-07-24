import java.util.Scanner;

public class TestFormLetterWriter
{
    public static void main(String args[])
    {
        String firstName;
        String lastName;
        FormLetterWriter writer = new FormLetterWriter();
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in your first name: ");
        firstName = input.next();
        System.out.println("Please type in your last name: ");
        lastName = input.next();
        writer.displaySalutation(lastName);
        writer.displaySalutation(firstName, lastName);
    }
}
