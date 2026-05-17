//Car Class
class Car extends Vehicleinfo{
    int NOofdoors;

    Car(String modelname , int NOofdoors){
        super(modelname);
        this.NOofdoors = NOofdoors;
    }

    public void fueltank(){
        System.out.println("The Fuel Tank is of 50litres");
    }
    public void speed(){
        System.out.println("The Maximum speed of car is 400km/h");
    }
    public void type(){
        System.out.println("Type: Car");
    }
    public void extrafeature(){
        System.out.println("No Of Doors : " + NOofdoors);
    }
}