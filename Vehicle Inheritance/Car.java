public class Car extends Vehicle{
    private int NoofDoors;
    public Car(String brand , String model , float fueltank , int NoofDoors){
        super(brand, model, fueltank); // Initialize Vehicle fields
        this.NoofDoors = NoofDoors;
    }
    public Car(Car x){
        super(x.brand , x.model , x.fueltank); // Copy constructor using parent fields
        this.NoofDoors = x.NoofDoors;
    }
    public void drive(){
        System.out.println("The Car is Been Driven");
    }
    public void opentrunk(){
        System.out.println("The trunk of car is open");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The No of Doors are: " + NoofDoors);
    }
}