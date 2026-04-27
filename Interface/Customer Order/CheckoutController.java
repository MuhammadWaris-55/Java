import java.util.ArrayList;
import java.util.List;

public class CheckoutController {

    private List<CustomerOrder> activeCheckoutQueue;

    public CheckoutController() {
        this.activeCheckoutQueue = new ArrayList<>();
    }

    public void startCheckout(CustomerOrder order, PaymentProcessor method) {
        activeCheckoutQueue.add(order);

        System.out.println(">> CheckoutController: Order [" + order.getOrderID() + "] added to queue. Queue size: " + activeCheckoutQueue.size());

        order.setPaymentProcessor(method);

        order.calculateTotalWithFees();

        order.processCheckout();

        activeCheckoutQueue.remove(order);
        System.out.println(">> CheckoutController: Order [" + order.getOrderID() + "] removed from queue. Queue size: " + activeCheckoutQueue.size() + "\n");
    }

    public List<CustomerOrder> getActiveCheckoutQueue() {
        return activeCheckoutQueue;
    }
}