public class Main {
    public static void main(String[] args) {

        CheckoutController controller = new CheckoutController();

        System.out.println("========== ORDER 1: Physical Product + Credit Card ==========");
        CustomerOrder order1 = new PhysicalProduct("ORD-1001", 89.99, "123 Main St, Karachi");
        controller.startCheckout(order1, new CreditCardProcessor("1234567812345678"));

        System.out.println("========== ORDER 2: Digital Good + Crypto Wallet ==========");
        CustomerOrder order2 = new DigitalGood("ORD-1002", 49.99, "https://downloads.store.com/file123");
        controller.startCheckout(order2, new CryptoWalletProcessor("0xABC123DEF456"));

        System.out.println("========== ORDER 3: Physical Product + Crypto Wallet ==========");
        CustomerOrder order3 = new PhysicalProduct("ORD-1003", 199.99, "456 Elm Street, Lahore");
        controller.startCheckout(order3, new CryptoWalletProcessor("0xDEADBEEF9999"));
    }
}