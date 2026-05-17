public class InkjetPrinter extends Printer {

    private String cartridgeType;

    public InkjetPrinter(String Serial, String model, int price , short ppm, String cartridgeType) {
        super(Serial,model,price,ppm);
        this.cartridgeType = cartridgeType;
    }

    public void print() {
        System.out.println("InkjetPrinter printing...");
    }

    public void refill() {
        System.out.println("InkjetPrinter refilling cartridge: ");
    }
}