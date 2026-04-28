public abstract class CustomerOrder {

    private String orderID;
    private double subtotalAmount;
    private PaymentProcessor currentProcessor; // Strategy for processing payment

    public CustomerOrder(String orderID, double subtotalAmount) {
        this.orderID = orderID;
        this.subtotalAmount = subtotalAmount;
    }

    public void setPaymentProcessor(PaymentProcessor method) {
        this.currentProcessor = method;
    }

    public String getOrderID() {
        return orderID;
    }

    public abstract void calculateTotalWithFees(); // Subclasses define their own fee logic

    // final prevents subclasses from overriding the checkout flow
    public final void processCheckout() {
        System.out.println("=== Starting Checkout for Order: " + orderID + " ===");
        validateOrder();
        calculateTotalWithFees();
        if (currentProcessor != null) {
            currentProcessor.processPayment(subtotalAmount);
        } else {
            System.out.println("WARNING: No payment processor set!");
        }
        System.out.println("=== Checkout Complete ===\n");
    }

    protected void validateOrder() {
        if (subtotalAmount <= 0) {
            throw new IllegalStateException("Subtotal must be greater than zero.");
        }
        System.out.println("Order valid. Subtotal: $" + subtotalAmount);
    }

    public double getSubtotalAmount() {
        return subtotalAmount;
    }

    protected void setSubtotalAmount(double subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }
}