public class CreditCardProcessor implements PaymentProcessor {

    private String cardNumber;

    public CreditCardProcessor(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("CreditCardProcessor: Authorizing via bank check...");
        System.out.println("Card ending in " + cardNumber.substring(cardNumber.length() - 4) + " charged $" + amount + " [APPROVED]");
    }
}