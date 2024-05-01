package discount;

public class SaleDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * 0.1); // 10% discount
    }
}