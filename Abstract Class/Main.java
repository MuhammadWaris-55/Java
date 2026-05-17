public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism: parent reference, child object
//        Printer p1 = new LaserPrinter();
        Printer p2 = new InkjetPrinter("SN-002", "Canon PIXMA", 12000, (short) 15, "Tri-Color Ink");

        Printer[] printers = { p2 };

        for (Printer p : printers) {
            p.print();   // JVM calls correct version at runtime
            p.refill();
            System.out.println();
        }
    }
}