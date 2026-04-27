public class DigitalGood extends CustomerOrder {

    private String downloadLink;

    public DigitalGood(String orderID, double subtotalAmount, String downloadLink) {
        super(orderID, subtotalAmount);
        this.downloadLink = downloadLink;
    }

    @Override
    public void calculateTotalWithFees() {
        double digitalTax = getSubtotalAmount() * 0.05;
        double total = getSubtotalAmount() + digitalTax;
        System.out.println("Digital Good - Download Link: " + downloadLink);
        System.out.println("Subtotal: $" + getSubtotalAmount() + " + Digital Tax (5%): $" + digitalTax + " = Total: $" + total);
        setSubtotalAmount(total);
    }

    public String getDownloadLink() {
        return downloadLink;
    }
}