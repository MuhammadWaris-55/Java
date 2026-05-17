//Main class
public class Mymain {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4);

        System.out.println(" Car Details");
        car.type();
        car.model();
        car.fueltank();
        car.speed();
        car.extrafeature();

        System.out.println();

        Motorbike bike = new Motorbike("Ninja H2R");

        System.out.println("Bike Details");
        bike.type();
        bike.model();
        bike.fueltank();
        bike.speed();
        bike.extrafeature();
    }
}
