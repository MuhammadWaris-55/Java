//Abstract class
abstract class Vehicleinfo implements Vehicle{
    String modelname;

    Vehicleinfo(String modelname){
        this.modelname = modelname;
    }
    public void model(){
        System.out.println("Model: " + modelname);
    }
    abstract void extrafeature();
}