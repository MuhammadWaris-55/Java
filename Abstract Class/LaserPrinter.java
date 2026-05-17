public class LaserPrinter extends Printer{
    private String tonertype;
    private Boolean duplexmode;
    private Boolean scanner;

    public LaserPrinter(String tonnertype, Boolean duplexmode , Boolean scanner , String Serial, String model, int price , short ppm){
        super(Serial,model,price,ppm);
        this.tonertype = tonnertype;
        this.duplexmode = duplexmode;
        this.scanner = scanner;

    }
        public void print(){
            System.out.println("Hello");
        }
        public void refill(){
            System.out.println("hello again");
        }
}