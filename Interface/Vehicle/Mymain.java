//Main class
public class Mymain {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Car Details");
        car.fueltank();
        car.model();
        car.speed();
        car.type();

        Motorbike bike = new Motorbike();
        System.out.println("Bike Details");
        bike.fueltank();
        bike.model();
        bike.speed();
        bike.type();
    }
}
