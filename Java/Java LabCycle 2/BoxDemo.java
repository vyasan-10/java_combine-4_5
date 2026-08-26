class Box {
    int l, b, h;

    Box(int l, int b, int h) {
        this.l = l; this.b = b; this.h = h;
    }

    int volume() {
        return l * b * h;
    }
}

public class BoxDemo {
    static void compare(Box b1, Box b2) {
        if(b1.volume() > b2.volume())
            System.out.println("Larger Box Volume = " + b1.volume());
        else
            System.out.println("Larger Box Volume = " + b2.volume());
    }

    public static void main(String[] args) {
        Box b1 = new Box(3,4,5);
        Box b2 = new Box(5,4,6);
        compare(b1,b2);
    }
}
