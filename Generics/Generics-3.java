import java.util.ArrayList;
import java.util.List;

public class GenericBox<T> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    // Generic method with bounded type parameter
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }

    // Generic method with a list
    public static <T> List<T> repeat(T item, int times) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < times; i++) result.add(item);
        return result;
    }

    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>(42);
        GenericBox<String> strBox = new GenericBox<>("Hello");

        System.out.println(intBox.get());           // 42
        System.out.println(strBox.get());           // Hello
        System.out.println(max(10, 25));            // 25
        System.out.println(max("apple", "mango"));  // mango
        System.out.println(repeat("hi", 3));        // [hi, hi, hi]
    }
}