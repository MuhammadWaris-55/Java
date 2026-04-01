// Generics in Java means making a class or method work with different data types while still keeping type safety.

// In this code, M is a generic type variable. It means the class can store any type of object like Double, Character, String, Integer, or Student.

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }
}


public class Generics<M>  // symbol <> variable M
{
    M o; // refernce name of T is o;

    public Generics(M o) {
        this.o = o;
    }

    public M getob() {
        return o;
    }

    public static void main(String[] args) {
        Double dOb = new Double(100.25);
        Generics<Double> agen1 = new Generics<>(dOb);
        double d = agen1.getob();// no need to expilicitly cast dOb to Double
        System.out.println("DOUBLE: " + d);

        Character cOb = new Character('a');
        Generics<Character> agen2 = new Generics<>(cOb);
        char c = agen2.getob();
        System.out.println("CHARACTER: " + c);
        //agen1=agen2; // incompatible types error
        //hw make string make integer object and 1 student class object then set data and compare data

        String sOb = new String("i am a string object");
        Generics<String> agen3 = new Generics<>(sOb);
        String s = agen3.getob();
        System.out.println("STRING: " + s);

        Integer iOb = new Integer(12);
        Generics<Integer> agen4 = new Generics<>(iOb);
        int i = agen4.getob();
        System.out.println("INTEGER: " + i);

        Student stOb = new Student("Waris", 19);
        Generics<Student> agen5 = new Generics<>(stOb);
        Student st = agen5.getob();
        System.out.println("STUDENT: " + st);
    }
}