package discount;

public class LiquidationDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * 0.75); // 75% discount
    }
}