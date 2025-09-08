package JavaConstructors.Level1;

public class q2 {
    static class Circle {
        double radius;

        // Default constructor (uses constructor chaining)
        Circle() {
            this(1.0); // calls parameterized constructor with default radius = 1.0
        }

        // Parameterized constructor
        Circle(double radius) {
            this.radius = radius;
        }

        void display() {
            System.out.println("Radius: " + radius);
            System.out.println("Area: " + (Math.PI * radius * radius));
            System.out.println("Circumference: " + (2 * Math.PI * radius));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();       // default constructor
        c1.display();

        Circle c2 = new Circle(5.5);    // parameterized constructor
        c2.display();
    }
}
