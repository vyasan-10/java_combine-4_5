class Circle {
    double radius, area;

    Circle(double r) {
        radius = r;
        area = 3.1416 * r * r;
    }
}

public class CircleDemo {
    static Circle getCircle(double r) {
        return new Circle(r);
    }

    public static void main(String[] args) {
        Circle c = getCircle(7);
        System.out.println("Radius = " + c.radius + " Area = " + c.area);
    }
}
