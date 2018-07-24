import java.util.Scanner;

public class TestBilling
{
    public static void main(String args[])
    {
        double price;
        int quantity;
        double coupon;
        Billing billing = new Billing();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the price of the book: ");
        price = input.nextDouble();
        System.out.println("Please enter the quantity: ");
        quantity = input.nextInt();
        System.out.println("Please enter the discount on the coupon: ");
        coupon = input.nextDouble();
        System.out.println("The total due is $" + billing.computeBill(price));
        System.out.println("The total due is $" + billing.computeBill(price,quantity));
        System.out.println("The total due is $" + billing.computeBill(price,quantity,coupon));
    }
}
