public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9012-3456", "John Doe"));
        cart.checkout(250);

        cart.setPaymentStrategy(new PayPalStrategy("john.doe@example.com"));
        cart.checkout(100);

        cart.setPaymentStrategy(new CryptoStrategy("0x1A2B3C4D5E6F7890"));
        cart.checkout(500);
    }
}