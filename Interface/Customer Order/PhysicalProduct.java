public class PhysicalProduct extends CustomerOrder {

    private String shippingAddress;

    public PhysicalProduct(String orderID, double subtotalAmount, String shippingAddress) {
        super(orderID, subtotalAmount);
        this.shippingAddress = shippingAddress;
    }

    @Override
    public void calculateTotalWithFees() {
        double shippingCost = 10.00;
        double total = getSubtotalAmount() + shippingCost;
        System.out.println("Physical Product - Shipping to: " + shippingAddress);
        System.out.println("Subtotal: $" + getSubtotalAmount() + " + Shipping: $" + shippingCost + " = Total: $" + total);
        setSubtotalAmount(total);
    }

    public String getShippingAddress() {
        return shippingAddress;
    }
}