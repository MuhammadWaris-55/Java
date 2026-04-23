public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", "m5 cs" , 60);
        v1.display();
        Car c1 = new Car("Mercedes" , "c63" , 66 , 4);
        c1.display();
        MotorBike m1 = new MotorBike("Kawasaki" , "H2r" , 20 , false);
        m1.display();
        Car c2 = new Car(c1); // Copy constructor — c2 is a copy of c1
        c2.display();
    }
}