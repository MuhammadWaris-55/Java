public class MotorBike extends Vehicle{
    private boolean hassidecar;

    public MotorBike(String brand , String model , float fueltank , boolean hassidecar){
        super(brand , model , fueltank);
        this.hassidecar = hassidecar;
    }
    public void drive(){
        System.out.println("Bike is ready for a ride");
    }
    public void popwheelie(){
        System.out.println("The biker ios popping a wheelie");
    }
    public void display(){
        super.display();
        System.out.println("The bike has a side car? " + hassidecar);
    }
}
