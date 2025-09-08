package JavaConstructors.Level1;

public class q3 {
    static class Person {
        String name;
        int age;

        // Default constructor
        Person() {
            this.name = "Unknown";
            this.age = 0;
        }

        // Parameterized constructor
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Copy constructor
        Person(Person other) {
            this.name = other.name;
            this.age = other.age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Abhinav", 20);  // parameterized constructor
        Person p2 = new Person(p1);             // copy constructor

        System.out.println("Original Person:");
        p1.display();

        System.out.println("Cloned Person:");
        p2.display();
    }
}
