public class Billing
{
    private final double TAX = 1+8/100;
    public double computeBill(double price)
    {
        return price*TAX;
    }

    public double computeBill(double price, int quantity)
    {
        return price*quantity*TAX;
    }

    public double computeBill(double price, int quantity, double coupon)
    {
        return price*quantity*(1-coupon/100)*TAX;
    }
}
