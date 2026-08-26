class Rect {
    int length, breadth;

    Rect() {
        length = 1;
        breadth = 1;
    }

    Rect(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Rect(8, 5);

        System.out.println("Rectangle 1 Area = " + r1.area());
        System.out.println("Rectangle 2 Area = " + r2.area());
    }
}
