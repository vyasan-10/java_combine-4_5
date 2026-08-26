// Parent Class
class Shape {
    String color = "Red";

    void displayColor() {
        System.out.println("The color of this shape is: " + color);
    }
}

// Child Class 1
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
}

// Child Class 2
class Square extends Shape {
    double side;

    // Constructor
    Square(double s) {
        side = s;
    }

    void calculateArea() {
        double area = side * side;
        System.out.println("Area of the Square: " + area);
    }
}

// Main Class
public class HierarchicalDemo {
    public static void main(String[] args) {
        System.out.println("--- Circle ---");
        Circle c = new Circle(5.0);   // pass radius
        c.displayColor();             // inherited from Shape
        c.calculateArea();            // Circle-specific

        System.out.println("\n--- Square ---");
        Square s = new Square(4.0);   // pass side length
        s.displayColor();             // inherited from Shape
        s.calculateArea();            // Square-specific
    }
}
