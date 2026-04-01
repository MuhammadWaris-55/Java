import java.io.*;
public class ObjectWrite {
    public static class Person implements Serializable{
        public String name = null;
        public int age = 0;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Writing objects to file
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("person.bin"));

        Person person = new Person();
        person.name = "Ali";
        person.age = 40;

        Person person1 = new Person();
        person1.name = "Hamza";
        person1.age = 30;

        objectOutputStream.writeObject(person);
        objectOutputStream.writeObject(person1);

        objectOutputStream.close();

        // Reading objects from file
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("person.bin"));

        try {
            while (true) {
                Person personRead = (Person) objectInputStream.readObject();
                System.out.println(personRead.name);
                System.out.println(personRead.age);
            }
        } catch (EOFException e) {
            System.err.println("End of File!");
        }

        objectInputStream.close();
    }
}
