//MotorBike class
class Motorbike extends Vehicleinfo{
    Motorbike(String modelname){
        super(modelname);
    }

    public void fueltank() {
        System.out.println("The Fuel tank is 15 litres");
    }
    public void speed(){
        System.out.println("The maximum speed is 150 km/h");
    }
    public void type(){
        System.out.println("Type: MotorBike");
    }
    public void extrafeature(){
        System.out.println("Its a Heavy Bike");
    }
}