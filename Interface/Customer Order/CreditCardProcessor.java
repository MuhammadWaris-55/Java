public class CreditCardProcessor implements PaymentProcessor {

    private String cardNumber;

    public CreditCardProcessor(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("CreditCardProcessor: Authorizing via bank check...");
        // Show only last 4 digits for security
        System.out.println("Card ending in " + cardNumber.substring(cardNumber.length() - 4) + " charged $" + amount + " [APPROVED]");
    }
}