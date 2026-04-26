import java.util.*;
import java.util.function.Function;

// Generic Pair class
class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() { return first; }
    public B getSecond() { return second; }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

// Generic Stack
class Stack<T> {
    private List<T> items = new ArrayList<>();

    public void push(T item) { items.add(item); }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return items.remove(items.size() - 1);
    }

    public T peek() { return items.get(items.size() - 1); }
    public boolean isEmpty() { return items.isEmpty(); }
    public int size() { return items.size(); }
}

// Generic utility methods
class Utils {
    // Transform a list using a function
    public static <T, R> List<R> map(List<T> list, Function<T, R> fn) {
        List<R> result = new ArrayList<>();
        for (T item : list) result.add(fn.apply(item));
        return result;
    }

    // Filter list by condition
    public static <T> List<T> filter(List<T> list, Function<T, Boolean> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : list) if (predicate.apply(item)) result.add(item);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        // Pair with two different types
        Pair<String, Integer> person = new Pair<>("Alice", 30);
        System.out.println(person);  // (Alice, 30)

        // Generic Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());   // 3
        System.out.println(stack.peek());  // 2

        // map: square each number
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squared = Utils.map(nums, x -> x * x);
        System.out.println(squared);  // [1, 4, 9, 16, 25]

        // filter: keep only evens
        List<Integer> evens = Utils.filter(nums, x -> x % 2 == 0);
        System.out.println(evens);  // [2, 4]

        // map: convert numbers to strings
        List<String> strs = Utils.map(nums, x -> "num" + x);
        System.out.println(strs);  // [num1, num2, num3, num4, num5]
    }
}