public class CryptoWalletProcessor implements PaymentProcessor {

    private String walletAddress; // Destination wallet address for the transaction

    public CryptoWalletProcessor(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("CryptoWalletProcessor: Sending $" + amount + " to wallet: " + walletAddress);
        System.out.println("Status: PENDING - Awaiting blockchain callback...");
    }
}