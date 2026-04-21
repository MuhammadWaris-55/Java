public class Vehicle {
    protected String brand;
    protected String model;
    protected float fueltank;

    public Vehicle(String brand , String model , float fueltank){
        this.brand = brand;
        this.model = model;
        this.fueltank = fueltank;
    }
    public void drive(){
        System.out.println("The vehicle is in drive mode");
    }
    public void display(){
        System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("Fuel Capacity is " + fueltank);
    }
}
