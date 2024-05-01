package discount;

public class DeepDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * 0.5); // 50% discount
    }
}