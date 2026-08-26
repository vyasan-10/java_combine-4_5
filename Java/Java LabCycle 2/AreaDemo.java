class Area {
    int area(int side) {
        return side * side;
    }
    int area(int l, int b) {
        return l * b;
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Area of Square = " + a.area(6));
        System.out.println("Area of Rectangle = " + a.area(8, 4));
    }
}
