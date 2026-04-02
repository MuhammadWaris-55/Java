public class GenericsMultiVar<T, U> {
    private T firstItem;
    private U secondItem;

//    Constructor
    public GenericsMultiVar(T firstItem, U secondItem){
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public void DisplayType(){
        System.out.println("Item 1 is a: " + firstItem.getClass().getName());
        System.out.println("Item 2 is a: " + secondItem.getClass().getName());
        System.out.println("Item 1 value: " + firstItem);
        System.out.println("Item 2 value: " + secondItem);
    }

//    Getters
    public T getFirstItem(){return firstItem;}
    public U getSecondItem() {return secondItem;}

    public static void main(String[] args) {
//        Here T is String and U is Integer
        GenericsMultiVar<String, Integer> person = new GenericsMultiVar<>("Waris" , 20);

//        Here T is Double and U is Boolean
        GenericsMultiVar<Double, Boolean> sensorData = new GenericsMultiVar<>(99.9 , true);
        System.out.println("Person:");
        person.DisplayType();
        System.out.println("\nSensor Data:");
        sensorData.DisplayType();
    }
}
