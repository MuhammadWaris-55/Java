class Box<T>{

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Genericss {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setValue("Waris Codes");
        String s = box1.getValue();
        System.out.println(s);
    }
}
