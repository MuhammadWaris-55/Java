public abstract class Printer{
    protected String Serial;
    protected String model;
    protected int price;
    protected short ppm;

    public Printer(String Serial, String model, int price , short ppm){
        this.Serial = Serial;
        this.model = model;
        this.price = price;
        this.ppm = ppm;
    }

    public abstract void print();
    public abstract void refill();
}